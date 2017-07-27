package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Target;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Result list container of ResultListTarget
 **/
@ApiModel(description = "Result list container of ResultListTarget")
public class ResultListTarget  {
  
  private Long total = null;
  private List<Target> items = new ArrayList<Target>() ;

  
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
  public List<Target> getItems() {
    return items;
  }
  public void setItems(List<Target> items) {
    this.items = items;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultListTarget {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
