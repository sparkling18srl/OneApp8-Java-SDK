package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Email;
import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.Phone;
import com.sparkling18.rest.client.server.model.UserInfo;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * User entity representation
 **/
@ApiModel(description = "User entity representation")
public class UserCreate  {
  
  private String externalId = null;
  private EntityInfo merchant = null;
  private String userid = null;
  private String password = null;
  private Phone cellphone = null;
  private Email email = null;
  private UserInfo info = null;

  
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
   * The merchant used to board this user
   **/
  @ApiModelProperty(required = true, value = "The merchant used to board this user")
  @JsonProperty("merchant")
  public EntityInfo getMerchant() {
    return merchant;
  }
  public void setMerchant(EntityInfo merchant) {
    this.merchant = merchant;
  }

  
  /**
   * 1APP8 userid
   **/
  @ApiModelProperty(required = true, value = "1APP8 userid")
  @JsonProperty("userid")
  public String getUserid() {
    return userid;
  }
  public void setUserid(String userid) {
    this.userid = userid;
  }

  
  /**
   * Password to set
   **/
  @ApiModelProperty(value = "Password to set")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * User cellphone number
   **/
  @ApiModelProperty(required = true, value = "User cellphone number")
  @JsonProperty("cellphone")
  public Phone getCellphone() {
    return cellphone;
  }
  public void setCellphone(Phone cellphone) {
    this.cellphone = cellphone;
  }

  
  /**
   * User email address
   **/
  @ApiModelProperty(required = true, value = "User email address")
  @JsonProperty("email")
  public Email getEmail() {
    return email;
  }
  public void setEmail(Email email) {
    this.email = email;
  }

  
  /**
   * User detailed information
   **/
  @ApiModelProperty(value = "User detailed information")
  @JsonProperty("info")
  public UserInfo getInfo() {
    return info;
  }
  public void setInfo(UserInfo info) {
    this.info = info;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreate {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  merchant: ").append(merchant).append("\n");
    sb.append("  userid: ").append(userid).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  cellphone: ").append(cellphone).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
