package com.example.training.jackson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "street", "streetNumber", "city", "price" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class Details {
  private String city;
  private String street;
  private int streetNumber;
  @JsonIgnore
  private int price;

  public Details() {}

  public Details(String street, int streetNumber, String city, int price) {
    this.street = street;
    this.streetNumber = streetNumber;
    this.city = city;
    this.price = price;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public void setStreetNumber(int streetNumber) {
    this.streetNumber = streetNumber;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getStreet() {
    return street;
  }

  public int getStreetNumber() {
    return streetNumber;
  }

  public String getCity() {
    return city;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Details: " + this.street + " " + this.streetNumber + " , " + this.city + " - " + this.price;
  }
}
