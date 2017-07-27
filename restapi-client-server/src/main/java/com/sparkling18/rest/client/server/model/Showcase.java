package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Action;
import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.ShowcaseItem;
import java.util.*;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Showcase resource representation
 **/
@ApiModel(description = "Showcase resource representation")
public class Showcase  {
  
  private String externalId = null;
  private Long id = null;
  private Date created = null;
  private Date updated = null;
  private Boolean locked = null;
  private List<Action> actions = new ArrayList<Action>() ;
  private EntityInfo merchant = null;
  private EntityInfo store = null;
  private EntityInfo productCategory = null;
  private EntityInfo target = null;
  private String title = null;
  private String description = null;
  private Integer quantity = null;
  public enum ItemsPackageEnum {
     SINGLE,  MULTIPLE, 
  };
  private ItemsPackageEnum itemsPackage = null;
  public enum PaymentTypeEnum {
     NORMAL,  PRE_AUTHORIZE, 
  };
  private PaymentTypeEnum paymentType = null;
  private Date startDate = null;
  private Date dueDate = null;
  private List<EntityInfo> shipping = new ArrayList<EntityInfo>() ;
  private List<ShowcaseItem> items = new ArrayList<ShowcaseItem>() ;
  private List<EntityInfo> attachments = new ArrayList<EntityInfo>() ;
  private Boolean enabled = null;

  
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
   * The merchant resource entity
   **/
  @ApiModelProperty(value = "The merchant resource entity")
  @JsonProperty("merchant")
  public EntityInfo getMerchant() {
    return merchant;
  }
  public void setMerchant(EntityInfo merchant) {
    this.merchant = merchant;
  }

  
  /**
   * The store resource entity
   **/
  @ApiModelProperty(value = "The store resource entity")
  @JsonProperty("store")
  public EntityInfo getStore() {
    return store;
  }
  public void setStore(EntityInfo store) {
    this.store = store;
  }

  
  /**
   * The Product Category of the Showcase
   **/
  @ApiModelProperty(value = "The Product Category of the Showcase")
  @JsonProperty("productCategory")
  public EntityInfo getProductCategory() {
    return productCategory;
  }
  public void setProductCategory(EntityInfo productCategory) {
    this.productCategory = productCategory;
  }

  
  /**
   * The EntityInfo used for the users target
   **/
  @ApiModelProperty(value = "The EntityInfo used for the users target")
  @JsonProperty("target")
  public EntityInfo getTarget() {
    return target;
  }
  public void setTarget(EntityInfo target) {
    this.target = target;
  }

  
  /**
   * The title of the Showcase
   **/
  @ApiModelProperty(value = "The title of the Showcase")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * A generic description of the Showcase
   **/
  @ApiModelProperty(value = "A generic description of the Showcase")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The avaiable stock of all items
   **/
  @ApiModelProperty(value = "The avaiable stock of all items")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  /**
   * The package type of this Showcase
   **/
  @ApiModelProperty(value = "The package type of this Showcase")
  @JsonProperty("itemsPackage")
  public ItemsPackageEnum getItemsPackage() {
    return itemsPackage;
  }
  public void setItemsPackage(ItemsPackageEnum itemsPackage) {
    this.itemsPackage = itemsPackage;
  }

  
  /**
   * The Payment type of this Showcase
   **/
  @ApiModelProperty(value = "The Payment type of this Showcase")
  @JsonProperty("paymentType")
  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }
  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }

  
  /**
   * Start timestamp of Showcase in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601
   **/
  @ApiModelProperty(value = "Start timestamp of Showcase in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   * Due timestamp of Showcase in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601
   **/
  @ApiModelProperty(value = "Due timestamp of Showcase in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
  @JsonProperty("dueDate")
  public Date getDueDate() {
    return dueDate;
  }
  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  
  /**
   * Shipping informations and relative costs
   **/
  @ApiModelProperty(value = "Shipping informations and relative costs")
  @JsonProperty("shipping")
  public List<EntityInfo> getShipping() {
    return shipping;
  }
  public void setShipping(List<EntityInfo> shipping) {
    this.shipping = shipping;
  }

  
  /**
   * Items that make this Showcase
   **/
  @ApiModelProperty(value = "Items that make this Showcase")
  @JsonProperty("items")
  public List<ShowcaseItem> getItems() {
    return items;
  }
  public void setItems(List<ShowcaseItem> items) {
    this.items = items;
  }

  
  /**
   * The gallery that contains all the associated images (showcase and items) 
   **/
  @ApiModelProperty(value = "The gallery that contains all the associated images (showcase and items) ")
  @JsonProperty("attachments")
  public List<EntityInfo> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<EntityInfo> attachments) {
    this.attachments = attachments;
  }

  
  /**
   * 1APP8 Managed enable status
   **/
  @ApiModelProperty(value = "1APP8 Managed enable status")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Showcase {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  locked: ").append(locked).append("\n");
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("  merchant: ").append(merchant).append("\n");
    sb.append("  store: ").append(store).append("\n");
    sb.append("  productCategory: ").append(productCategory).append("\n");
    sb.append("  target: ").append(target).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  itemsPackage: ").append(itemsPackage).append("\n");
    sb.append("  paymentType: ").append(paymentType).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  dueDate: ").append(dueDate).append("\n");
    sb.append("  shipping: ").append(shipping).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  attachments: ").append(attachments).append("\n");
    sb.append("  enabled: ").append(enabled).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
