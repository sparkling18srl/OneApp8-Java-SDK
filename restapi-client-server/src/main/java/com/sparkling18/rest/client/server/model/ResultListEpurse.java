package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Epurse;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Result list container
 **/
@ApiModel(description = "Result list container")
public class ResultListEpurse  {
  
  private Long total = null;
  private List<Epurse> items = new ArrayList<Epurse>() ;

  
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
  public List<Epurse> getItems() {
    return items;
  }
  public void setItems(List<Epurse> items) {
    this.items = items;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultListEpurse {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
