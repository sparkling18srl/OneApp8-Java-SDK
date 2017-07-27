package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Amount;
import com.sparkling18.rest.client.server.model.EntityInfo;
import java.util.Date;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Promotion resource representation for Update statememt
 **/
@ApiModel(description = "Promotion resource representation for Update statememt")
public class PromotionUpdate  {
  
  private String externalId = null;
  private String title = null;
  private String target = null;
  private String description = null;
  private Integer quantity = null;
  private Amount price = null;
  private Date expirationDate = null;
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
   * The title of the promotion
   **/
  @ApiModelProperty(required = true, value = "The title of the promotion")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * The code name of the rule used for the users target
   **/
  @ApiModelProperty(required = true, value = "The code name of the rule used for the users target")
  @JsonProperty("target")
  public String getTarget() {
    return target;
  }
  public void setTarget(String target) {
    this.target = target;
  }

  
  /**
   * A generic description of the promotion
   **/
  @ApiModelProperty(required = true, value = "A generic description of the promotion")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The avaiable stock
   **/
  @ApiModelProperty(required = true, value = "The avaiable stock")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  /**
   * The price of the promotion
   **/
  @ApiModelProperty(required = true, value = "The price of the promotion")
  @JsonProperty("price")
  public Amount getPrice() {
    return price;
  }
  public void setPrice(Amount price) {
    this.price = price;
  }

  
  /**
   * Expiration timestamp of promotion in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601
   **/
  @ApiModelProperty(required = true, value = "Expiration timestamp of promotion in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
  @JsonProperty("expirationDate")
  public Date getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  
  /**
   * The complessive images of all the items in promotion
   **/
  @ApiModelProperty(required = true, value = "The complessive images of all the items in promotion")
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
    sb.append("class PromotionUpdate {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  target: ").append(target).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  expirationDate: ").append(expirationDate).append("\n");
    sb.append("  attachments: ").append(attachments).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
