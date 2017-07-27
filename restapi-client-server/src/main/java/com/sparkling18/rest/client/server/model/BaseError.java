package com.sparkling18.rest.client.server.model;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
* Error model
**/
@ApiModel(description = "Error model")
public class BaseError  {

  private String code = null;
  private String message = null;


  /**
  * Machine readable error code
  **/
  @ApiModelProperty(required = true, value = "Machine readable error code")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  /**
  * Human readable, localized error message.
  **/
  @ApiModelProperty(required = true, value = "Human readable, localized error message.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString()  {
  StringBuilder sb = new StringBuilder();
    sb.append("class BaseError {\n");

    sb.append("  code: ").append(code).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}