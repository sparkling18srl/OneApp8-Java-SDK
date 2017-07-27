package com.sparkling18.rest.client.server.api;

import com.sparkling18.rest.client.server.ApiException;
import com.sparkling18.rest.client.server.ApiInvoker;

import com.sparkling18.rest.client.server.model.*;
import com.sparkling18.rest.client.server.util.Proxy;

import java.util.*;
import java.security.*;

import com.sparkling18.rest.client.server.model.ResultListOrder;
import com.sparkling18.rest.client.server.model.Error;
import com.sparkling18.rest.client.server.model.Order;
import com.sparkling18.rest.client.server.model.OrderCreate;
import com.sparkling18.rest.client.server.model.CustomInfo;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class OrdersApi {
  String basePath = "https://api.test.sparkling18.com/v1/server";
  private ApiInvoker apiInvoker;
  private PrivateKey privateKey;
  private PublicKey publicKey;
  private String keyId;
  private Proxy proxy;

  private OrdersApi(){}

  public OrdersApi(String keyId, PrivateKey privateKey, PublicKey publicKey) {
    this.keyId = keyId;
    this.privateKey = privateKey;
    this.publicKey = publicKey;
    apiInvoker = new ApiInvoker(this.keyId, this.privateKey, this.publicKey);
  }

  public OrdersApi(String keyId, PrivateKey privateKey, PublicKey publicKey, Proxy proxy) {
    this.keyId = keyId;
    this.privateKey = privateKey;
    this.publicKey = publicKey;
    this.proxy = proxy;
    apiInvoker = new ApiInvoker(this.keyId, this.privateKey, this.publicKey, this.proxy);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setProxy(Proxy proxy) {
    this.proxy = proxy;
    apiInvoker.setProxy(proxy);
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * get a list of orders
   * Returns all orders
   * @param offset item offset
   * @param pageSize number of items per page
   * @param orderOn field to order on
   * @param ascending true if ordering should be ascending
   * @param externalId Filter resources based on externalId exact match
   * @return ResultListOrder
   */
  public ResultListOrder getOrderList (Long offset, Long pageSize, String orderOn, Boolean ascending, String externalId) throws ApiException, SecurityException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/orders".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (offset != null)
      queryParams.put("offset", ApiInvoker.parameterToString(offset));
    if (pageSize != null)
      queryParams.put("pageSize", ApiInvoker.parameterToString(pageSize));
    if (orderOn != null)
      queryParams.put("orderOn", ApiInvoker.parameterToString(orderOn));
    if (ascending != null)
      queryParams.put("ascending", ApiInvoker.parameterToString(ascending));
    if (externalId != null)
      queryParams.put("externalId", ApiInvoker.parameterToString(externalId));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ResultListOrder) ApiInvoker.deserialize(response, "", ResultListOrder.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * create a single order
   * Creates order and returns transaction detail
   * @param order order entity
   * @return Order
   */
  public Order createOrder (OrderCreate order) throws ApiException, SecurityException {
    Object postBody = order;
    

    // create path and map variables
    String path = "/orders".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Order) ApiInvoker.deserialize(response, "", Order.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * get a single order
   * Returns one order
   * @param id entity id
   * @return Order
   */
  public Order getOrder (Long id) throws ApiException, SecurityException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/orders/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Order) ApiInvoker.deserialize(response, "", Order.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Specify a redirect customization for an Order
   * 
   * @param id entity id
   * @param customInfo info to customize redirect
   * @return void
   */
  public void addCheckoutCustomInfo (Long id, CustomInfo customInfo) throws ApiException, SecurityException {
    Object postBody = customInfo;
    

    // create path and map variables
    String path = "/orders/{id}/customInfo".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
