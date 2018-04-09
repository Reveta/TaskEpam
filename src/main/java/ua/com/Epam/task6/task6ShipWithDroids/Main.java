package ua.com.Epam.task6.task6ShipWithDroids;

import ua.com.Epam.task6.task6ShipWithDroids.model.Ship;
import ua.com.Epam.task6.task6ShipWithDroids.model.droids.DroidHP1;
import ua.com.Epam.task6.task6ShipWithDroids.model.droids.DroidW1;
import ua.com.Epam.task6.task6ShipWithDroids.model.droids.DroidW2;

public class Main {

  public static void main(String[] args) {
    Ship ship = new Ship("Creser");
    ship.addDroid(new DroidW1("w1001"));
    ship.addDroid(new DroidHP1("hp1001"));
    ship.addDroid(new DroidHP1("hp1002"));
    ship.addDroid(new DroidW1("w1002"));
    ship.addDroid(new DroidW1("w1003"));
    ship.addDroid(new DroidW2("w2001"));

    System.out.println(ship.toString());
  }
}
