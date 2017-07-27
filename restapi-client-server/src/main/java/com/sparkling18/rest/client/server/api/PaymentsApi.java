package com.sparkling18.rest.client.server.api;

import com.sparkling18.rest.client.server.ApiException;
import com.sparkling18.rest.client.server.ApiInvoker;

import com.sparkling18.rest.client.server.model.*;
import com.sparkling18.rest.client.server.util.Proxy;

import java.util.*;
import java.security.*;

import com.sparkling18.rest.client.server.model.ResultListPayment;
import com.sparkling18.rest.client.server.model.Error;
import com.sparkling18.rest.client.server.model.Payment;
import com.sparkling18.rest.client.server.model.WalletPayment;
import com.sparkling18.rest.client.server.model.SettlementData;
import com.sparkling18.rest.client.server.model.ResultListTransaction;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class PaymentsApi {
  String basePath = "https://api.test.sparkling18.com/v1/server";
  private ApiInvoker apiInvoker;
  private PrivateKey privateKey;
  private PublicKey publicKey;
  private String keyId;
  private Proxy proxy;

  private PaymentsApi(){}

  public PaymentsApi(String keyId, PrivateKey privateKey, PublicKey publicKey) {
    this.keyId = keyId;
    this.privateKey = privateKey;
    this.publicKey = publicKey;
    apiInvoker = new ApiInvoker(this.keyId, this.privateKey, this.publicKey);
  }

  public PaymentsApi(String keyId, PrivateKey privateKey, PublicKey publicKey, Proxy proxy) {
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
   * get a list of payments
   * Returns all payments
   * @param offset item offset
   * @param pageSize number of items per page
   * @param orderOn field to order on
   * @param ascending true if ordering should be ascending
   * @param externalId Filter resources based on externalId exact match
   * @param registerId The id of the register used to filter the results
   * @param storeId The id of the store used to filter the results
   * @param merchantId The id of the merchant used to filter the results
   * @param merchantOrderId The id of the merchant order
   * @return ResultListPayment
   */
  public ResultListPayment getPaymentList (Long offset, Long pageSize, String orderOn, Boolean ascending, String externalId, Long registerId, Long storeId, Long merchantId, String merchantOrderId) throws ApiException, SecurityException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/payments".replaceAll("\\{format\\}","json");

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
    if (registerId != null)
      queryParams.put("registerId", ApiInvoker.parameterToString(registerId));
    if (storeId != null)
      queryParams.put("storeId", ApiInvoker.parameterToString(storeId));
    if (merchantId != null)
      queryParams.put("merchantId", ApiInvoker.parameterToString(merchantId));
    if (merchantOrderId != null)
      queryParams.put("merchantOrderId", ApiInvoker.parameterToString(merchantOrderId));
    
    
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
        return (ResultListPayment) ApiInvoker.deserialize(response, "", ResultListPayment.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Submit a Wallet Payment
   * Initialize a transaction process and try to authorize with the Credit Card data binded with the wallet ID
   * @param walletPayment WalletPayment entity
   * @return Payment
   */
  public Payment walletPayment (WalletPayment walletPayment) throws ApiException, SecurityException {
    Object postBody = walletPayment;
    

    // create path and map variables
    String path = "/payments/wallet/moto".replaceAll("\\{format\\}","json");

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
        return (Payment) ApiInvoker.deserialize(response, "", Payment.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * get a single payment
   * Returns one payment
   * @param id entity id
   * @return Payment
   */
  public Payment getPayment (Long id) throws ApiException, SecurityException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/payments/{id}".replaceAll("\\{format\\}","json")
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
        return (Payment) ApiInvoker.deserialize(response, "", Payment.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * cancel the whole payment
   * cancel the payment, including associated transactions
   * @param id entity id
   * @return void
   */
  public void cancel (Long id) throws ApiException, SecurityException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/payments/{id}/cancel".replaceAll("\\{format\\}","json")
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
  
  /**
   * executes payment settlement setup for accounting
   * Returns transactions list
   * @param id entity id
   * @param settlementData settlement data
   * @return ResultListTransaction
   */
  public ResultListTransaction settlementSetup (Long id, SettlementData settlementData) throws ApiException, SecurityException {
    Object postBody = settlementData;
    

    // create path and map variables
    String path = "/payments/{id}/settlement".replaceAll("\\{format\\}","json")
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
        return (ResultListTransaction) ApiInvoker.deserialize(response, "", ResultListTransaction.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * get transactions for the payment
   * Returns transactions list
   * @param id entity id
   * @return ResultListTransaction
   */
  public ResultListTransaction getPaymentTransactions (Long id) throws ApiException, SecurityException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/payments/{id}/transactions".replaceAll("\\{format\\}","json")
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
        return (ResultListTransaction) ApiInvoker.deserialize(response, "", ResultListTransaction.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
