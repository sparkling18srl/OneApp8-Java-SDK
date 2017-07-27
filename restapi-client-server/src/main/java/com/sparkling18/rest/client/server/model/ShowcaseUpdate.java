package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.ShowcaseItem;
import java.util.*;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Showcase resource representation for Update statememt
 **/
@ApiModel(description = "Showcase resource representation for Update statememt")
public class ShowcaseUpdate  {
  
  public enum PaymentTypeEnum {
     NORMAL,  PRE_AUTHORIZE, 
  };
  private PaymentTypeEnum paymentType = null;
  private EntityInfo productCategory = null;
  private String title = null;
  private String description = null;
  private EntityInfo target = null;
  private Date dueDate = null;
  private List<ShowcaseItem> items = new ArrayList<ShowcaseItem>() ;
  private List<EntityInfo> attachments = new ArrayList<EntityInfo>() ;
  private List<EntityInfo> shipping = new ArrayList<EntityInfo>() ;

  
  /**
   * The payment type of this Showcase
   **/
  @ApiModelProperty(value = "The payment type of this Showcase")
  @JsonProperty("paymentType")
  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }
  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
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
   * Expiration timestamp of Showcase in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601
   **/
  @ApiModelProperty(value = "Expiration timestamp of Showcase in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
  @JsonProperty("dueDate")
  public Date getDueDate() {
    return dueDate;
  }
  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  
  /**
   * Items is allowed only for update stock and/or price
   **/
  @ApiModelProperty(value = "Items is allowed only for update stock and/or price")
  @JsonProperty("items")
  public List<ShowcaseItem> getItems() {
    return items;
  }
  public void setItems(List<ShowcaseItem> items) {
    this.items = items;
  }

  
  /**
   * The showcase images to update
   **/
  @ApiModelProperty(value = "The showcase images to update")
  @JsonProperty("attachments")
  public List<EntityInfo> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<EntityInfo> attachments) {
    this.attachments = attachments;
  }

  
  /**
   * The Shipping informations to update
   **/
  @ApiModelProperty(value = "The Shipping informations to update")
  @JsonProperty("shipping")
  public List<EntityInfo> getShipping() {
    return shipping;
  }
  public void setShipping(List<EntityInfo> shipping) {
    this.shipping = shipping;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowcaseUpdate {\n");
    
    sb.append("  paymentType: ").append(paymentType).append("\n");
    sb.append("  productCategory: ").append(productCategory).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  target: ").append(target).append("\n");
    sb.append("  dueDate: ").append(dueDate).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  attachments: ").append(attachments).append("\n");
    sb.append("  shipping: ").append(shipping).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
