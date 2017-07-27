package com.sparkling18.rest.client.server.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Input data for settlement setup
 **/
@ApiModel(description = "Input data for settlement setup")
public class SettlementData  {
  
  public enum AccountingStatusRequestEnum {
     to_account,  not_accountable,  accountable, 
  };
  private AccountingStatusRequestEnum accountingStatusRequest = null;
  private Long amount = null;

  
  /**
   * Transaction accounting status
   **/
  @ApiModelProperty(required = true, value = "Transaction accounting status")
  @JsonProperty("accountingStatusRequest")
  public AccountingStatusRequestEnum getAccountingStatusRequest() {
    return accountingStatusRequest;
  }
  public void setAccountingStatusRequest(AccountingStatusRequestEnum accountingStatusRequest) {
    this.accountingStatusRequest = accountingStatusRequest;
  }

  
  /**
   * Amount to account (optional and cannot exceed the pre-authorized amount)
   **/
  @ApiModelProperty(value = "Amount to account (optional and cannot exceed the pre-authorized amount)")
  @JsonProperty("amount")
  public Long getAmount() {
    return amount;
  }
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementData {\n");
    
    sb.append("  accountingStatusRequest: ").append(accountingStatusRequest).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
