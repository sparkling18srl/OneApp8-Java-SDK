package com.sparkling18.rest.client.server.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * CreditCard entity representation
 **/
@ApiModel(description = "CreditCard entity representation")
public class CreditCard  {
  
  private String walletId = null;
  private String holder = null;
  private String cardType = null;
  private String pan = null;
  private String expireMonth = null;
  private String expireYear = null;
  private String securityCode = null;

  
  /**
   * The wallet ID binded to this Credit Card
   **/
  @ApiModelProperty(value = "The wallet ID binded to this Credit Card")
  @JsonProperty("walletId")
  public String getWalletId() {
    return walletId;
  }
  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }

  
  /**
   * Holder, as printed on the card
   **/
  @ApiModelProperty(value = "Holder, as printed on the card")
  @JsonProperty("holder")
  public String getHolder() {
    return holder;
  }
  public void setHolder(String holder) {
    this.holder = holder;
  }

  
  /**
   * Card short description (es. VISA)
   **/
  @ApiModelProperty(value = "Card short description (es. VISA)")
  @JsonProperty("cardType")
  public String getCardType() {
    return cardType;
  }
  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  
  /**
   * Obfuscated PAN number (es. 4501********0001)
   **/
  @ApiModelProperty(value = "Obfuscated PAN number (es. 4501********0001)")
  @JsonProperty("pan")
  public String getPan() {
    return pan;
  }
  public void setPan(String pan) {
    this.pan = pan;
  }

  
  /**
   * Obfuscated Expire month (**)
   **/
  @ApiModelProperty(value = "Obfuscated Expire month (**)")
  @JsonProperty("expireMonth")
  public String getExpireMonth() {
    return expireMonth;
  }
  public void setExpireMonth(String expireMonth) {
    this.expireMonth = expireMonth;
  }

  
  /**
   * Obfuscated Expire year (****)
   **/
  @ApiModelProperty(value = "Obfuscated Expire year (****)")
  @JsonProperty("expireYear")
  public String getExpireYear() {
    return expireYear;
  }
  public void setExpireYear(String expireYear) {
    this.expireYear = expireYear;
  }

  
  /**
   * Obfuscated Card Security Code (***)
   **/
  @ApiModelProperty(value = "Obfuscated Card Security Code (***)")
  @JsonProperty("securityCode")
  public String getSecurityCode() {
    return securityCode;
  }
  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCard {\n");
    
    sb.append("  walletId: ").append(walletId).append("\n");
    sb.append("  holder: ").append(holder).append("\n");
    sb.append("  cardType: ").append(cardType).append("\n");
    sb.append("  pan: ").append(pan).append("\n");
    sb.append("  expireMonth: ").append(expireMonth).append("\n");
    sb.append("  expireYear: ").append(expireYear).append("\n");
    sb.append("  securityCode: ").append(securityCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
