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


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getMaxWeight() {
    return maxWeight;
  }

  public void setMaxWeight(int maxWeight) {
    this.maxWeight = maxWeight;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
