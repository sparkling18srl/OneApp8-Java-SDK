package com.sparkling18.rest.client.server.model;

import java.util.*;
import com.sparkling18.rest.client.server.model.CreditCard;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Result list container of Credit Cards
 **/
@ApiModel(description = "Result list container of Credit Cards")
public class ResultListCreditCard  {
  
  private Long total = null;
  private List<CreditCard> items = new ArrayList<CreditCard>() ;

  
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
  public List<CreditCard> getItems() {
    return items;
  }
  public void setItems(List<CreditCard> items) {
    this.items = items;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultListCreditCard {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
