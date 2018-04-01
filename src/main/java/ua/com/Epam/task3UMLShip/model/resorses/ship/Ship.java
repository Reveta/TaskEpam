package ua.com.Epam.task3UMLShip.model.resorses.ship;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ship {

  private String name;
  private String type;
  private int speed;
  private int maxWeight;
  private int price;

  public Ship() {
    this.name = generateName();
  }

  private String generateName() {
    String name = "Eliza";

    int random = (int) (Math.random() * 3) + 1;

    switch (random) {
      case 1:
        name = "Jone";
        break;
      case 2:
        name = "Abrams";
        break;
      case 3:
        name = "Terminator";
        break;
    }

    return name;
  }

}
