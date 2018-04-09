package ua.com.Epam.task7.task7EnumMenu;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Menu {

  private MenuVarible menuVarible;


  public Menu() {
  }

  public Menu(MenuVarible menuVarible) {
    this.menuVarible = menuVarible;
  }

  public void action(MenuVarible menuVarible) {
    switch (menuVarible) {

      case START:
        System.out.println("We start game");
        break;
      case STORY:
        System.out.println("We are reading book");
        break;
      case EXIT:
        System.out.println("The END!");
        System.exit(0);
        break;
    }
  }
}
