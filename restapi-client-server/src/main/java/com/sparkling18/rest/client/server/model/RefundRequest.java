package com.sparkling18.rest.client.server.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * Refund Request resource representation
 **/
@ApiModel(description = "Refund Request resource representation")
public class RefundRequest {
  
  private Amount amountToRefund = null;

  
  /**
   * Amount of the payment
   **/
  @ApiModelProperty(value = "Amount of the payment")
  @JsonProperty("amountToRefund")
  public Amount getAmountToRefund() {
    return amountToRefund;
  }
  public void setAmountToRefund(Amount amountToRefund) {
    this.amountToRefund = amountToRefund;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundRequest {\n");
    
    sb.append("  amountToRefund: ").append(amountToRefund).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


