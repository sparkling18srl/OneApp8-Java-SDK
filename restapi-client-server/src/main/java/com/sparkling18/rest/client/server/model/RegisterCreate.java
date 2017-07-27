package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.PosInfo;
import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.InvoiceInfo;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Register resource representation
 **/
@ApiModel(description = "Register resource representation")
public class RegisterCreate  {
  
  private EntityInfo store = null;
  private String externalId = null;
  private String name = null;
  private InvoiceInfo invoiceInfo = null;
  private PosInfo posInfo = null;
  public enum TypeEnum {
     physical,  virtual, 
  };
  private TypeEnum type = null;

  
  /**
   * store resource for the register
   **/
  @ApiModelProperty(required = true, value = "store resource for the register")
  @JsonProperty("store")
  public EntityInfo getStore() {
    return store;
  }
  public void setStore(EntityInfo store) {
    this.store = store;
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
   * name of the register
   **/
  @ApiModelProperty(required = true, value = "name of the register")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Invoicing information for the register
   **/
  @ApiModelProperty(value = "Invoicing information for the register")
  @JsonProperty("invoiceInfo")
  public InvoiceInfo getInvoiceInfo() {
    return invoiceInfo;
  }
  public void setInvoiceInfo(InvoiceInfo invoiceInfo) {
    this.invoiceInfo = invoiceInfo;
  }

  
  /**
   * POS configuration information
   **/
  @ApiModelProperty(value = "POS configuration information")
  @JsonProperty("posInfo")
  public PosInfo getPosInfo() {
    return posInfo;
  }
  public void setPosInfo(PosInfo posInfo) {
    this.posInfo = posInfo;
  }

  
  /**
   * The type of register
   **/
  @ApiModelProperty(required = true, value = "The type of register")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterCreate {\n");
    
    sb.append("  store: ").append(store).append("\n");
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  invoiceInfo: ").append(invoiceInfo).append("\n");
    sb.append("  posInfo: ").append(posInfo).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
