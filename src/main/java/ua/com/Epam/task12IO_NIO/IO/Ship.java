package ua.com.Epam.task12IO_NIO.IO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ship implements Serializable {

  private String name;
  private List<Droid> droidList;

  public Ship(String name) {
    this.name = name;
    this.droidList = new ArrayList<>();

    this.droidList.add(new Droid("Boba"));
    this.droidList.add(new Droid("Feta"));
    this.droidList.add(new Droid("Alive"));

  }

  @Override
  public String toString() {
    return "Ship{" +
        "name='" + name + '\'' +
        ", droidList=" + droidList +
        '}';
  }
}
