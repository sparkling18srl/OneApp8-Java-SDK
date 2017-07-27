package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Promotion;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Result list container of Promotion
 **/
@ApiModel(description = "Result list container of Promotion")
public class ResultListPromotion  {
  
  private Long total = null;
  private List<Promotion> items = new ArrayList<Promotion>() ;

  
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
  public List<Promotion> getItems() {
    return items;
  }
  public void setItems(List<Promotion> items) {
    this.items = items;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultListPromotion {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
