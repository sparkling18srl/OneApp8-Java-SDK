package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Payment;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Result list container
 **/
@ApiModel(description = "Result list container")
public class ResultListPayment  {
  
  private Long total = null;
  private List<Payment> items = new ArrayList<Payment>() ;

  
  /**
   * total number of items
   **/
  @ApiModelProperty(required = true, value = "total number of items")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  
  /**
   * items list
   **/
  @ApiModelProperty(required = true, value = "items list")
  @JsonProperty("items")
  public List<Payment> getItems() {
    return items;
  }
  public void setItems(List<Payment> items) {
    this.items = items;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultListPayment {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
