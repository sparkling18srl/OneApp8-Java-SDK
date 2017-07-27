package com.sparkling18.rest.client.server.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * ItemMetaData entity representation
 **/
@ApiModel(description = "ItemMetaData entity representation")
public class ItemMetaData  {
  
  private String color = null;
  private String weight = null;
  private String height = null;
  private String width = null;
  private String depth = null;
  private String size = null;

  
  /**
   * The color of the item
   **/
  @ApiModelProperty(value = "The color of the item")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  
  /**
   * the weight of the item
   **/
  @ApiModelProperty(value = "the weight of the item")
  @JsonProperty("weight")
  public String getWeight() {
    return weight;
  }
  public void setWeight(String weight) {
    this.weight = weight;
  }

  
  /**
   * the height of the item
   **/
  @ApiModelProperty(value = "the height of the item")
  @JsonProperty("height")
  public String getHeight() {
    return height;
  }
  public void setHeight(String height) {
    this.height = height;
  }

  
  /**
   * the width of the item
   **/
  @ApiModelProperty(value = "the width of the item")
  @JsonProperty("width")
  public String getWidth() {
    return width;
  }
  public void setWidth(String width) {
    this.width = width;
  }

  
  /**
   * The depth of the item
   **/
  @ApiModelProperty(value = "The depth of the item")
  @JsonProperty("depth")
  public String getDepth() {
    return depth;
  }
  public void setDepth(String depth) {
    this.depth = depth;
  }

  
  /**
   * The size of the item
   **/
  @ApiModelProperty(value = "The size of the item")
  @JsonProperty("size")
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemMetaData {\n");
    
    sb.append("  color: ").append(color).append("\n");
    sb.append("  weight: ").append(weight).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  depth: ").append(depth).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
