package com.sparkling18.rest.client.server.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Merchant custom information for checkout redirect
 **/
@ApiModel(description = "Merchant custom information for checkout redirect")
public class CustomInfo  {
  
  private String userReturnUrl = null;
  private String customInfo = null;

  
  /**
   * URL to redirect after checkout completion
   **/
  @ApiModelProperty(required = true, value = "URL to redirect after checkout completion")
  @JsonProperty("userReturnUrl")
  public String getUserReturnUrl() {
    return userReturnUrl;
  }
  public void setUserReturnUrl(String userReturnUrl) {
    this.userReturnUrl = userReturnUrl;
  }

  
  /**
   * merchant dependent info for double-check on redirect
   **/
  @ApiModelProperty(value = "merchant dependent info for double-check on redirect")
  @JsonProperty("customInfo")
  public String getCustomInfo() {
    return customInfo;
  }
  public void setCustomInfo(String customInfo) {
    this.customInfo = customInfo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomInfo {\n");
    
    sb.append("  userReturnUrl: ").append(userReturnUrl).append("\n");
    sb.append("  customInfo: ").append(customInfo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
