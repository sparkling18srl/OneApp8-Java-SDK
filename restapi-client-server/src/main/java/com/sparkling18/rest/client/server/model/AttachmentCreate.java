package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.EntityInfo;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Attachment entity representation for Create statement
 **/
@ApiModel(description = "Attachment entity representation for Create statement")
public class AttachmentCreate  {
  
  private String externalId = null;
  private EntityInfo merchant = null;
  private String name = null;
  public enum ContentTypeEnum {
     IMAGE_ITEM_NO_CROP,  IMAGE_SHOWCASE_NO_CROP, 
  };
  private ContentTypeEnum contentType = null;
  private String mediaType = null;
  private String bytes = null;
  private String url = null;

  
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
   * merchant resource for the store
   **/
  @ApiModelProperty(required = true, value = "merchant resource for the store")
  @JsonProperty("merchant")
  public EntityInfo getMerchant() {
    return merchant;
  }
  public void setMerchant(EntityInfo merchant) {
    this.merchant = merchant;
  }

  
  /**
   * The name of the file
   **/
  @ApiModelProperty(required = true, value = "The name of the file")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The content type used by Sparkling18
   **/
  @ApiModelProperty(required = true, value = "The content type used by Sparkling18")
  @JsonProperty("contentType")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  
  /**
   * The media type of the file (ex. image/jpg, text/html)
   **/
  @ApiModelProperty(required = true, value = "The media type of the file (ex. image/jpg, text/html)")
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   * The bytes array of the file in base64
   **/
  @ApiModelProperty(value = "The bytes array of the file in base64")
  @JsonProperty("bytes")
  public String getBytes() {
    return bytes;
  }
  public void setBytes(String bytes) {
    this.bytes = bytes;
  }

  
  /**
   * External url to the attachment
   **/
  @ApiModelProperty(value = "External url to the attachment")
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
    sb.append("class AttachmentCreate {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  merchant: ").append(merchant).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  contentType: ").append(contentType).append("\n");
    sb.append("  mediaType: ").append(mediaType).append("\n");
    sb.append("  bytes: ").append(bytes).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
