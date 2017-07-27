package com.sparkling18.rest.client.server.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Invoicing information
 **/
@ApiModel(description = "Invoicing information")
public class InvoiceInfo  {
  
  private String name = null;
  private String vatCountry = null;
  private String vatNumber = null;
  private String reaCode = null;
  private String fiscalCode = null;
  private String atecoCode = null;

  
  /**
   * Name of the entity
   **/
  @ApiModelProperty(required = true, value = "Name of the entity")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * VAT Country, ISO-3166 Alpha-2 Country Code, see http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
   **/
  @ApiModelProperty(required = true, value = "VAT Country, ISO-3166 Alpha-2 Country Code, see http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2")
  @JsonProperty("vatCountry")
  public String getVatCountry() {
    return vatCountry;
  }
  public void setVatCountry(String vatCountry) {
    this.vatCountry = vatCountry;
  }

  
  /**
   * VAT Number or other fiscal number
   **/
  @ApiModelProperty(required = true, value = "VAT Number or other fiscal number")
  @JsonProperty("vatNumber")
  public String getVatNumber() {
    return vatNumber;
  }
  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  
  /**
   * Italian 'Codice REA'
   **/
  @ApiModelProperty(value = "Italian 'Codice REA'")
  @JsonProperty("reaCode")
  public String getReaCode() {
    return reaCode;
  }
  public void setReaCode(String reaCode) {
    this.reaCode = reaCode;
  }

  
  /**
   * Italian 'Codice Fiscale'
   **/
  @ApiModelProperty(value = "Italian 'Codice Fiscale'")
  @JsonProperty("fiscalCode")
  public String getFiscalCode() {
    return fiscalCode;
  }
  public void setFiscalCode(String fiscalCode) {
    this.fiscalCode = fiscalCode;
  }

  
  /**
   * Italian 'Codice ATECO'
   **/
  @ApiModelProperty(value = "Italian 'Codice ATECO'")
  @JsonProperty("atecoCode")
  public String getAtecoCode() {
    return atecoCode;
  }
  public void setAtecoCode(String atecoCode) {
    this.atecoCode = atecoCode;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceInfo {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  vatCountry: ").append(vatCountry).append("\n");
    sb.append("  vatNumber: ").append(vatNumber).append("\n");
    sb.append("  reaCode: ").append(reaCode).append("\n");
    sb.append("  fiscalCode: ").append(fiscalCode).append("\n");
    sb.append("  atecoCode: ").append(atecoCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
