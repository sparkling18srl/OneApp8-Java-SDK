package com.sparkling18.rest.client.server.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Discount object
 **/
@ApiModel(description = "Discount object")
public class Discount  {
  
  private String currency = null;
  private Float percent = null;

  
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
   * discount percent as a floating point number (1.0 = 100%, 0.5 = 50%, etc)
   **/
  @ApiModelProperty(required = true, value = "discount percent as a floating point number (1.0 = 100%, 0.5 = 50%, etc)")
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
    sb.append("class Discount {\n");
    
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  percent: ").append(percent).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
