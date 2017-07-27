package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.EntityInfo;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Input data for wallet payment request
 **/
@ApiModel(description = "Input data for wallet payment request")
public class WalletPayment  {
  
  private EntityInfo order = null;
  private String walletId = null;

  
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
   * The wallet ID binded to thie Credit Card
   **/
  @ApiModelProperty(required = true, value = "The wallet ID binded to thie Credit Card")
  @JsonProperty("walletId")
  public String getWalletId() {
    return walletId;
  }
  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletPayment {\n");
    
    sb.append("  order: ").append(order).append("\n");
    sb.append("  walletId: ").append(walletId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
