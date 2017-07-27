package com.sparkling18.rest.client.server.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * email address representation
 **/
@ApiModel(description = "email address representation")
public class Email  {
  
  private String address = null;
  private Boolean valid = null;

  
  /**
   * email address, RFC2822 section 3.4 format
   **/
  @ApiModelProperty(required = true, value = "email address, RFC2822 section 3.4 format")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * user has validated his email address
   **/
  @ApiModelProperty(required = true, value = "user has validated his email address")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    
    sb.append("  address: ").append(address).append("\n");
    sb.append("  valid: ").append(valid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
