package com.sparkling18.rest.client.server.model;

import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * User detailed information
 **/
@ApiModel(description = "User detailed information")
public class UserInfo  {
  
  private String birthCity = null;
  private String country = null;
  private String name = null;
  private String surname = null;
  private Date birthDate = null;
  private String city = null;
  private String ssn = null;
  private String birthCountry = null;
  private String address = null;
  private String province = null;
  private String postalCode = null;

  
  /**
   * Birth city
   **/
  @ApiModelProperty(value = "Birth city")
  @JsonProperty("birthCity")
  public String getBirthCity() {
    return birthCity;
  }
  public void setBirthCity(String birthCity) {
    this.birthCity = birthCity;
  }

  
  /**
   * Birth country
   **/
  @ApiModelProperty(value = "Birth country")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * Name
   **/
  @ApiModelProperty(value = "Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Surname
   **/
  @ApiModelProperty(value = "Surname")
  @JsonProperty("surname")
  public String getSurname() {
    return surname;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }

  
  /**
   * Birth date
   **/
  @ApiModelProperty(value = "Birth date")
  @JsonProperty("birthDate")
  public Date getBirthDate() {
    return birthDate;
  }
  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  
  /**
   * City
   **/
  @ApiModelProperty(value = "City")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * Social Security Number, Codice Fiscale or other national identifier
   **/
  @ApiModelProperty(value = "Social Security Number, Codice Fiscale or other national identifier")
  @JsonProperty("ssn")
  public String getSsn() {
    return ssn;
  }
  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  
  /**
   * Country of birth
   **/
  @ApiModelProperty(value = "Country of birth")
  @JsonProperty("birthCountry")
  public String getBirthCountry() {
    return birthCountry;
  }
  public void setBirthCountry(String birthCountry) {
    this.birthCountry = birthCountry;
  }

  
  /**
   * Street address
   **/
  @ApiModelProperty(value = "Street address")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * Province or state
   **/
  @ApiModelProperty(value = "Province or state")
  @JsonProperty("province")
  public String getProvince() {
    return province;
  }
  public void setProvince(String province) {
    this.province = province;
  }

  
  /**
   * ZIP, CAP or other postal code
   **/
  @ApiModelProperty(value = "ZIP, CAP or other postal code")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    
    sb.append("  birthCity: ").append(birthCity).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  surname: ").append(surname).append("\n");
    sb.append("  birthDate: ").append(birthDate).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  ssn: ").append(ssn).append("\n");
    sb.append("  birthCountry: ").append(birthCountry).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  province: ").append(province).append("\n");
    sb.append("  postalCode: ").append(postalCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
