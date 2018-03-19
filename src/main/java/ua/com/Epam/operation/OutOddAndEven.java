package ua.com.Epam.operation;

import static ua.com.Epam.Utilts.sout;
import static ua.com.Epam.Utilts.soutNL;

import java.util.List;
import ua.com.Epam.Menu;

public final class OutOddAndEven extends SimilarOperation {

  private static Menu menu = Menu.getMenu();

  public static void outOddAndEvenConsole() {
    checkVersionListsAndUpdateIfNeed();

    outListConsole("All odd numbers: ", menu.getOddList());
    outListConsole("All even numbers: ", menu.getEvenList());
  }

  private static void outListConsole(String message, List<Integer> list) {
    soutNL(message);
    sout(list);
    soutNL();
  }
}
