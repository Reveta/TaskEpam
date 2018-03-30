package ua.com.Epam.task1.operation;


import static ua.com.Epam.task1.Utilts.soutNL;

import java.util.List;
import ua.com.Epam.task1.Menu;

public final class OutSumOddAndEven extends SimilarOperation {

  private static Menu menu = Menu.getMenu();

  public static void outSumOddAndEven() {
    checkVersionListsAndUpdateIfNeed();

    outSumList("Sum of all odd numbers is ", menu.getOddList());
    outSumList("Sum of all even numbers is ", menu.getEvenList());
  }

  private static void outSumList(String message, List<Integer> list) {
    int sum = backSumList(list);
    soutNL(message + sum);
  }
}
