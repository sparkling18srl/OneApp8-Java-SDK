package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.EntityInfo;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * Input data for mobile payment request
 **/
@ApiModel(description = "Input data for mobile payment request")
public class MobilePayment  {
  
  private EntityInfo order = null;
  private String username = null;
  private String externalId = null;

  
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
   * The username of the user that will pay the transaction
   **/
  @ApiModelProperty(required = true, value = "The username of the user that will pay the transaction")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * The externalId of the user that will pay the transaction
   **/
  @ApiModelProperty(required = true, value = "The externalId of the user that will pay the transaction")
  @JsonProperty("externalId")
  public String getExternalId() {return externalId;}
  public void setExternalId(String externalId) {this.externalId = externalId;}


  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobilePayment {\n");
    
    sb.append("  order: ").append(order).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


