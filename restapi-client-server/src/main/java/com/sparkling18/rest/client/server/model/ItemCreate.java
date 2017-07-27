package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.KeyPair;
import com.sparkling18.rest.client.server.model.EntityInfo;
import com.sparkling18.rest.client.server.model.Amount;
import java.util.*;
import com.sparkling18.rest.client.server.model.ItemMetaData;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Item entity representation for Create Statement
 **/
@ApiModel(description = "Item entity representation for Create Statement")
public class ItemCreate  {
  
  private String externalId = null;
  private EntityInfo merchant = null;
  private EntityInfo store = null;
  public enum CompositionEnum {
     SINGLE,  BUNDLE, 
  };
  private CompositionEnum composition = null;
  public enum TypeEnum {
     PHYSICAL,  VIRTUAL, 
  };
  private TypeEnum type = null;
  private String sku = null;
  private String ean = null;
  private String upc = null;
  private String model = null;
  private String name = null;
  private Long quantity = null;
  private String brand = null;
  private Amount discount = null;
  private String description = null;
  private EntityInfo category = null;
  private Amount price = null;
  private List<EntityInfo> bundleItems = new ArrayList<EntityInfo>() ;
  private List<EntityInfo> attachments = new ArrayList<EntityInfo>() ;
  private ItemMetaData metaData = null;
  private List<KeyPair> extraInfo = new ArrayList<KeyPair>() ;

  
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
   * merchant resource for the item
   **/
  @ApiModelProperty(required = true, value = "merchant resource for the item")
  @JsonProperty("merchant")
  public EntityInfo getMerchant() {
    return merchant;
  }
  public void setMerchant(EntityInfo merchant) {
    this.merchant = merchant;
  }

  
  /**
   * The store resource entity
   **/
  @ApiModelProperty(value = "The store resource entity")
  @JsonProperty("store")
  public EntityInfo getStore() {
    return store;
  }
  public void setStore(EntityInfo store) {
    this.store = store;
  }

  
  /**
   * The package type of this Item
   **/
  @ApiModelProperty(required = true, value = "The package type of this Item")
  @JsonProperty("composition")
  public CompositionEnum getComposition() {
    return composition;
  }
  public void setComposition(CompositionEnum composition) {
    this.composition = composition;
  }

  
  /**
   * The physic type of this Item
   **/
  @ApiModelProperty(required = true, value = "The physic type of this Item")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * SKU
   **/
  @ApiModelProperty(value = "SKU")
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  
  /**
   * EAN
   **/
  @ApiModelProperty(value = "EAN")
  @JsonProperty("ean")
  public String getEan() {
    return ean;
  }
  public void setEan(String ean) {
    this.ean = ean;
  }

  
  /**
   * UPC
   **/
  @ApiModelProperty(value = "UPC")
  @JsonProperty("upc")
  public String getUpc() {
    return upc;
  }
  public void setUpc(String upc) {
    this.upc = upc;
  }

  
  /**
   * Model
   **/
  @ApiModelProperty(value = "Model")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  
  /**
   * Name
   **/
  @ApiModelProperty(required = true, value = "Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The number of physical product of this item
   **/
  @ApiModelProperty(value = "The number of physical product of this item")
  @JsonProperty("quantity")
  public Long getQuantity() {
    return quantity;
  }
  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  
  /**
   * Brand
   **/
  @ApiModelProperty(value = "Brand")
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  
  /**
   * Discount on item full price
   **/
  @ApiModelProperty(value = "Discount on item full price")
  @JsonProperty("discount")
  public Amount getDiscount() {
    return discount;
  }
  public void setDiscount(Amount discount) {
    this.discount = discount;
  }

  
  /**
   * Description
   **/
  @ApiModelProperty(required = true, value = "Description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Category
   **/
  @ApiModelProperty(value = "Category")
  @JsonProperty("category")
  public EntityInfo getCategory() {
    return category;
  }
  public void setCategory(EntityInfo category) {
    this.category = category;
  }

  
  /**
   * Full price
   **/
  @ApiModelProperty(required = true, value = "Full price")
  @JsonProperty("price")
  public Amount getPrice() {
    return price;
  }
  public void setPrice(Amount price) {
    this.price = price;
  }

  
  /**
   * References to the items of this bundle
   **/
  @ApiModelProperty(value = "References to the items of this bundle")
  @JsonProperty("bundleItems")
  public List<EntityInfo> getBundleItems() {
    return bundleItems;
  }
  public void setBundleItems(List<EntityInfo> bundleItems) {
    this.bundleItems = bundleItems;
  }

  
  /**
   * References to the images to attach to this item
   **/
  @ApiModelProperty(required = true, value = "References to the images to attach to this item")
  @JsonProperty("attachments")
  public List<EntityInfo> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<EntityInfo> attachments) {
    this.attachments = attachments;
  }

  
  /**
   * Optional meta data of this item
   **/
  @ApiModelProperty(value = "Optional meta data of this item")
  @JsonProperty("metaData")
  public ItemMetaData getMetaData() {
    return metaData;
  }
  public void setMetaData(ItemMetaData metaData) {
    this.metaData = metaData;
  }

  
  /**
   * Map key/value of item extra infos
   **/
  @ApiModelProperty(value = "Map key/value of item extra infos")
  @JsonProperty("extraInfo")
  public List<KeyPair> getExtraInfo() {
    return extraInfo;
  }
  public void setExtraInfo(List<KeyPair> extraInfo) {
    this.extraInfo = extraInfo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemCreate {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  merchant: ").append(merchant).append("\n");
    sb.append("  store: ").append(store).append("\n");
    sb.append("  composition: ").append(composition).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  ean: ").append(ean).append("\n");
    sb.append("  upc: ").append(upc).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  brand: ").append(brand).append("\n");
    sb.append("  discount: ").append(discount).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  bundleItems: ").append(bundleItems).append("\n");
    sb.append("  attachments: ").append(attachments).append("\n");
    sb.append("  metaData: ").append(metaData).append("\n");
    sb.append("  extraInfo: ").append(extraInfo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
