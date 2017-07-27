package com.sparkling18.rest.client.server.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * phone number representation
 **/
@ApiModel(description = "phone number representation")
public class Phone  {
  
  private String number = null;
  private String country = null;
  private Boolean valid = null;

  
  /**
   * phone number, only digits, without international prefix
   **/
  @ApiModelProperty(required = true, value = "phone number, only digits, without international prefix")
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  
  /**
   * country, ISO-3166 Alpha-2 Country Code, see http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
   **/
  @ApiModelProperty(required = true, value = "country, ISO-3166 Alpha-2 Country Code, see http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * user has validated his phone number
   **/
  @ApiModelProperty(value = "user has validated his phone number")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    
    sb.append("  number: ").append(number).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  valid: ").append(valid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
