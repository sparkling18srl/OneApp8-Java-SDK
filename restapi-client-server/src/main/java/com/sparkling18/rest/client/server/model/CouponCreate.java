package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Item;
import com.sparkling18.rest.client.server.model.Discount;
import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.Amount;
import java.util.*;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Coupon entity representation
 **/
@ApiModel(description = "Coupon entity representation")
public class CouponCreate  {
  
  private String externalId = null;
  private Amount value = null;
  private Discount discount = null;
  private Date expireDate = null;
  private EntityInfo merchant = null;
  private List<Long> merchants = new ArrayList<Long>() ;
  private List<Item> items = new ArrayList<Item>() ;
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
   * Coupon discount value (amount)
   **/
  @ApiModelProperty(value = "Coupon discount value (amount)")
  @JsonProperty("value")
  public Amount getValue() {
    return value;
  }
  public void setValue(Amount value) {
    this.value = value;
  }

  
  /**
   * Coupon discount object
   **/
  @ApiModelProperty(value = "Coupon discount object")
  @JsonProperty("discount")
  public Discount getDiscount() {
    return discount;
  }
  public void setDiscount(Discount discount) {
    this.discount = discount;
  }

  
  /**
   * Expiration date in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601
   **/
  @ApiModelProperty(required = true, value = "Expiration date in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
  @JsonProperty("expireDate")
  public Date getExpireDate() {
    return expireDate;
  }
  public void setExpireDate(Date expireDate) {
    this.expireDate = expireDate;
  }

  
  /**
   * Merchant reference for this coupon
   **/
  @ApiModelProperty(required = true, value = "Merchant reference for this coupon")
  @JsonProperty("merchant")
  public EntityInfo getMerchant() {
    return merchant;
  }
  public void setMerchant(EntityInfo merchant) {
    this.merchant = merchant;
  }

  
  /**
   * Merchants accepting this coupon
   **/
  @ApiModelProperty(value = "Merchants accepting this coupon")
  @JsonProperty("merchants")
  public List<Long> getMerchants() {
    return merchants;
  }
  public void setMerchants(List<Long> merchants) {
    this.merchants = merchants;
  }

  
  /**
   * Items you can spend the coupon for
   **/
  @ApiModelProperty(value = "Items you can spend the coupon for")
  @JsonProperty("items")
  public List<Item> getItems() {
    return items;
  }
  public void setItems(List<Item> items) {
    this.items = items;
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
    sb.append("class CouponCreate {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  discount: ").append(discount).append("\n");
    sb.append("  expireDate: ").append(expireDate).append("\n");
    sb.append("  merchant: ").append(merchant).append("\n");
    sb.append("  merchants: ").append(merchants).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  userid: ").append(userid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
