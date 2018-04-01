package ua.com.Epam.task3UMLShip.model.resorses;

import ua.com.Epam.task3UMLShip.model.resorses.ship.BigShip;
import ua.com.Epam.task3UMLShip.model.resorses.ship.MidShip;
import ua.com.Epam.task3UMLShip.model.resorses.ship.Ship;
import ua.com.Epam.task3UMLShip.model.resorses.ship.SmallShip;

public class Order {

  private User user;
  private int weigth;
  private Ship ship;

  public Order(User user, int weigth) {
    this.user = user;
    this.weigth = weigth;
    this.ship = findShip(weigth);
  }

  public void showOrder() {
    System.out.println(
        "Order:"
            + "\n From: " + this.user.getLogin() + ".  "
            + " Weigh of order is: " + this.weigth
            + "\n The recommend ship is: " + this.ship.getType() + " named: " + this.ship.getName()
            + ", and price: " + this.ship.getPrice()
    );
  }

  private Ship findShip(int weigth) {
    Ship ship = new Ship();

    if (weigth > 0 && weigth <= 150) {
      return new SmallShip();
    } else if (weigth > 151 && weigth <= 800) {
      return new MidShip();
    } else if (weigth > 801) {
      return new BigShip();
    }

    return ship;
  }

}