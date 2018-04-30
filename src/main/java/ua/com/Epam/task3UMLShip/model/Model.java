package ua.com.Epam.task3UMLShip.model;

import com.Utils;
import java.util.LinkedList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import ua.com.Epam.task3UMLShip.model.resorses.User;
//some BaseDate
@Getter
@Setter
public class Model {

  private User activeUser; //space for User object what will use user at program
  private List<User> userList;


  static Model model = new Model();

  private Model() {

    userList = new LinkedList<>();
  }

  public static Model getModel() {
    if (model == null) {
      model = new Model();
    }

    return model;
  }

  public void login() {
    boolean exit = false;
    do {
      System.out.println("Enter login");
      String login = Utils.scanStr();
      if (!login.equals("0")) {
        System.out.println("Enter password");
        String password = Utils.scanStr();

        switch (userAuthenticationStatus(login, password)) {
          case 1:
            System.out.println("First, you need to registration");
            User.createUser();
            break;
          case 2:
            System.out.println("Login or password isn`t right");
            System.out.println("Enter 0 to open start menu");
            login();
            break;
          case 3:
            activeUser = getUserForLoginPassword(login, password);
            System.out.println("Login is successful!");
            break;
        }
      }
      exit = true;
    } while (!exit);
  }

  private int userAuthenticationStatus(String login, String password) {
    if (isUserListNull()) {
      return 1;
    } else if (!checkUser(login, password)) {
      return 2;
    } else {
      return 3;
    }

  }

  private User getUserForLoginPassword(String login, String password) {
    User user = null;
    for (User thisis : userList) {
      if (thisis.getLogin().equals(login) && thisis.getPassword().equals(password)) {
        user = thisis;
      }
    }
    return user;
  }

  private boolean checkUser(String login, String password) {
    return getUserForLoginPassword(login, password) != null;
  }

  private boolean isUserListNull() {
    return userList.size() == 0;
  }

  public User getActiveUser() {
    return activeUser;
  }

  public void setActiveUser(User activeUser) {
    this.activeUser = activeUser;
  }

  public List<User> getUserList() {
    return userList;
  }

  public void setUserList(List<User> userList) {
    this.userList = userList;
  }

  public static void setModel(Model model) {
    Model.model = model;
  }
}
