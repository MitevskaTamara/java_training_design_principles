package com.example.training.builder;

public class User {
  private final String firstName;
  private final String lastName;
  private final int age;
  private final String phone;
  private final String email;

  public User(Builder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.age = builder.age;
    this.email = builder.email;
    this.phone = builder.phone;
  }

  @Override
  public String toString() {
    return this.firstName + " " + this.lastName;
  }

  public static class Builder {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String email;

    public Builder() {}

    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }
}
