package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Item;
import com.sparkling18.rest.client.server.model.Action;
import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.Amount;
import java.util.*;
import java.util.Date;
import com.sparkling18.rest.client.server.model.OrderShippingInfo;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Order resource representation
 **/
@ApiModel(description = "Order resource representation")
public class Order  {
  
  private String externalId = null;
  private Long id = null;
  private Date created = null;
  private Date updated = null;
  private Boolean locked = null;
  private List<Action> actions = new ArrayList<Action>() ;
  private Amount total = null;
  private OrderShippingInfo shipping = null;
  private String statusMessage = null;
  private String description = null;
  private String notes = null;
  private Boolean error = null;
  private List<Item> items = new ArrayList<Item>() ;
  private Boolean completed = null;
  private String checkoutUrl = null;
  private Boolean charged = null;
  public enum OriginEnum {
     web,  api,  client,  backoffice,  recurring,  masterpass_checkout,  enrollment,  unknown, 
  };
  private OriginEnum origin = null;
  private EntityInfo merchant = null;
  private EntityInfo store = null;
  private EntityInfo register = null;
  private EntityInfo user = null;

  
  /**
   * External identifier, used to reference the same entity in the customer systems
   **/
  @ApiModelProperty(required = true, value = "External identifier, used to reference the same entity in the customer systems")
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
  @ApiModelProperty(required = true, value = "1APP8 unique identifier")
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
  @ApiModelProperty(required = true, value = "creation timestamp in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
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
  @ApiModelProperty(required = true, value = "last update timestamp in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
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
  @ApiModelProperty(required = true, value = "1APP8 Managed administrative status")
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
  @ApiModelProperty(required = true, value = "Resource action links")
  @JsonProperty("actions")
  public List<Action> getActions() {
    return actions;
  }
  public void setActions(List<Action> actions) {
    this.actions = actions;
  }

  
  /**
   * Total amount for the order
   **/
  @ApiModelProperty(value = "Total amount for the order")
  @JsonProperty("total")
  public Amount getTotal() {
    return total;
  }
  public void setTotal(Amount total) {
    this.total = total;
  }

  
  /**
   * Shipping information
   **/
  @ApiModelProperty(value = "Shipping information")
  @JsonProperty("shipping")
  public OrderShippingInfo getShipping() {
    return shipping;
  }
  public void setShipping(OrderShippingInfo shipping) {
    this.shipping = shipping;
  }

  
  /**
   * Localized status message
   **/
  @ApiModelProperty(value = "Localized status message")
  @JsonProperty("statusMessage")
  public String getStatusMessage() {
    return statusMessage;
  }
  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  
  /**
   * One line description of the order
   **/
  @ApiModelProperty(value = "One line description of the order")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Longer text description of the order
   **/
  @ApiModelProperty(value = "Longer text description of the order")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  /**
   * whether the order has encountered an error or not
   **/
  @ApiModelProperty(value = "whether the order has encountered an error or not")
  @JsonProperty("error")
  public Boolean getError() {
    return error;
  }
  public void setError(Boolean error) {
    this.error = error;
  }

  
  /**
   * Items in the cart for this order
   **/
  @ApiModelProperty(value = "Items in the cart for this order")
  @JsonProperty("items")
  public List<Item> getItems() {
    return items;
  }
  public void setItems(List<Item> items) {
    this.items = items;
  }

  
  /**
   * whether the order is completed or not
   **/
  @ApiModelProperty(value = "whether the order is completed or not")
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }
  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  
  /**
   * The url to the checkout page with a reference to this order
   **/
  @ApiModelProperty(value = "The url to the checkout page with a reference to this order")
  @JsonProperty("checkoutUrl")
  public String getCheckoutUrl() {
    return checkoutUrl;
  }
  public void setCheckoutUrl(String checkoutUrl) {
    this.checkoutUrl = checkoutUrl;
  }

  
  /**
   * wheter the order has been charged or not
   **/
  @ApiModelProperty(value = "wheter the order has been charged or not")
  @JsonProperty("charged")
  public Boolean getCharged() {
    return charged;
  }
  public void setCharged(Boolean charged) {
    this.charged = charged;
  }

  
  /**
   * Origin channel for the order
   **/
  @ApiModelProperty(value = "Origin channel for the order")
  @JsonProperty("origin")
  public OriginEnum getOrigin() {
    return origin;
  }
  public void setOrigin(OriginEnum origin) {
    this.origin = origin;
  }

  
  /**
   * Reference to the merchant entity linked to the order
   **/
  @ApiModelProperty(value = "Reference to the merchant entity linked to the order")
  @JsonProperty("merchant")
  public EntityInfo getMerchant() {
    return merchant;
  }
  public void setMerchant(EntityInfo merchant) {
    this.merchant = merchant;
  }

  
  /**
   * Reference to the store entity linked to the order
   **/
  @ApiModelProperty(value = "Reference to the store entity linked to the order")
  @JsonProperty("store")
  public EntityInfo getStore() {
    return store;
  }
  public void setStore(EntityInfo store) {
    this.store = store;
  }

  
  /**
   * Reference to the register entity linked to the order
   **/
  @ApiModelProperty(value = "Reference to the register entity linked to the order")
  @JsonProperty("register")
  public EntityInfo getRegister() {
    return register;
  }
  public void setRegister(EntityInfo register) {
    this.register = register;
  }

  
  /**
   * Optional reference to the user. This property is used to bind a specific 1APP8 user to this order
   **/
  @ApiModelProperty(value = "Optional reference to the user. This property is used to bind a specific 1APP8 user to this order")
  @JsonProperty("user")
  public EntityInfo getUser() {
    return user;
  }
  public void setUser(EntityInfo user) {
    this.user = user;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  locked: ").append(locked).append("\n");
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("  shipping: ").append(shipping).append("\n");
    sb.append("  statusMessage: ").append(statusMessage).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  notes: ").append(notes).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  completed: ").append(completed).append("\n");
    sb.append("  checkoutUrl: ").append(checkoutUrl).append("\n");
    sb.append("  charged: ").append(charged).append("\n");
    sb.append("  origin: ").append(origin).append("\n");
    sb.append("  merchant: ").append(merchant).append("\n");
    sb.append("  store: ").append(store).append("\n");
    sb.append("  register: ").append(register).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
