package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Amount;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * GiftCard entity representation
 **/
@ApiModel(description = "GiftCard entity representation")
public class GiftCard  {
  
  private String holder = null;
  private String number = null;
  private Amount amount = null;

  
  /**
   * Holder full name, as printed on the card
   **/
  @ApiModelProperty(required = true, value = "Holder full name, as printed on the card")
  @JsonProperty("holder")
  public String getHolder() {
    return holder;
  }
  public void setHolder(String holder) {
    this.holder = holder;
  }

  
  /**
   * Card number, as printed on the card
   **/
  @ApiModelProperty(required = true, value = "Card number, as printed on the card")
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  
  /**
   * Card balance
   **/
  @ApiModelProperty(value = "Card balance")
  @JsonProperty("amount")
  public Amount getAmount() {
    return amount;
  }
  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiftCard {\n");
    
    sb.append("  holder: ").append(holder).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
