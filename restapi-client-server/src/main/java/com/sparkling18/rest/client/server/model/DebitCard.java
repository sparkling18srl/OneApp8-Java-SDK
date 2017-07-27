package com.sparkling18.rest.client.server.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * DebitCard entity representation
 **/
@ApiModel(description = "DebitCard entity representation")
public class DebitCard  {
  
  private String holder = null;
  private String pan = null;

  
  /**
   * Holder, as printed on the card
   **/
  @ApiModelProperty(value = "Holder, as printed on the card")
  @JsonProperty("holder")
  public String getHolder() {
    return holder;
  }
  public void setHolder(String holder) {
    this.holder = holder;
  }

  
  /**
   * PAN number
   **/
  @ApiModelProperty(required = true, value = "PAN number")
  @JsonProperty("pan")
  public String getPan() {
    return pan;
  }
  public void setPan(String pan) {
    this.pan = pan;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebitCard {\n");
    
    sb.append("  holder: ").append(holder).append("\n");
    sb.append("  pan: ").append(pan).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
