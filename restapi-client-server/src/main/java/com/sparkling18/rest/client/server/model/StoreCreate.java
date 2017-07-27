package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.InvoiceInfo;
import com.sparkling18.rest.client.server.model.Location;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Store resource representation
 **/
@ApiModel(description = "Store resource representation")
public class StoreCreate  {
  
  private EntityInfo merchant = null;
  private String externalId = null;
  private InvoiceInfo invoiceInfo = null;
  public enum TypeEnum {
     physical,  virtual, 
  };
  private TypeEnum type = null;
  private String name = null;
  private String companyName = null;
  private String legalRepresentative = null;
  private Location location = null;
  private String url = null;

  
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
   * Invoice info for the Store
   **/
  @ApiModelProperty(value = "Invoice info for the Store")
  @JsonProperty("invoiceInfo")
  public InvoiceInfo getInvoiceInfo() {
    return invoiceInfo;
  }
  public void setInvoiceInfo(InvoiceInfo invoiceInfo) {
    this.invoiceInfo = invoiceInfo;
  }

  
  /**
   * physical (store, shop, mall, etc) or virtual (online, email, phone, etc) point-of-sale
   **/
  @ApiModelProperty(required = true, value = "physical (store, shop, mall, etc) or virtual (online, email, phone, etc) point-of-sale")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Name
   **/
  @ApiModelProperty(required = true, value = "Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Company name
   **/
  @ApiModelProperty(value = "Company name")
  @JsonProperty("companyName")
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  
  /**
   * Legal representative
   **/
  @ApiModelProperty(value = "Legal representative")
  @JsonProperty("legalRepresentative")
  public String getLegalRepresentative() {
    return legalRepresentative;
  }
  public void setLegalRepresentative(String legalRepresentative) {
    this.legalRepresentative = legalRepresentative;
  }

  
  /**
   * store address and geographical coordinates
   **/
  @ApiModelProperty(required = true, value = "store address and geographical coordinates")
  @JsonProperty("location")
  public Location getLocation() {
    return location;
  }
  public void setLocation(Location location) {
    this.location = location;
  }

  
  /**
   * website or ecommerce URL
   **/
  @ApiModelProperty(value = "website or ecommerce URL")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreCreate {\n");
    
    sb.append("  merchant: ").append(merchant).append("\n");
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  invoiceInfo: ").append(invoiceInfo).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  companyName: ").append(companyName).append("\n");
    sb.append("  legalRepresentative: ").append(legalRepresentative).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
