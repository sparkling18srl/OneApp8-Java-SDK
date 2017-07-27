package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Action;
import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.Amount;
import java.util.*;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Gift entity representation
 **/
@ApiModel(description = "Gift entity representation")
public class Gift  {
  
  private String externalId = null;
  private Long id = null;
  private Date created = null;
  private Date updated = null;
  private Boolean locked = null;
  private List<Action> actions = new ArrayList<Action>() ;
  private String holder = null;
  private String number = null;
  private Amount value = null;
  private EntityInfo merchant = null;
  private EntityInfo customer = null;
  private Date expireDate = null;
  private String userid = null;

  
  /**
   * External identifier, used to reference the same entity in the customer systems
   **/
  @ApiModelProperty(value = "External identifier, used to reference the same entity in the customer systems")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
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
   * Holder full name, as printed on the card
   **/
  @ApiModelProperty(value = "Holder full name, as printed on the card")
  @JsonProperty("holder")
  public String getHolder() {
    return holder;
  }
  public void setHolder(String holder) {
    this.holder = holder;
  }

  
  /**
   * Card number, as printed on the card
   **/
  @ApiModelProperty(value = "Card number, as printed on the card")
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  
  /**
   * Gift discount value (amount)
   **/
  @ApiModelProperty(value = "Gift discount value (amount)")
  @JsonProperty("value")
  public Amount getValue() {
    return value;
  }
  public void setValue(Amount value) {
    this.value = value;
  }

  
  /**
   * Merchant reference for this gift
   **/
  @ApiModelProperty(value = "Merchant reference for this gift")
  @JsonProperty("merchant")
  public EntityInfo getMerchant() {
    return merchant;
  }
  public void setMerchant(EntityInfo merchant) {
    this.merchant = merchant;
  }

  
  /**
   * Customer reference for this gift
   **/
  @ApiModelProperty(value = "Customer reference for this gift")
  @JsonProperty("customer")
  public EntityInfo getCustomer() {
    return customer;
  }
  public void setCustomer(EntityInfo customer) {
    this.customer = customer;
  }

  
  /**
   * Expiration date in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601
   **/
  @ApiModelProperty(value = "Expiration date in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
  @JsonProperty("expireDate")
  public Date getExpireDate() {
    return expireDate;
  }
  public void setExpireDate(Date expireDate) {
    this.expireDate = expireDate;
  }

  
  /**
   * 1APP8 userid of the associated user
   **/
  @ApiModelProperty(value = "1APP8 userid of the associated user")
  @JsonProperty("userid")
  public String getUserid() {
    return userid;
  }
  public void setUserid(String userid) {
    this.userid = userid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gift {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  locked: ").append(locked).append("\n");
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("  holder: ").append(holder).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  merchant: ").append(merchant).append("\n");
    sb.append("  customer: ").append(customer).append("\n");
    sb.append("  expireDate: ").append(expireDate).append("\n");
    sb.append("  userid: ").append(userid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
