package ua.com.Epam.task7.task7EnumMenu;


import com.Utils;

public class Main {

  public static void main(String[] args) {
    System.out.println("1. Start\n2. Story\n0. Exit");

    MenuVarible menuVarible;
    Menu menu = new Menu();
    String var = Utils.scanStr();

    switch (var) {
      case "1":
        menuVarible = MenuVarible.START;
        break;
      case "2":
        menuVarible = MenuVarible.STORY;
        break;
      default:
        menuVarible = MenuVarible.EXIT;
        break;
    }

    menu.setMenuVarible(menuVarible);
    menu.action(menuVarible);
  }
}
