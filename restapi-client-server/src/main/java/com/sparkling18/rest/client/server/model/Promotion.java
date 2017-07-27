package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.ShippingInfo;
import com.sparkling18.rest.client.server.model.Amount;
import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.Item;
import com.sparkling18.rest.client.server.model.Action;
import java.util.Date;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Promotion resource representation
 **/
@ApiModel(description = "Promotion resource representation")
public class Promotion  {
  
  private String externalId = null;
  private Long id = null;
  private Date created = null;
  private Date updated = null;
  private Boolean locked = null;
  private List<Action> actions = new ArrayList<Action>() ;
  private String title = null;
  private String code = null;
  private String description = null;
  private Amount price = null;
  private Integer quantity = null;
  private Date expirationDate = null;
  private List<ShippingInfo> shipping = new ArrayList<ShippingInfo>() ;
  private List<Item> items = new ArrayList<Item>() ;
  private List<EntityInfo> attachments = new ArrayList<EntityInfo>() ;

  
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
   * The title of the promotion
   **/
  @ApiModelProperty(value = "The title of the promotion")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * The merchant code of the promotion
   **/
  @ApiModelProperty(value = "The merchant code of the promotion")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   * A generic description of the promotion
   **/
  @ApiModelProperty(value = "A generic description of the promotion")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The price of the promotion
   **/
  @ApiModelProperty(value = "The price of the promotion")
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
  @ApiModelProperty(value = "The residual avaiable stock")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  /**
   * Expiration timestamp of promotion in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601
   **/
  @ApiModelProperty(value = "Expiration timestamp of promotion in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
  @JsonProperty("expirationDate")
  public Date getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  
  /**
   * Shipping informations and relative costs
   **/
  @ApiModelProperty(value = "Shipping informations and relative costs")
  @JsonProperty("shipping")
  public List<ShippingInfo> getShipping() {
    return shipping;
  }
  public void setShipping(List<ShippingInfo> shipping) {
    this.shipping = shipping;
  }

  
  /**
   * Items included in the promotion
   **/
  @ApiModelProperty(value = "Items included in the promotion")
  @JsonProperty("items")
  public List<Item> getItems() {
    return items;
  }
  public void setItems(List<Item> items) {
    this.items = items;
  }

  
  /**
   * The attached images in the promotion
   **/
  @ApiModelProperty(value = "The attached images in the promotion")
  @JsonProperty("attachments")
  public List<EntityInfo> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<EntityInfo> attachments) {
    this.attachments = attachments;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Promotion {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  locked: ").append(locked).append("\n");
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  expirationDate: ").append(expirationDate).append("\n");
    sb.append("  shipping: ").append(shipping).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  attachments: ").append(attachments).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
