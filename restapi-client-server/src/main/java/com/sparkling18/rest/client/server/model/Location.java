package com.sparkling18.rest.client.server.model;

import com.sparkling18.rest.client.server.model.Coordinate;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Location resource representation
 **/
@ApiModel(description = "Location resource representation")
public class Location  {
  
  private String address = null;
  private String postalCode = null;
  private String city = null;
  private String province = null;
  private String country = null;
  private Coordinate coordinates = null;

  
  /**
   * Street address
   **/
  @ApiModelProperty(required = true, value = "Street address")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * postal code (e.g. ZIP, CAP, etc.
   **/
  @ApiModelProperty(required = true, value = "postal code (e.g. ZIP, CAP, etc.")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   * City
   **/
  @ApiModelProperty(required = true, value = "City")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * Province or State
   **/
  @ApiModelProperty(required = true, value = "Province or State")
  @JsonProperty("province")
  public String getProvince() {
    return province;
  }
  public void setProvince(String province) {
    this.province = province;
  }

  
  /**
   * country code, ISO-3166 Alpha-2 Country Code, see http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
   **/
  @ApiModelProperty(required = true, value = "country code, ISO-3166 Alpha-2 Country Code, see http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * Geographical coordinates
   **/
  @ApiModelProperty(value = "Geographical coordinates")
  @JsonProperty("coordinates")
  public Coordinate getCoordinates() {
    return coordinates;
  }
  public void setCoordinates(Coordinate coordinates) {
    this.coordinates = coordinates;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("  address: ").append(address).append("\n");
    sb.append("  postalCode: ").append(postalCode).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  province: ").append(province).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  coordinates: ").append(coordinates).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
