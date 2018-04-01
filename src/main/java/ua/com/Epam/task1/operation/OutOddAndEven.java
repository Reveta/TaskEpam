package ua.com.Epam.task1.operation;

import static com.Utils.soutNL;

import com.Utils;
import java.util.List;
import ua.com.Epam.task1.Menu;

public final class OutOddAndEven extends SimilarOperation {

  private static Menu menu = Menu.getMenu();

  public static void outOddAndEvenConsole() {
    checkVersionListsAndUpdateIfNeed();

    outListConsole("All odd numbers: ", menu.getOddList());
    outListConsole("All even numbers: ", menu.getEvenList());
  }

  private static void outListConsole(String message, List<Integer> list) {
    soutNL(message);
//    sout(list);
    soutNL();
  }
}
