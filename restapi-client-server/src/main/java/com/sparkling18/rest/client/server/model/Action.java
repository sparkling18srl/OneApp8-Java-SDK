package com.sparkling18.rest.client.server.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Resource action
 **/
@ApiModel(description = "Resource action")
public class Action  {
  
  private String name = null;
  private String label = null;
  private String url = null;

  
  /**
   * Action name, acts as unique action identifier for the resource
   **/
  @ApiModelProperty(required = true, value = "Action name, acts as unique action identifier for the resource")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Printable, localized action name to represent the action in the UI
   **/
  @ApiModelProperty(required = true, value = "Printable, localized action name to represent the action in the UI")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * URL to call to perform the action
   **/
  @ApiModelProperty(required = true, value = "URL to call to perform the action")
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
    sb.append("class Action {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  label: ").append(label).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
