package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Gift;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Result list container
 **/
@ApiModel(description = "Result list container")
public class ResultListGift  {
  
  private Long total = null;
  private List<Gift> items = new ArrayList<Gift>() ;

  
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
  public List<Gift> getItems() {
    return items;
  }
  public void setItems(List<Gift> items) {
    this.items = items;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultListGift {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
