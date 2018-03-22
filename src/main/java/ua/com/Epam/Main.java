package ua.com.Epam;

public class Main {

  public static void main(String[] args) {

    Menu menu = Menu.getMenu();

    boolean b = true;
    System.out.println("Hello!");
    menu.restartMenu();

    while (b) {
      System.out.println("\n Enter code of button.");
      System.out.println("1. Write new intervals;\n"
          + "2. Out Odd and Even sort intervals;\n"
          + "3. Out sum of Odd and Even sort intervals;\n"
          + "4. Out Fibonacci loop;\n"
          + "5. Out percent of even and odd Fibonacci.\n"
          + "0. Exit program");
      switch (Utilts.scanInt()) {
        case 1:
          menu.restartMenu();
//          menu.viewToString();
          break;
        case 2:
          menu.outOddAndEven();
//          menu.viewToString();
          break;
        case 3:
          menu.outSumOddAndEven();
//          menu.viewToString();
          break;
        case 4:
          menu.enterNumFibonacciOperation();
//          menu.viewToString();
          break;
        case 5:
          menu.outPercentageFibonacciOddAndEven();
//          menu.viewToString();
          break;
        case 0:
          b = false;
          break;
      }
    }
  }
}
