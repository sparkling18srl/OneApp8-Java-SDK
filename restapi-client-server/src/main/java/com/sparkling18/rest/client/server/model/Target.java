package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Action;
import com.sparkling18.rest.client.server.model.EntityInfo;
import java.util.*;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The code of the rule used for the Merchant users target
 **/
@ApiModel(description = "The code of the rule used for the Merchant users target")
public class Target  {
  
  private Long id = null;
  private Date created = null;
  private Date updated = null;
  private Boolean locked = null;
  private List<Action> actions = new ArrayList<Action>() ;
  private EntityInfo merchant = null;
  private String name = null;
  public enum TargetTypeEnum {
     CUSTOMER,  AGE_RANGE,  AMOUNT_RANGE,  PRODUCT_CATEGORY, 
  };
  private TargetTypeEnum targetType = null;

  
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
   * creation timestamp in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601
   **/
  @ApiModelProperty(value = "creation timestamp in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  
  /**
   * last update timestamp in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601
   **/
  @ApiModelProperty(value = "last update timestamp in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
  @JsonProperty("updated")
  public Date getUpdated() {
    return updated;
  }
  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  
  /**
   * 1APP8 Managed administrative status
   **/
  @ApiModelProperty(value = "1APP8 Managed administrative status")
  @JsonProperty("locked")
  public Boolean getLocked() {
    return locked;
  }
  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  
  /**
   * Resource action links
   **/
  @ApiModelProperty(value = "Resource action links")
  @JsonProperty("actions")
  public List<Action> getActions() {
    return actions;
  }
  public void setActions(List<Action> actions) {
    this.actions = actions;
  }

  
  /**
   * merchant resource info
   **/
  @ApiModelProperty(value = "merchant resource info")
  @JsonProperty("merchant")
  public EntityInfo getMerchant() {
    return merchant;
  }
  public void setMerchant(EntityInfo merchant) {
    this.merchant = merchant;
  }

  
  /**
   * the target name
   **/
  @ApiModelProperty(value = "the target name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The target type provided by Sparkling18
   **/
  @ApiModelProperty(value = "The target type provided by Sparkling18")
  @JsonProperty("targetType")
  public TargetTypeEnum getTargetType() {
    return targetType;
  }
  public void setTargetType(TargetTypeEnum targetType) {
    this.targetType = targetType;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Target {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  locked: ").append(locked).append("\n");
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("  merchant: ").append(merchant).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  targetType: ").append(targetType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
