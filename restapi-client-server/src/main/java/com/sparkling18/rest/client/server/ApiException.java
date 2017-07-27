package com.sparkling18.rest.client.server;
import com.sparkling18.rest.client.server.model.Error;

public class ApiException extends Exception {
  int httpCode = 0;
  Error error = null;

  public ApiException() {}

  public ApiException(int httpCode, Error error) {
    this.httpCode = httpCode;
    this.error = error;
  }

  public int getHttpCode() {
    return httpCode;
  }
  
  public void setCode(int httpCode) {
    this.httpCode = httpCode;
  }
  
  public Error getError() {
    return error;
  }
  
  public void setError(Error error) {
    this.error = error;
  }
}