package com.example.training.jackson;

public class Project {
  private int id;
  private String name;

  private Details details;

  public Project(){}

  public Project(int id, String name, Details details) {
    this.id = id;
    this.name = name;
    this.details = details;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setDetails(Details details) {
    this.details = details;
  }

  public Details getDetails() {
    return details;
  }

  @Override
  public String toString() {
    return this.name + " " + this.details.toString();
  }
}
