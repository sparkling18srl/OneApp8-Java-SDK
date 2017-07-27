package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.PosInfo;
import com.sparkling18.rest.client.server.model.Action;
import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.InvoiceInfo;
import java.util.*;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Register resource representation
 **/
@ApiModel(description = "Register resource representation")
public class Register  {
  
  private String externalId = null;
  private Long id = null;
  private Date created = null;
  private Date updated = null;
  private Boolean locked = null;
  private List<Action> actions = new ArrayList<Action>() ;
  private String name = null;
  private Boolean bindable = null;
  private Long user = null;
  private InvoiceInfo invoiceInfo = null;
  private PosInfo posInfo = null;
  private EntityInfo customer = null;
  private EntityInfo merchant = null;
  private EntityInfo store = null;
  public enum TypeEnum {
     physical,  virtual, 
  };
  private TypeEnum type = null;

  
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
   * name of the register
   **/
  @ApiModelProperty(required = true, value = "name of the register")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The register is available for binding or not
   **/
  @ApiModelProperty(value = "The register is available for binding or not")
  @JsonProperty("bindable")
  public Boolean getBindable() {
    return bindable;
  }
  public void setBindable(Boolean bindable) {
    this.bindable = bindable;
  }

  
  /**
   * The user who last bound to the register
   **/
  @ApiModelProperty(value = "The user who last bound to the register")
  @JsonProperty("user")
  public Long getUser() {
    return user;
  }
  public void setUser(Long user) {
    this.user = user;
  }

  
  /**
   * Invoicing information for the register
   **/
  @ApiModelProperty(value = "Invoicing information for the register")
  @JsonProperty("invoiceInfo")
  public InvoiceInfo getInvoiceInfo() {
    return invoiceInfo;
  }
  public void setInvoiceInfo(InvoiceInfo invoiceInfo) {
    this.invoiceInfo = invoiceInfo;
  }

  
  /**
   * POS configuration information
   **/
  @ApiModelProperty(value = "POS configuration information")
  @JsonProperty("posInfo")
  public PosInfo getPosInfo() {
    return posInfo;
  }
  public void setPosInfo(PosInfo posInfo) {
    this.posInfo = posInfo;
  }

  
  /**
   * customer resource for the register
   **/
  @ApiModelProperty(value = "customer resource for the register")
  @JsonProperty("customer")
  public EntityInfo getCustomer() {
    return customer;
  }
  public void setCustomer(EntityInfo customer) {
    this.customer = customer;
  }

  
  /**
   * merchant resource for the register
   **/
  @ApiModelProperty(value = "merchant resource for the register")
  @JsonProperty("merchant")
  public EntityInfo getMerchant() {
    return merchant;
  }
  public void setMerchant(EntityInfo merchant) {
    this.merchant = merchant;
  }

  
  /**
   * store resource for the register
   **/
  @ApiModelProperty(required = true, value = "store resource for the register")
  @JsonProperty("store")
  public EntityInfo getStore() {
    return store;
  }
  public void setStore(EntityInfo store) {
    this.store = store;
  }

  
  /**
   * The type of register
   **/
  @ApiModelProperty(required = true, value = "The type of register")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Register {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  locked: ").append(locked).append("\n");
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  bindable: ").append(bindable).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("  invoiceInfo: ").append(invoiceInfo).append("\n");
    sb.append("  posInfo: ").append(posInfo).append("\n");
    sb.append("  customer: ").append(customer).append("\n");
    sb.append("  merchant: ").append(merchant).append("\n");
    sb.append("  store: ").append(store).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
