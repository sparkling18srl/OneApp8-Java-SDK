package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.ItemCategory;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Result list container of Item Container
 **/
@ApiModel(description = "Result list container of Item Container")
public class ResultListItemCategory  {
  
  private Long total = null;
  private List<ItemCategory> items = new ArrayList<ItemCategory>() ;

  
  /**
   * total number of items
   **/
  @ApiModelProperty(value = "total number of items")
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
  @ApiModelProperty(value = "items list")
  @JsonProperty("items")
  public List<ItemCategory> getItems() {
    return items;
  }
  public void setItems(List<ItemCategory> items) {
    this.items = items;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultListItemCategory {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
