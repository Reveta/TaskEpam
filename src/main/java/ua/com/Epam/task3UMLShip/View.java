package ua.com.Epam.task3UMLShip;


import com.Utils;
//import ua.com.Epam.task3UMLShip.controller.ControllerOrder;
import ua.com.Epam.task3UMLShip.model.Model;
import ua.com.Epam.task3UMLShip.model.resorses.User;

public class View {

  static void startProgram(){
    menuLogin();
  }

  private static void menuLogin() {
    while (true) {
      showActiveUser();
      showAuthenticationMenu();

    }
  }

  private static void menuOrder() {
    showActiveUser();
    showCabinetMenu();
  }

  private static void showCabinetMenu() {
    System.out.println(
        Utils.BLUE
            + "\n 1. Create new order"
            + "\n 2. Show all orders"
            + "\n 3. Change user"
            + "\n 0 .Exit"
            + Utils.RESET);
    switch (Utils.scanInt()) {
      case 1:
//        ControllerOrder.createOrder().showOrder();
        break;
      case 2:
//        ControllerOrder.showAllOrders(Model.getModel().getActiveUser().getOderList());
        break;
      case 3:
        break;
      case 0:
        break;
    }
  }

  private static void showActiveUser() {
    Model model = Model.getModel();
    System.out.println();
    System.out.println(
        model.getActiveUser() != null ?
            "You are: " + model.getActiveUser().getLogin() : "You should to login");
    System.out.println();
  }

  private static void showAuthenticationMenu() {
    System.out.println(
        Utils.BLUE
            + "Enter Your choice:"
            + "\n 1. Login"
            + "\n 2. Create new user"
            + "\n 3. Cabinet"
            + "\n 4. LogOut"
            + "\n 0. Exit"
            + Utils.RESET);
    switch (Utils.scanInt()) {
      case 1:
        Model.getModel().login();
        break;
      case 2:
        User.createUser();
        break;
      case 3:
        if (Model.getModel().getActiveUser() != null) {
          View.menuOrder();
        } else {
          System.out.println("You need to login or create new account");
        }
        break;
      case 4:
        Model.getModel().setActiveUser(null);
        break;
      case 0:
        System.exit(0);
        break;
    }
  }
}
