package ua.com.Epam.task6.task6ShipWithDroids.model.droids;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Droid {

  //extended Droid
  private String type;
  //Name
  private String model;

  @Override
  public String toString() {
    return "Droid{" +
        "type='" + type + '\'' +
        ", model='" + model + '\'' +
        '}';
  }
}
