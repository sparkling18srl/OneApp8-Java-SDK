package com.sparkling18.rest.client.server.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The code of the rule used for the promotion users target
 **/
@ApiModel(description = "The code of the rule used for the promotion users target")
public class PromotionTarget  {
  
  private String name = null;

  
  /**
   * the target name
   **/
  @ApiModelProperty(value = "the target name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionTarget {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
