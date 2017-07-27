package com.sparkling18.rest.client.server.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Entity information for other resource listing purposes
 **/
@ApiModel(description = "Entity information for other resource listing purposes")
public class EntityInfo  {
  
  private Long id = null;
  private String name = null;
  private String url = null;

  
  /**
   * Entity resource id
   **/
  @ApiModelProperty(required = true, value = "Entity resource id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Entity name
   **/
  @ApiModelProperty(required = true, value = "Entity name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * URL for the complete entity
   **/
  @ApiModelProperty(required = true, value = "URL for the complete entity")
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
    sb.append("class EntityInfo {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
