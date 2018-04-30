package ua.com.Epam.task3UMLShip.model.resorses;

import com.Utils;
import java.util.LinkedList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import ua.com.Epam.task3UMLShip.model.Model;

@Getter
@Setter
public class User {

  private String name;
  private String login;
  private String password;
  private List<Order> oderList;

  private User(String name, String login, String password) {
    this.name = name;
    this.login = login;
    this.password = password;
  }

  private User(String login, String password) {
    this.login = login;
    this.password = password;
    this.oderList = new LinkedList<>();
  }

  public static User createUser() {
    //Create function: User can add name or no
    User user = new User(
        enterUserLogin(),
        enterAndCheckPassword()
    );//Create new User
    Model.getModel()
        .getUserList().add(user); //Add new User to DB
    Model.getModel().setActiveUser(user);
    return user;
  }

  private static String enterUserLogin() {
    System.out.println("Enter new your login");
    return Utils.scanStr();
  }

  private static String enterAndCheckPassword() {
    System.out.println("Enter new password");
    String password = Utils.scanStr();
    System.out.println("Enter password again");
    String secPassword = Utils.scanStr();
    //Check password authentication
    if (!password.equals(secPassword)) {
      System.out.println("Passwords isn`t simply!");
      return enterAndCheckPassword();
    }
    return password;
  }


  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", login='" + login + '\'' +
        ", password='" + password + '\'' +
        ", oderList=" + oderList +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Order> getOderList() {
    return oderList;
  }

  public void setOderList(List<Order> oderList) {
    this.oderList = oderList;
  }
}