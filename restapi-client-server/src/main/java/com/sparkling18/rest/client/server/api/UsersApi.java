package com.sparkling18.rest.client.server.api;

import com.sparkling18.rest.client.server.ApiException;
import com.sparkling18.rest.client.server.ApiInvoker;

import com.sparkling18.rest.client.server.model.*;
import com.sparkling18.rest.client.server.util.Proxy;

import java.util.*;
import java.security.*;

import com.sparkling18.rest.client.server.model.User;
import com.sparkling18.rest.client.server.model.Error;
import com.sparkling18.rest.client.server.model.UserCreate;
import com.sparkling18.rest.client.server.model.ResultListUser;
import com.sparkling18.rest.client.server.model.UserUpdate;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class UsersApi {
  String basePath = "https://api.test.sparkling18.com/v1/server";
  private ApiInvoker apiInvoker;
  private PrivateKey privateKey;
  private PublicKey publicKey;
  private String keyId;
  private Proxy proxy;

  private UsersApi(){}

  public UsersApi(String keyId, PrivateKey privateKey, PublicKey publicKey) {
    this.keyId = keyId;
    this.privateKey = privateKey;
    this.publicKey = publicKey;
    apiInvoker = new ApiInvoker(this.keyId, this.privateKey, this.publicKey);
  }

  public UsersApi(String keyId, PrivateKey privateKey, PublicKey publicKey, Proxy proxy) {
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
   * create a user
   * Creates and returns one user
   * @param user user entity
   * @return User
   */
  public User createUser (UserCreate user) throws ApiException, SecurityException {
    Object postBody = user;
    

    // create path and map variables
    String path = "/users".replaceAll("\\{format\\}","json");

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
        return (User) ApiInvoker.deserialize(response, "", User.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * get a list of users with the specified externalId
   * Returns users detail
   * @param merchantId the merchant ID
   * @param externalId the users external id
   * @return ResultListUser
   */
  public ResultListUser getUsersExternal (Long merchantId, String externalId) throws ApiException, SecurityException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/users/external/".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (merchantId != null)
      queryParams.put("merchantId", ApiInvoker.parameterToString(merchantId));
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
        return (ResultListUser) ApiInvoker.deserialize(response, "", ResultListUser.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * get a single user
   * Returns user detail
   * @param id entity id
   * @return User
   */
  public User getUser (Long id) throws ApiException, SecurityException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/users/{id}".replaceAll("\\{format\\}","json")
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
        return (User) ApiInvoker.deserialize(response, "", User.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * update a single user
   * Updates user and returns user detail
   * @param id entity id
   * @param user user update entity
   * @return User
   */
  public User updateUser (Long id, UserUpdate user) throws ApiException, SecurityException {
    Object postBody = user;
    

    // create path and map variables
    String path = "/users/{id}".replaceAll("\\{format\\}","json")
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
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (User) ApiInvoker.deserialize(response, "", User.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * delete a single user
   * Deletes a user
   * @param id entity id
   * @return void
   */
  public void deleteUser (Long id) throws ApiException, SecurityException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/users/{id}".replaceAll("\\{format\\}","json")
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
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
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
