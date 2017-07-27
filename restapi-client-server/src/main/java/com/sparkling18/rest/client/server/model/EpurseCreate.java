package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.Amount;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Epurse entity representation
 **/
@ApiModel(description = "Epurse entity representation")
public class EpurseCreate  {
  
  private String externalId = null;
  private Amount value = null;
  private EntityInfo merchant = null;
  private Date expireDate = null;
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
   * Epurse discount value (amount)
   **/
  @ApiModelProperty(value = "Epurse discount value (amount)")
  @JsonProperty("value")
  public Amount getValue() {
    return value;
  }
  public void setValue(Amount value) {
    this.value = value;
  }

  
  /**
   * Merchant reference for this epurse
   **/
  @ApiModelProperty(required = true, value = "Merchant reference for this epurse")
  @JsonProperty("merchant")
  public EntityInfo getMerchant() {
    return merchant;
  }
  public void setMerchant(EntityInfo merchant) {
    this.merchant = merchant;
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
    sb.append("class EpurseCreate {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  merchant: ").append(merchant).append("\n");
    sb.append("  expireDate: ").append(expireDate).append("\n");
    sb.append("  userid: ").append(userid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
