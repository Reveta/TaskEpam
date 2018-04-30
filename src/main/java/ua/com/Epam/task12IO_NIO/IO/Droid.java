package ua.com.Epam.task12IO_NIO.IO;

import java.io.Serializable;

public class Droid implements Serializable {

  private String name;

  public Droid(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Droid{" +
        "name='" + name + '\'' +
        '}';
  }
}
