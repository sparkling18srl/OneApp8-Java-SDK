package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.Amount;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Shipping Info for crate statement
 **/
@ApiModel(description = "Shipping Info for crate statement")
public class ShippingInfoCreate  {
  
  private String externalId = null;
  private EntityInfo merchant = null;
  public enum TypeEnum {
     FIXED_COST, 
  };
  private TypeEnum type = null;
  private Amount cost = null;
  private List<String> countries = new ArrayList<String>() ;
  private String carrier = null;
  private String notes = null;

  
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
   * merchant resource for the store
   **/
  @ApiModelProperty(required = true, value = "merchant resource for the store")
  @JsonProperty("merchant")
  public EntityInfo getMerchant() {
    return merchant;
  }
  public void setMerchant(EntityInfo merchant) {
    this.merchant = merchant;
  }

  
  /**
   * The typology of this shipping info
   **/
  @ApiModelProperty(required = true, value = "The typology of this shipping info")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Amount of shipping costs
   **/
  @ApiModelProperty(required = true, value = "Amount of shipping costs")
  @JsonProperty("cost")
  public Amount getCost() {
    return cost;
  }
  public void setCost(Amount cost) {
    this.cost = cost;
  }

  
  /**
   * Countries allowed for shipping
   **/
  @ApiModelProperty(value = "Countries allowed for shipping")
  @JsonProperty("countries")
  public List<String> getCountries() {
    return countries;
  }
  public void setCountries(List<String> countries) {
    this.countries = countries;
  }

  
  /**
   * The Carrier
   **/
  @ApiModelProperty(required = true, value = "The Carrier")
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  
  /**
   * Details on shipping
   **/
  @ApiModelProperty(value = "Details on shipping")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingInfoCreate {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  merchant: ").append(merchant).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  cost: ").append(cost).append("\n");
    sb.append("  countries: ").append(countries).append("\n");
    sb.append("  carrier: ").append(carrier).append("\n");
    sb.append("  notes: ").append(notes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
