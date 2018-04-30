package ua.com.Epam.task12IO_NIO.IOtryWithResorses;

import java.io.Serializable;

public class Person implements Serializable{

  private String name;
  private int age;
  private /*transient*/ Flower flower;

  public Person(String name, int age, Flower flower) {
    this.name = name;
    this.age = age;
    this.flower = flower;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", flower=" + flower +
        '}';
  }
}
