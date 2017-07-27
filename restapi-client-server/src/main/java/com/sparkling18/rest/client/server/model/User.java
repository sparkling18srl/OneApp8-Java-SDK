package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Action;
import com.sparkling18.rest.client.server.model.Email;
import com.sparkling18.rest.client.server.model.Phone;
import java.util.*;
import com.sparkling18.rest.client.server.model.UserInfo;
import java.util.Date;
import com.sparkling18.rest.client.server.model.CreditCard;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * User entity representation
 **/
@ApiModel(description = "User entity representation")
public class User  {
  
  private String externalId = null;
  private Long id = null;
  private Date created = null;
  private Date updated = null;
  private Boolean locked = null;
  private List<Action> actions = new ArrayList<Action>() ;
  private String userid = null;
  private UserInfo info = null;
  private Phone cellphone = null;
  private Email email = null;
  private List<CreditCard> creditCards = new ArrayList<CreditCard>() ;

  
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
   * 1APP8 userid
   **/
  @ApiModelProperty(value = "1APP8 userid")
  @JsonProperty("userid")
  public String getUserid() {
    return userid;
  }
  public void setUserid(String userid) {
    this.userid = userid;
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

  
  /**
   * User cellphone number
   **/
  @ApiModelProperty(value = "User cellphone number")
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
  @ApiModelProperty(value = "User email address")
  @JsonProperty("email")
  public Email getEmail() {
    return email;
  }
  public void setEmail(Email email) {
    this.email = email;
  }

  
  /**
   * Creditcards of user wallet
   **/
  @ApiModelProperty(value = "Creditcards of user wallet")
  @JsonProperty("creditCards")
  public List<CreditCard> getCreditCards() {
    return creditCards;
  }
  public void setCreditCards(List<CreditCard> creditCards) {
    this.creditCards = creditCards;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  locked: ").append(locked).append("\n");
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("  userid: ").append(userid).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("  cellphone: ").append(cellphone).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  creditCards: ").append(creditCards).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
