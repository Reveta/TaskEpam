package ua.com.Epam.task3UMLShip.controller;

import com.Utils;
import java.util.List;
import ua.com.Epam.task3UMLShip.model.Model;
import ua.com.Epam.task3UMLShip.model.resorses.Order;
import ua.com.Epam.task3UMLShip.model.resorses.User;

public class ControllerOrder {

  public ControllerOrder() {
  }

  public static Order createOrder() {
    System.out.print("Enter weight of your order: ");
    int weigh = Utils.scanInt();
    Order order = new Order(Model.getModel().getActiveUser(), weigh);
    addOrderToDB(order);

    return order;
  }

  private static void addOrderToDB(Order order){
    User activeUser = Model.getModel().getActiveUser();
    List<Order> list = activeUser.getOderList();
    list.add(order);
    activeUser.setOderList(list);
  }

  public static void showAllOrders(List<Order> list){
    for (Order order: list) {
      order.showOrder();
    }
  }

}
