package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Register;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Result list container
 **/
@ApiModel(description = "Result list container")
public class ResultListRegister  {
  
  private Long total = null;
  private List<Register> items = new ArrayList<Register>() ;

  
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
  public List<Register> getItems() {
    return items;
  }
  public void setItems(List<Register> items) {
    this.items = items;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultListRegister {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
