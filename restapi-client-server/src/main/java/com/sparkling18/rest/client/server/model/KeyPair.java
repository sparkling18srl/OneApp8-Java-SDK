package com.sparkling18.rest.client.server.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Resource KeyPair
 **/
@ApiModel(description = "Resource KeyPair")
public class KeyPair  {
  
  private String key = null;
  private String value = null;

  
  /**
   * The Key
   **/
  @ApiModelProperty(required = true, value = "The Key")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * The Value
   **/
  @ApiModelProperty(required = true, value = "The Value")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyPair {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
