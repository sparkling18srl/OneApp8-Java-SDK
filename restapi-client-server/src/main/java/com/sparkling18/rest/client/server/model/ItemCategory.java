package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.EntityInfo;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Item Category entity representation
 **/
@ApiModel(description = "Item Category entity representation")
public class ItemCategory  {
  
  private Long id = null;
  private EntityInfo merchant = null;
  private EntityInfo cover = null;
  private String description = null;

  
  /**
   * 1APP8 unique identifier
   **/
  @ApiModelProperty(value = "1APP8 unique identifier")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * merchant resource for the item
   **/
  @ApiModelProperty(value = "merchant resource for the item")
  @JsonProperty("merchant")
  public EntityInfo getMerchant() {
    return merchant;
  }
  public void setMerchant(EntityInfo merchant) {
    this.merchant = merchant;
  }

  
  /**
   * description of the item category
   **/
  @ApiModelProperty(value = "description of the item category")
  @JsonProperty("cover")
  public EntityInfo getCover() {
    return cover;
  }
  public void setCover(EntityInfo cover) {
    this.cover = cover;
  }

  
  /**
   * Description
   **/
  @ApiModelProperty(value = "Description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemCategory {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  merchant: ").append(merchant).append("\n");
    sb.append("  cover: ").append(cover).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
