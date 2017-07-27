package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Contacts;
import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.InvoiceInfo;
import com.sparkling18.rest.client.server.model.Location;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Merchant resource representation
 **/
@ApiModel(description = "Merchant resource representation")
public class MerchantCreate  {
  
  private String externalId = null;
  private String name = null;
  private String companyName = null;
  private String legalRepresentative = null;
  private EntityInfo customer = null;
  private Location location = null;
  private InvoiceInfo invoiceInfo = null;
  private String url = null;
  private Contacts contacts = null;

  
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
   * Merchant name
   **/
  @ApiModelProperty(required = true, value = "Merchant name")
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
  @ApiModelProperty(required = true, value = "Company name")
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
  @ApiModelProperty(required = true, value = "Legal representative")
  @JsonProperty("legalRepresentative")
  public String getLegalRepresentative() {
    return legalRepresentative;
  }
  public void setLegalRepresentative(String legalRepresentative) {
    this.legalRepresentative = legalRepresentative;
  }

  
  /**
   * customer resource for the merchant
   **/
  @ApiModelProperty(required = true, value = "customer resource for the merchant")
  @JsonProperty("customer")
  public EntityInfo getCustomer() {
    return customer;
  }
  public void setCustomer(EntityInfo customer) {
    this.customer = customer;
  }

  
  /**
   * Address and geographical coordinates
   **/
  @ApiModelProperty(required = true, value = "Address and geographical coordinates")
  @JsonProperty("location")
  public Location getLocation() {
    return location;
  }
  public void setLocation(Location location) {
    this.location = location;
  }

  
  /**
   * Invoice info for the Merchant
   **/
  @ApiModelProperty(required = true, value = "Invoice info for the Merchant")
  @JsonProperty("invoiceInfo")
  public InvoiceInfo getInvoiceInfo() {
    return invoiceInfo;
  }
  public void setInvoiceInfo(InvoiceInfo invoiceInfo) {
    this.invoiceInfo = invoiceInfo;
  }

  
  /**
   * Website URL
   **/
  @ApiModelProperty(value = "Website URL")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Merchant contacts
   **/
  @ApiModelProperty(value = "Merchant contacts")
  @JsonProperty("contacts")
  public Contacts getContacts() {
    return contacts;
  }
  public void setContacts(Contacts contacts) {
    this.contacts = contacts;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantCreate {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  companyName: ").append(companyName).append("\n");
    sb.append("  legalRepresentative: ").append(legalRepresentative).append("\n");
    sb.append("  customer: ").append(customer).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  invoiceInfo: ").append(invoiceInfo).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  contacts: ").append(contacts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
