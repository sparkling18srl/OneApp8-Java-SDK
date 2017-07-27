package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Action;
import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.Amount;
import java.util.*;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Payment resource representation
 **/
@ApiModel(description = "Payment resource representation")
public class Payment  {
  
  private String externalId = null;
  private Long id = null;
  private Date created = null;
  private Date updated = null;
  private Boolean locked = null;
  private List<Action> actions = new ArrayList<Action>() ;
  private EntityInfo order = null;
  private Amount amount = null;
  private String statusMessage = null;
  private Boolean error = null;
  private String userid = null;
  public enum TypeEnum {
     mobileApp,  creditCardData,  pos,  cash,  recurring,  walletId,  unknown, 
  };
  private TypeEnum type = null;
  private Boolean completed = null;
  private Boolean charged = null;

  
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
   * Order entity reference
   **/
  @ApiModelProperty(required = true, value = "Order entity reference")
  @JsonProperty("order")
  public EntityInfo getOrder() {
    return order;
  }
  public void setOrder(EntityInfo order) {
    this.order = order;
  }

  
  /**
   * Amount of the payment
   **/
  @ApiModelProperty(required = true, value = "Amount of the payment")
  @JsonProperty("amount")
  public Amount getAmount() {
    return amount;
  }
  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  
  /**
   * Localized status message of the payment
   **/
  @ApiModelProperty(value = "Localized status message of the payment")
  @JsonProperty("statusMessage")
  public String getStatusMessage() {
    return statusMessage;
  }
  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  
  /**
   * whether the payment has encountered an error or not
   **/
  @ApiModelProperty(value = "whether the payment has encountered an error or not")
  @JsonProperty("error")
  public Boolean getError() {
    return error;
  }
  public void setError(Boolean error) {
    this.error = error;
  }

  
  /**
   * 1APP8 userid of the user completing the payment (only present if type is '1app8')
   **/
  @ApiModelProperty(value = "1APP8 userid of the user completing the payment (only present if type is '1app8')")
  @JsonProperty("userid")
  public String getUserid() {
    return userid;
  }
  public void setUserid(String userid) {
    this.userid = userid;
  }

  
  /**
   * The means by which the payment will be completed
   **/
  @ApiModelProperty(required = true, value = "The means by which the payment will be completed")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * whether the payment is completed or not
   **/
  @ApiModelProperty(value = "whether the payment is completed or not")
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }
  public void setCompleted(Boolean completed) {
    this.completed = completed;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  locked: ").append(locked).append("\n");
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  statusMessage: ").append(statusMessage).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  userid: ").append(userid).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  completed: ").append(completed).append("\n");
    sb.append("  charged: ").append(charged).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
