package com.example.training;

import com.example.training.builder.User;
import com.example.training.jackson.Project;
import com.example.training.singleton.Singleton;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Application {
  public static void main(String[] args) throws IOException {
    //builder pattern
    User user = new User
        .Builder()
        .firstName("John")
        .lastName("Doe")
        .age(32)
        .email("john_doe@gmail.com")
        .phone("729901000")
        .build();
    System.out.println(user.toString());

    //singleton pattern
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    if(singleton1 == singleton2)
      System.out.println("Same singleton instance");


    //Jackson serialization and deserialization
    ObjectMapper objectMapper = new ObjectMapper();
    File file = new File("C:\\Users\\tamara.mitevska\\ScaleFocus\\courses\\java_qa_training\\java_training_design_principles\\src\\main\\resources\\project.json");
    Project project = objectMapper.readValue(file, Project.class);
    System.out.println("After converting JSON to OBJECT :");
    System.out.println(project.toString());

    String jsonString = objectMapper.writeValueAsString(project);
    System.out.println("After converting Map to JSON :");
    System.out.println(jsonString);
  }
}
