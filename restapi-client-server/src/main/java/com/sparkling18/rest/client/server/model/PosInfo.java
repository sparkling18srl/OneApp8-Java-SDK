package com.sparkling18.rest.client.server.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * POS configuration information
 **/
@ApiModel(description = "POS configuration information")
public class PosInfo  {
  
  private String siaCode = null;
  private String terminalId = null;
  private String gtId = null;
  private String gtIPAddress = null;
  private Integer gtTCPPort = null;

  
  /**
   * SIA code
   **/
  @ApiModelProperty(required = true, value = "SIA code")
  @JsonProperty("siaCode")
  public String getSiaCode() {
    return siaCode;
  }
  public void setSiaCode(String siaCode) {
    this.siaCode = siaCode;
  }

  
  /**
   * POS Terminal ID number, only digits
   **/
  @ApiModelProperty(required = true, value = "POS Terminal ID number, only digits")
  @JsonProperty("terminalId")
  public String getTerminalId() {
    return terminalId;
  }
  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  
  /**
   * GT ID number, only digits
   **/
  @ApiModelProperty(required = true, value = "GT ID number, only digits")
  @JsonProperty("gtId")
  public String getGtId() {
    return gtId;
  }
  public void setGtId(String gtId) {
    this.gtId = gtId;
  }

  
  /**
   * GT IP Address as a string in dot-decimal notation, see http://en.wikipedia.org/wiki/Dot-decimal_notation#IPv4_address
   **/
  @ApiModelProperty(required = true, value = "GT IP Address as a string in dot-decimal notation, see http://en.wikipedia.org/wiki/Dot-decimal_notation#IPv4_address")
  @JsonProperty("gtIPAddress")
  public String getGtIPAddress() {
    return gtIPAddress;
  }
  public void setGtIPAddress(String gtIPAddress) {
    this.gtIPAddress = gtIPAddress;
  }

  
  /**
   * GT TCP Port number
   **/
  @ApiModelProperty(required = true, value = "GT TCP Port number")
  @JsonProperty("gtTCPPort")
  public Integer getGtTCPPort() {
    return gtTCPPort;
  }
  public void setGtTCPPort(Integer gtTCPPort) {
    this.gtTCPPort = gtTCPPort;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PosInfo {\n");
    
    sb.append("  siaCode: ").append(siaCode).append("\n");
    sb.append("  terminalId: ").append(terminalId).append("\n");
    sb.append("  gtId: ").append(gtId).append("\n");
    sb.append("  gtIPAddress: ").append(gtIPAddress).append("\n");
    sb.append("  gtTCPPort: ").append(gtTCPPort).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
