package ua.com.Epam.task6.task6ShipWithDroids.model.droids;

import lombok.Getter;
import lombok.Setter;
//Droid help personal ver1.0
@Getter
@Setter
public class DroidHP1 extends Droid{

  public DroidHP1(String model) {
    super.setType("DroidFP1");
    super.setModel(model);
  }
}
