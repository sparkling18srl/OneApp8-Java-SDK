package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Amount;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * CouponCard entity representation
 **/
@ApiModel(description = "CouponCard entity representation")
public class CouponCard  {
  
  private String holder = null;
  private String number = null;
  private Amount value = null;
  private Float percent = null;

  
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
   * Coupon discount value (amount)
   **/
  @ApiModelProperty(value = "Coupon discount value (amount)")
  @JsonProperty("value")
  public Amount getValue() {
    return value;
  }
  public void setValue(Amount value) {
    this.value = value;
  }

  
  /**
   * Coupon discount percent as a floating point number (1.0 = 100%, 0.5 = 50%, etc)
   **/
  @ApiModelProperty(value = "Coupon discount percent as a floating point number (1.0 = 100%, 0.5 = 50%, etc)")
  @JsonProperty("percent")
  public Float getPercent() {
    return percent;
  }
  public void setPercent(Float percent) {
    this.percent = percent;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponCard {\n");
    
    sb.append("  holder: ").append(holder).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  percent: ").append(percent).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
