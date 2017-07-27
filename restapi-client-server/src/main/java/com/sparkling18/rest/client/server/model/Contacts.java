package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Email;
import com.sparkling18.rest.client.server.model.Phone;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Contacts
 **/
@ApiModel(description = "Contacts")
public class Contacts  {
  
  private Phone telephone = null;
  private Phone cellphone = null;
  private Phone fax = null;
  private Email email = null;

  
  /**
   * Telephone number
   **/
  @ApiModelProperty(value = "Telephone number")
  @JsonProperty("telephone")
  public Phone getTelephone() {
    return telephone;
  }
  public void setTelephone(Phone telephone) {
    this.telephone = telephone;
  }

  
  /**
   * Cellphone number
   **/
  @ApiModelProperty(value = "Cellphone number")
  @JsonProperty("cellphone")
  public Phone getCellphone() {
    return cellphone;
  }
  public void setCellphone(Phone cellphone) {
    this.cellphone = cellphone;
  }

  
  /**
   * Fax number
   **/
  @ApiModelProperty(value = "Fax number")
  @JsonProperty("fax")
  public Phone getFax() {
    return fax;
  }
  public void setFax(Phone fax) {
    this.fax = fax;
  }

  
  /**
   * Email address
   **/
  @ApiModelProperty(value = "Email address")
  @JsonProperty("email")
  public Email getEmail() {
    return email;
  }
  public void setEmail(Email email) {
    this.email = email;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contacts {\n");
    
    sb.append("  telephone: ").append(telephone).append("\n");
    sb.append("  cellphone: ").append(cellphone).append("\n");
    sb.append("  fax: ").append(fax).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
