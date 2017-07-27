package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Amount;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Order Shipping information
 **/
@ApiModel(description = "Order Shipping information")
public class OrderShippingInfo  {
  
  private Amount cost = null;
  private String notes = null;

  
  /**
   * Amount of shipping costs
   **/
  @ApiModelProperty(required = true, value = "Amount of shipping costs")
  @JsonProperty("cost")
  public Amount getCost() {
    return cost;
  }
  public void setCost(Amount cost) {
    this.cost = cost;
  }

  
  /**
   * Details on shipping
   **/
  @ApiModelProperty(required = true, value = "Details on shipping")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderShippingInfo {\n");
    
    sb.append("  cost: ").append(cost).append("\n");
    sb.append("  notes: ").append(notes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
