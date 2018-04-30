package ua.com.Epam.task12IO_NIO.IOtryWithResorses;

import java.io.Serializable;

public class Flower implements Serializable {

  private String name;

  public Flower(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Flower{" +
        "name='" + name + '\'' +
        '}';
  }
}
