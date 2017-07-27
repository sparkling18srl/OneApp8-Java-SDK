package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.EntityInfo;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Item Category entity representation for Create Statement
 **/
@ApiModel(description = "Item Category entity representation for Create Statement")
public class ItemCategoryCreate  {
  
  private EntityInfo merchant = null;
  private String description = null;
  private EntityInfo cover = null;

  
  /**
   * merchant resource for the item category
   **/
  @ApiModelProperty(required = true, value = "merchant resource for the item category")
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
  @ApiModelProperty(required = true, value = "description of the item category")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemCategoryCreate {\n");
    
    sb.append("  merchant: ").append(merchant).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  cover: ").append(cover).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
