package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.ItemCreate;
import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.Amount;
import java.util.*;
import com.sparkling18.rest.client.server.model.OrderShippingInfo;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Order resource representation
 **/
@ApiModel(description = "Order resource representation")
public class OrderCreate  {
  
  private String externalId = null;
  private Amount total = null;
  private OrderShippingInfo shipping = null;
  private String description = null;
  private String notes = null;
  private List<ItemCreate> items = new ArrayList<ItemCreate>() ;
  private EntityInfo register = null;
  public enum PaymentTypeEnum {
     normal,  pre_authorize,  wallet_id, 
  };
  private PaymentTypeEnum paymentType = null;
  private EntityInfo user = null;

  
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
   * Total amount for the order
   **/
  @ApiModelProperty(required = true, value = "Total amount for the order")
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
   * One line description of the order
   **/
  @ApiModelProperty(required = true, value = "One line description of the order")
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
  @ApiModelProperty(required = true, value = "Longer text description of the order")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  /**
   * Items in the cart for this order
   **/
  @ApiModelProperty(value = "Items in the cart for this order")
  @JsonProperty("items")
  public List<ItemCreate> getItems() {
    return items;
  }
  public void setItems(List<ItemCreate> items) {
    this.items = items;
  }

  
  /**
   * Reference to the register entity linked to the order
   **/
  @ApiModelProperty(required = true, value = "Reference to the register entity linked to the order")
  @JsonProperty("register")
  public EntityInfo getRegister() {
    return register;
  }
  public void setRegister(EntityInfo register) {
    this.register = register;
  }

  
  /**
   * The payment type for the order, pre_authorize lets to manage the accounting amount (optional)
   **/
  @ApiModelProperty(value = "The payment type for the order, pre_authorize lets to manage the accounting amount (optional)")
  @JsonProperty("paymentType")
  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }
  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
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
    sb.append("class OrderCreate {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("  shipping: ").append(shipping).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  notes: ").append(notes).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  register: ").append(register).append("\n");
    sb.append("  paymentType: ").append(paymentType).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
