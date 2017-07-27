package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.UserInfo;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * UserUpdate entity representation
 **/
@ApiModel(description = "UserUpdate entity representation")
public class UserUpdate  {
  
  private UserInfo info = null;

  
  /**
   * User detailed information
   **/
  @ApiModelProperty(required = true, value = "User detailed information")
  @JsonProperty("info")
  public UserInfo getInfo() {
    return info;
  }
  public void setInfo(UserInfo info) {
    this.info = info;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdate {\n");
    
    sb.append("  info: ").append(info).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
