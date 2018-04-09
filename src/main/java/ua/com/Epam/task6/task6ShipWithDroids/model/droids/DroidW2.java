package ua.com.Epam.task6.task6ShipWithDroids.model.droids;

import lombok.Getter;
import lombok.Setter;
//Droid War ver2.0
@Setter
@Getter
public class DroidW2 extends Droid {

  public DroidW2(String model) {
    super.setType("DroidW2");
    super.setModel(model);
  }
}
