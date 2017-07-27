package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.ShippingInfo;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Result list container of ShippingInfo
 **/
@ApiModel(description = "Result list container of ShippingInfo")
public class ResultListShippingInfo  {
  
  private Long total = null;
  private List<ShippingInfo> items = new ArrayList<ShippingInfo>() ;

  
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
  public List<ShippingInfo> getItems() {
    return items;
  }
  public void setItems(List<ShippingInfo> items) {
    this.items = items;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultListShippingInfo {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
