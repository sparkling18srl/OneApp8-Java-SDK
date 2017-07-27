package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Showcase;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Result list container of Showcase
 **/
@ApiModel(description = "Result list container of Showcase")
public class ResultListShowcase  {
  
  private Long total = null;
  private List<Showcase> items = new ArrayList<Showcase>() ;

  
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
  public List<Showcase> getItems() {
    return items;
  }
  public void setItems(List<Showcase> items) {
    this.items = items;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultListShowcase {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
