package ua.com.Epam;

import ua.com.Epam.operation.FibonacciClass;

public class Main {

  public static void main(String[] args) {

    Menu menu = Menu.getMenu();
    FibonacciClass fibonacciClass = FibonacciClass.getFibonacciClass();

    boolean b = true;

    while (b) {
      System.out.println("Start");
      switch (Utilts.scanInt()) {
        case 1:
          menu.restartMenu();
          menu.viewToString();
          break;
        case 2:
          menu.outOddAndEven();
          menu.viewToString();
          break;
        case 3:
          menu.outSumOddAndEven();
          menu.viewToString();
          break;
        case 4:
          menu.enterNumFibonacciOperation();
          menu.viewToString();
          break;
        case 5:
          menu.outPercentageFibonacciOddAndEven();
          menu.viewToString();
          break;
        case 0:
          b = false;
          break;
      }
    }
  }
}
