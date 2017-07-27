package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Amount;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * LoyaltyCard entity representation
 **/
@ApiModel(description = "LoyaltyCard entity representation")
public class LoyaltyCard  {
  
  private String holder = null;
  private String number = null;
  private Long points = null;
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
   * Card balance, as points
   **/
  @ApiModelProperty(value = "Card balance, as points")
  @JsonProperty("points")
  public Long getPoints() {
    return points;
  }
  public void setPoints(Long points) {
    this.points = points;
  }

  
  /**
   * Card balance, as credit
   **/
  @ApiModelProperty(value = "Card balance, as credit")
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
    sb.append("class LoyaltyCard {\n");
    
    sb.append("  holder: ").append(holder).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  points: ").append(points).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
