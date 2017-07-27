package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.ShowcaseItem;
import java.util.*;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Showcase resource representation for Create statememt
 **/
@ApiModel(description = "Showcase resource representation for Create statememt")
public class ShowcaseCreate  {
  
  private String externalId = null;
  private EntityInfo merchant = null;
  private EntityInfo store = null;
  private EntityInfo productCategory = null;
  private String title = null;
  private EntityInfo target = null;
  public enum ItemsPackageEnum {
     SINGLE,  MULTIPLE, 
  };
  private ItemsPackageEnum itemsPackage = null;
  public enum PaymentTypeEnum {
     NORMAL,  PRE_AUTHORIZE, 
  };
  private PaymentTypeEnum paymentType = null;
  private String description = null;
  private Date startDate = null;
  private Date dueDate = null;
  private List<EntityInfo> shipping = new ArrayList<EntityInfo>() ;
  private List<ShowcaseItem> items = new ArrayList<ShowcaseItem>() ;
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
   * The merchant resource entity
   **/
  @ApiModelProperty(required = true, value = "The merchant resource entity")
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
  @ApiModelProperty(required = true, value = "The Product Category of the Showcase")
  @JsonProperty("productCategory")
  public EntityInfo getProductCategory() {
    return productCategory;
  }
  public void setProductCategory(EntityInfo productCategory) {
    this.productCategory = productCategory;
  }

  
  /**
   * The title of the Showcase
   **/
  @ApiModelProperty(required = true, value = "The title of the Showcase")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Optional target for this Showcase
   **/
  @ApiModelProperty(value = "Optional target for this Showcase")
  @JsonProperty("target")
  public EntityInfo getTarget() {
    return target;
  }
  public void setTarget(EntityInfo target) {
    this.target = target;
  }

  
  /**
   * The package type of this Showcase
   **/
  @ApiModelProperty(required = true, value = "The package type of this Showcase")
  @JsonProperty("itemsPackage")
  public ItemsPackageEnum getItemsPackage() {
    return itemsPackage;
  }
  public void setItemsPackage(ItemsPackageEnum itemsPackage) {
    this.itemsPackage = itemsPackage;
  }

  
  /**
   * Optional payment type of this Showcase
   **/
  @ApiModelProperty(value = "Optional payment type of this Showcase")
  @JsonProperty("paymentType")
  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }
  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }

  
  /**
   * A generic description of the Showcase
   **/
  @ApiModelProperty(required = true, value = "A generic description of the Showcase")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Optionsl start timestamp of Showcase in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601
   **/
  @ApiModelProperty(value = "Optionsl start timestamp of Showcase in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   * Optional due timestamp of Showcase in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601
   **/
  @ApiModelProperty(value = "Optional due timestamp of Showcase in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
  @JsonProperty("dueDate")
  public Date getDueDate() {
    return dueDate;
  }
  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  
  /**
   * Shipping informations and relative costs (Mandatory for PHYSICAL items)
   **/
  @ApiModelProperty(value = "Shipping informations and relative costs (Mandatory for PHYSICAL items)")
  @JsonProperty("shipping")
  public List<EntityInfo> getShipping() {
    return shipping;
  }
  public void setShipping(List<EntityInfo> shipping) {
    this.shipping = shipping;
  }

  
  /**
   * Items that will make this Showcase
   **/
  @ApiModelProperty(required = true, value = "Items that will make this Showcase")
  @JsonProperty("items")
  public List<ShowcaseItem> getItems() {
    return items;
  }
  public void setItems(List<ShowcaseItem> items) {
    this.items = items;
  }

  
  /**
   * The showcase cover images
   **/
  @ApiModelProperty(required = true, value = "The showcase cover images")
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
    sb.append("class ShowcaseCreate {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  merchant: ").append(merchant).append("\n");
    sb.append("  store: ").append(store).append("\n");
    sb.append("  productCategory: ").append(productCategory).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  target: ").append(target).append("\n");
    sb.append("  itemsPackage: ").append(itemsPackage).append("\n");
    sb.append("  paymentType: ").append(paymentType).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  dueDate: ").append(dueDate).append("\n");
    sb.append("  shipping: ").append(shipping).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  attachments: ").append(attachments).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
