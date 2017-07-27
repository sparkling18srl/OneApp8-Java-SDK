package com.sparkling18.rest.client.server;
import com.sparkling18.rest.client.server.filter.*;
import com.sparkling18.rest.client.server.util.ProxyURLConnectionFactory;
import com.sun.jersey.client.urlconnection.HttpURLConnectionFactory;
import com.sun.jersey.client.urlconnection.URLConnectionClientHandler;
import com.fasterxml.jackson.databind.*;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.multipart.FormDataMultiPart;
import javax.ws.rs.core.Response.Status.Family;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Date;
import java.util.TimeZone;
import java.net.URLEncoder;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.*;
import com.sparkling18.rest.client.server.model.Error;
import com.sparkling18.rest.client.server.util.Proxy;
import java.text.SimpleDateFormat;

public class ApiInvoker {
  private Map<String, Client> hostMap = new HashMap<String, Client>();
  private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
  private boolean isDebug = false;
  private PrivateKey privateKey;
  private PublicKey serverPublicKey;
  private String keyId;
  private Proxy proxy;

  public ApiInvoker(String keyId, PrivateKey privateKey, PublicKey serverPublicKey) {
    this.keyId = keyId;
    this.privateKey = privateKey;
    this.serverPublicKey = serverPublicKey;
    addDefaultHeader("User-Agent", "Java-Swagger");
  }

  public ApiInvoker(String keyId, PrivateKey privateKey, PublicKey serverPublicKey, Proxy proxy) {
    this.keyId = keyId;
    this.privateKey = privateKey;
    this.serverPublicKey = serverPublicKey;
    this.proxy = proxy;
    addDefaultHeader("User-Agent", "Java-Swagger");
  }

  /**
   * ISO 8601 date time format.
   * @see https://en.wikipedia.org/wiki/ISO_8601
   */
  public static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

  /**
   * ISO 8601 date format.
   * @see https://en.wikipedia.org/wiki/ISO_8601
   */
  public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

  static {
    // Use UTC as the default time zone.
    DATE_TIME_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
    DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
  }

  public static Date parseDateTime(String str) {
    try {
      return DATE_TIME_FORMAT.parse(str);
    } catch (java.text.ParseException e) {
      throw new RuntimeException(e);
    }
  }

  public static Date parseDate(String str) {
    try {
      return DATE_FORMAT.parse(str);
    } catch (java.text.ParseException e) {
      throw new RuntimeException(e);
    }
  }

  public static String formatDateTime(Date datetime) {
    return DATE_TIME_FORMAT.format(datetime);
  }

  public static String formatDate(Date date) {
    return DATE_FORMAT.format(date);
  }

  public static String parameterToString(Object param) {
    if (param == null) {
      return "";
    } else if (param instanceof Date) {
      return formatDateTime((Date) param);
    } else if (param instanceof Collection) {
      StringBuilder b = new StringBuilder();
      for(Object o : (Collection)param) {
        if(b.length() > 0) {
          b.append(",");
        }
        b.append(String.valueOf(o));
      }
      return b.toString();
    } else {
      return String.valueOf(param);
    }
  }
  public void enableDebug() {
    isDebug = true;
  }

  public void addDefaultHeader(String key, String value) {
     defaultHeaderMap.put(key, value);
  }

  public String escapeString(String str) {
    try{
      return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
    }
    catch(UnsupportedEncodingException e) {
      return str;
    }
  }

  public static Object deserialize(String json, String containerType, Class cls) throws ApiException {
    if(null != containerType) {
        containerType = containerType.toLowerCase();
    }
    try{
      if("list".equals(containerType) || "array".equals(containerType)) {
        JavaType typeInfo = JsonUtil.getJsonMapper().getTypeFactory().constructCollectionType(List.class, cls);
        List response = (List<?>) JsonUtil.getJsonMapper().readValue(json, typeInfo);
        return response;
      }
      else if(String.class.equals(cls)) {
        if(json != null && json.startsWith("\"") && json.endsWith("\"") && json.length() > 1)
          return json.substring(1, json.length() - 2);
        else
          return json;
      }
      else {
        return JsonUtil.getJsonMapper().readValue(json, cls);
      }
    }
    catch (IOException e) {
      throw new ApiException(500, new Error(null,e.getMessage(),null));
    }
  }

  public static String serialize(Object obj) throws ApiException {
    try {
      if (obj != null)
        return JsonUtil.getJsonMapper().writeValueAsString(obj);
      else
        return null;
    }
    catch (Exception e) {
      throw new ApiException(500, new Error(null,e.getMessage(),null));
    }
  }

  public String invokeAPI(String host, String path, String method, Map<String, String> queryParams, Object body, Map<String, String> headerParams, Map<String, String> formParams, String contentType) throws ApiException, SecurityException {
    Client client = getClient(host);

    StringBuilder b = new StringBuilder();

    for(String key : queryParams.keySet()) {
      String value = queryParams.get(key);
      if (value != null){
        if(b.toString().length() == 0)
          b.append("?");
        else
          b.append("&");
        b.append(escapeString(key)).append("=").append(escapeString(value));
      }
    }
    String querystring = b.toString();

    Builder builder = client.resource(host + path + querystring).accept("application/json");
    for(String key : headerParams.keySet()) {
      builder = builder.header(key, headerParams.get(key));
    }

    for(String key : defaultHeaderMap.keySet()) {
      if(!headerParams.containsKey(key)) {
        builder = builder.header(key, defaultHeaderMap.get(key));
      }
    }
    ClientResponse response = null;

    if("GET".equals(method)) {
      response = (ClientResponse) builder.get(ClientResponse.class);
    }
    else if ("POST".equals(method)) {
      if(body == null)
        response = builder.post(ClientResponse.class, null);
      else if(body instanceof FormDataMultiPart) {
        response = builder.type(contentType).post(ClientResponse.class, body);
      }
      else
        response = builder.type(contentType).post(ClientResponse.class, serialize(body));
    }
    else if ("PUT".equals(method)) {
      if(body == null)
        response = builder.put(ClientResponse.class, serialize(body));
      else {
        if("application/x-www-form-urlencoded".equals(contentType)) {
          StringBuilder formParamBuilder = new StringBuilder();

          // encode the form params
          for(String key : formParams.keySet()) {
            String value = formParams.get(key);
            if(value != null && !"".equals(value.trim())) {
              if(formParamBuilder.length() > 0) {
                formParamBuilder.append("&");
              }
              try {
                formParamBuilder.append(URLEncoder.encode(key, "utf8")).append("=").append(URLEncoder.encode(value, "utf8"));
              }
              catch (Exception e) {
                // move on to next
              }
            }
          }
          response = builder.type(contentType).put(ClientResponse.class, formParamBuilder.toString());
        }
        else
          response = builder.type(contentType).put(ClientResponse.class, serialize(body));
      }
    }
    else if ("DELETE".equals(method)) {
      if(body == null)
        response = builder.delete(ClientResponse.class);
      else
        response = builder.type(contentType).delete(ClientResponse.class, serialize(body));
    }
    else {
      throw new ApiException(500, new Error(null, "unknown method type " + method, null));
    }
    if(response.getStatusInfo().getStatusCode() == 204) {
      // no content
      return null;
    }
    else if(response.getStatusInfo().getStatusCode() == 404) {
      // not found
      Error theError = null;
        try {
          String message = String.valueOf(response.getEntity(String.class));
          theError = (Error) deserialize(message, "", Error.class);
        } catch(Exception e) {
          throw new ApiException(response.getStatusInfo().getStatusCode(), new Error(null, "Service not found", null));
        }
      throw new ApiException(response.getStatusInfo().getStatusCode(), theError);
    }
    else if(response.getStatusInfo().getFamily() == Family.SUCCESSFUL) {
      if(response.hasEntity()) {
        return (String) response.getEntity(String.class);
      }
      else {
        return "";
      }
    }
    else {
      String message = String.valueOf(response.getEntity(String.class));
      throw new ApiException(response.getStatusInfo().getStatusCode(), (Error) deserialize(message,"",Error.class));
    }
  }

  private Client getClient(String host) {
    if(!hostMap.containsKey(host)) {
      Client client = null;

      

      if(proxy != null) {
        HttpURLConnectionFactory factory = new ProxyURLConnectionFactory(proxy.getUri(), proxy.getUsername(), proxy.getPassword());
        URLConnectionClientHandler urlConnectionClientHandler = new URLConnectionClientHandler(factory);
        client = new Client(urlConnectionClientHandler);
      } else {
        client = Client.create();
      }

      if(isDebug) {
        client.addFilter(new LoggingFilter());
      }

      client.addFilter(new Spk18SignatureFilter(keyId, privateKey, serverPublicKey));
      hostMap.put(host, client);
    }
    return hostMap.get(host);
  }

  public void setProxy(Proxy proxy) {
    this.proxy = proxy;
    hostMap.clear();
  }

}
