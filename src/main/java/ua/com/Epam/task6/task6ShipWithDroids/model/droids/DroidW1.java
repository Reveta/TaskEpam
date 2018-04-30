package ua.com.Epam.task6.task6ShipWithDroids.model.droids;

import lombok.Getter;
import lombok.Setter;

//Droid War ver1.0
@Getter
@Setter
public class DroidW1 extends Droid {

  public DroidW1(String model) {
    super.setType("DroidW1");
    super.setModel(model);
  }


}
