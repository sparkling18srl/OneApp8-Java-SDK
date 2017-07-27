package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.GiftCard;
import com.sparkling18.rest.client.server.model.EpurseCard;
import com.sparkling18.rest.client.server.model.LoyaltyCard;
import com.sparkling18.rest.client.server.model.CouponCard;
import com.sparkling18.rest.client.server.model.Amount;
import com.sparkling18.rest.client.server.model.DebitCard;
import java.util.Date;
import com.sparkling18.rest.client.server.model.CreditCard;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Transaction resource representation
 **/
@ApiModel(description = "Transaction resource representation")
public class Transaction  {
  
  private String acquirerTransactionId = null;
  private String acquirerAuthorizationCode = null;
  private Date acquirerAuthorizationDate = null;
  private String terminalId = null;
  private String acquirer = null;
  private Amount amount = null;
  private Long points = null;
  private String statusMessage = null;
  private String notes = null;
  private Boolean error = null;
  private Date created = null;
  private Date updated = null;
  public enum AccountingStatusEnum {
     to_be_authorized,  authorized,  not_authorized,  to_account,  not_accountable,  accounted,  cancelled_accounted,  accountable,  account_error,  cancelled_to_account,  cancelled_account_error,  to_reverse,  reversed,  not_reversed_for_error,  accounting_pending,  reversal_pending, 
  };
  private AccountingStatusEnum accountingStatus = null;
  private Date accountingExpire = null;
  public enum TypeEnum {
     creditCard,  debitCard,  loyaltyCard,  giftCard,  epurse,  coupon,  cash, 
  };
  private TypeEnum type = null;
  private Boolean completed = null;
  private Boolean charged = null;
  private CreditCard creditCard = null;
  private DebitCard debitCard = null;
  private LoyaltyCard loyaltyCard = null;
  private GiftCard giftCard = null;
  private EpurseCard epurseCard = null;
  private CouponCard couponCard = null;

  
  /**
   * Id of the transaction on the acquirer side
   **/
  @ApiModelProperty(value = "Id of the transaction on the acquirer side")
  @JsonProperty("acquirerTransactionId")
  public String getAcquirerTransactionId() {
    return acquirerTransactionId;
  }
  public void setAcquirerTransactionId(String acquirerTransactionId) {
    this.acquirerTransactionId = acquirerTransactionId;
  }

  
  /**
   * Acquirer authorization code
   **/
  @ApiModelProperty(value = "Acquirer authorization code")
  @JsonProperty("acquirerAuthorizationCode")
  public String getAcquirerAuthorizationCode() {
    return acquirerAuthorizationCode;
  }
  public void setAcquirerAuthorizationCode(String acquirerAuthorizationCode) {
    this.acquirerAuthorizationCode = acquirerAuthorizationCode;
  }

  
  /**
   * Acquirer authorization date
   **/
  @ApiModelProperty(value = "Acquirer authorization date")
  @JsonProperty("acquirerAuthorizationDate")
  public Date getAcquirerAuthorizationDate() {
    return acquirerAuthorizationDate;
  }
  public void setAcquirerAuthorizationDate(Date acquirerAuthorizationDate) {
    this.acquirerAuthorizationDate = acquirerAuthorizationDate;
  }

  
  /**
   * The Acquirer terminal ID
   **/
  @ApiModelProperty(value = "The Acquirer terminal ID")
  @JsonProperty("terminalId")
  public String getTerminalId() {
    return terminalId;
  }
  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  
  /**
   * Acquirer handling the transaction
   **/
  @ApiModelProperty(value = "Acquirer handling the transaction")
  @JsonProperty("acquirer")
  public String getAcquirer() {
    return acquirer;
  }
  public void setAcquirer(String acquirer) {
    this.acquirer = acquirer;
  }

  
  /**
   * Amount of the transaction
   **/
  @ApiModelProperty(required = true, value = "Amount of the transaction")
  @JsonProperty("amount")
  public Amount getAmount() {
    return amount;
  }
  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  
  /**
   * Number of loyalty card points used (only present if type = 'loyaltyCard')
   **/
  @ApiModelProperty(value = "Number of loyalty card points used (only present if type = 'loyaltyCard')")
  @JsonProperty("points")
  public Long getPoints() {
    return points;
  }
  public void setPoints(Long points) {
    this.points = points;
  }

  
  /**
   * Localized status message
   **/
  @ApiModelProperty(required = true, value = "Localized status message")
  @JsonProperty("statusMessage")
  public String getStatusMessage() {
    return statusMessage;
  }
  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  
  /**
   * Details about the transaction
   **/
  @ApiModelProperty(value = "Details about the transaction")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  /**
   * whether the transaction has encountered an error or not
   **/
  @ApiModelProperty(required = true, value = "whether the transaction has encountered an error or not")
  @JsonProperty("error")
  public Boolean getError() {
    return error;
  }
  public void setError(Boolean error) {
    this.error = error;
  }

  
  /**
   * creation timestamp in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601
   **/
  @ApiModelProperty(required = true, value = "creation timestamp in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
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
  @ApiModelProperty(required = true, value = "last update timestamp in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
  @JsonProperty("updated")
  public Date getUpdated() {
    return updated;
  }
  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  
  /**
   * Transaction accounting status
   **/
  @ApiModelProperty(required = true, value = "Transaction accounting status")
  @JsonProperty("accountingStatus")
  public AccountingStatusEnum getAccountingStatus() {
    return accountingStatus;
  }
  public void setAccountingStatus(AccountingStatusEnum accountingStatus) {
    this.accountingStatus = accountingStatus;
  }

  
  /**
   * accounting expire timestamp in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601
   **/
  @ApiModelProperty(value = "accounting expire timestamp in ISO-8601 format, see http://en.wikipedia.org/wiki/ISO_8601")
  @JsonProperty("accountingExpire")
  public Date getAccountingExpire() {
    return accountingExpire;
  }
  public void setAccountingExpire(Date accountingExpire) {
    this.accountingExpire = accountingExpire;
  }

  
  /**
   * The type of payment of the transaction
   **/
  @ApiModelProperty(required = true, value = "The type of payment of the transaction")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * whether the transaction is completed or not
   **/
  @ApiModelProperty(required = true, value = "whether the transaction is completed or not")
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }
  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  
  /**
   * wheter the order has been charged or not
   **/
  @ApiModelProperty(required = true, value = "wheter the order has been charged or not")
  @JsonProperty("charged")
  public Boolean getCharged() {
    return charged;
  }
  public void setCharged(Boolean charged) {
    this.charged = charged;
  }

  
  /**
   * Obfuscated details of the credit card used (only for type = 'creditCard')
   **/
  @ApiModelProperty(value = "Obfuscated details of the credit card used (only for type = 'creditCard')")
  @JsonProperty("creditCard")
  public CreditCard getCreditCard() {
    return creditCard;
  }
  public void setCreditCard(CreditCard creditCard) {
    this.creditCard = creditCard;
  }

  
  /**
   * Obfuscated details of the debit card used (only for type = 'debitCard')
   **/
  @ApiModelProperty(value = "Obfuscated details of the debit card used (only for type = 'debitCard')")
  @JsonProperty("debitCard")
  public DebitCard getDebitCard() {
    return debitCard;
  }
  public void setDebitCard(DebitCard debitCard) {
    this.debitCard = debitCard;
  }

  
  /**
   * Obfuscated details of the loyalty used (only for type = 'loyaltyCard')
   **/
  @ApiModelProperty(value = "Obfuscated details of the loyalty used (only for type = 'loyaltyCard')")
  @JsonProperty("loyaltyCard")
  public LoyaltyCard getLoyaltyCard() {
    return loyaltyCard;
  }
  public void setLoyaltyCard(LoyaltyCard loyaltyCard) {
    this.loyaltyCard = loyaltyCard;
  }

  
  /**
   * Obfuscated details of the gift used (only for type = 'giftCard')
   **/
  @ApiModelProperty(value = "Obfuscated details of the gift used (only for type = 'giftCard')")
  @JsonProperty("giftCard")
  public GiftCard getGiftCard() {
    return giftCard;
  }
  public void setGiftCard(GiftCard giftCard) {
    this.giftCard = giftCard;
  }

  
  /**
   * Obfuscated details of the epurse used (only for type = 'epurseCard')
   **/
  @ApiModelProperty(value = "Obfuscated details of the epurse used (only for type = 'epurseCard')")
  @JsonProperty("epurseCard")
  public EpurseCard getEpurseCard() {
    return epurseCard;
  }
  public void setEpurseCard(EpurseCard epurseCard) {
    this.epurseCard = epurseCard;
  }

  
  /**
   * Obfuscated details of the coupon used (only for type = 'couponCard')
   **/
  @ApiModelProperty(value = "Obfuscated details of the coupon used (only for type = 'couponCard')")
  @JsonProperty("couponCard")
  public CouponCard getCouponCard() {
    return couponCard;
  }
  public void setCouponCard(CouponCard couponCard) {
    this.couponCard = couponCard;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("  acquirerTransactionId: ").append(acquirerTransactionId).append("\n");
    sb.append("  acquirerAuthorizationCode: ").append(acquirerAuthorizationCode).append("\n");
    sb.append("  acquirerAuthorizationDate: ").append(acquirerAuthorizationDate).append("\n");
    sb.append("  terminalId: ").append(terminalId).append("\n");
    sb.append("  acquirer: ").append(acquirer).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  points: ").append(points).append("\n");
    sb.append("  statusMessage: ").append(statusMessage).append("\n");
    sb.append("  notes: ").append(notes).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  accountingStatus: ").append(accountingStatus).append("\n");
    sb.append("  accountingExpire: ").append(accountingExpire).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  completed: ").append(completed).append("\n");
    sb.append("  charged: ").append(charged).append("\n");
    sb.append("  creditCard: ").append(creditCard).append("\n");
    sb.append("  debitCard: ").append(debitCard).append("\n");
    sb.append("  loyaltyCard: ").append(loyaltyCard).append("\n");
    sb.append("  giftCard: ").append(giftCard).append("\n");
    sb.append("  epurseCard: ").append(epurseCard).append("\n");
    sb.append("  couponCard: ").append(couponCard).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
