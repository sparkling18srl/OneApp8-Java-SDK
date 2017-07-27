package com.sparkling18.rest.client.server.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Amount entity representation
 **/
@ApiModel(description = "Amount entity representation")
public class Amount  {
  
  private String currency = null;
  private Long amount = null;
  private Long decimalDigits = null;

  
  /**
   * ISO 4217 currency code, see http://en.wikipedia.org/wiki/ISO_4217
   **/
  @ApiModelProperty(required = true, value = "ISO 4217 currency code, see http://en.wikipedia.org/wiki/ISO_4217")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   * Number representing the amount, without decimals separator
   **/
  @ApiModelProperty(required = true, value = "Number representing the amount, without decimals separator")
  @JsonProperty("amount")
  public Long getAmount() {
    return amount;
  }
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("decimalDigits")
  public Long getDecimalDigits() {
    return decimalDigits;
  }
  public void setDecimalDigits(Long decimalDigits) {
    this.decimalDigits = decimalDigits;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  decimalDigits: ").append(decimalDigits).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
