package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.Amount;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * ShowcaseItem resource representation
 **/
@ApiModel(description = "ShowcaseItem resource representation")
public class ShowcaseItem  {
  
  private EntityInfo item = null;
  private Amount price = null;
  private Long stock = null;

  
  /**
   * The EntityInfo of this item
   **/
  @ApiModelProperty(required = true, value = "The EntityInfo of this item")
  @JsonProperty("item")
  public EntityInfo getItem() {
    return item;
  }
  public void setItem(EntityInfo item) {
    this.item = item;
  }

  
  /**
   * The price of the Item
   **/
  @ApiModelProperty(required = true, value = "The price of the Item")
  @JsonProperty("price")
  public Amount getPrice() {
    return price;
  }
  public void setPrice(Amount price) {
    this.price = price;
  }

  
  /**
   * The residual avaiable stock
   **/
  @ApiModelProperty(required = true, value = "The residual avaiable stock")
  @JsonProperty("stock")
  public Long getStock() {
    return stock;
  }
  public void setStock(Long stock) {
    this.stock = stock;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowcaseItem {\n");
    
    sb.append("  item: ").append(item).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  stock: ").append(stock).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
