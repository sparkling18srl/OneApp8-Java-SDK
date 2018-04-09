package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.EntityInfo;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * Input data for token payment request
 **/
@ApiModel(description = "Input data for token payment request")
public class TokenPayment  {
  
  private EntityInfo order = null;
  private String token = null;

  
  /**
   * Order entity reference
   **/
  @ApiModelProperty(required = true, value = "Order entity reference")
  @JsonProperty("order")
  public EntityInfo getOrder() {
    return order;
  }
  public void setOrder(EntityInfo order) {
    this.order = order;
  }

  
  /**
   * The token binded to thie Credit Card
   **/
  @ApiModelProperty(required = true, value = "The token binded to thie Credit Card")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenPayment {\n");
    
    sb.append("  order: ").append(order).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


