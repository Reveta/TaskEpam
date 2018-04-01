package ua.com.Epam.task1;

import static com.Utils.*;
import java.util.LinkedList;
import java.util.List;
import ua.com.Epam.task1.operation.FibonacciClass;
import ua.com.Epam.task1.operation.OutOddAndEven;
import ua.com.Epam.task1.operation.OutSumOddAndEven;

public final class Menu {

  private int firstNumber;
  private int secondNumber;
  //  private FibonacciClass fibonacciClass;
  private List<Integer> oddList = new LinkedList<>();
  private List<Integer> evenList = new LinkedList<>();


  private static Menu menu = new Menu();

  public static Menu getMenu() {
    return menu;
  }

  private Menu() {
  }


  void restartMenu() {
//    this.restartMenuAndFibonacciClasses();
    FibonacciClass.restartFibonacciClass();
    soutNL("Enter your first number: ");
    int first = scanInt();
    soutNL("Enter your second number: ");
    int second = scanInt();

    if(first < second){
      menu.setFirstNumber(first);
      menu.setSecondNumber(second);
    }else {
      menu.setFirstNumber(second);
      menu.setSecondNumber(first);
    }
    soutNL();

  }

  private void restartMenuAndFibonacciClasses() {
    menu.setFirstNumber(0);
    menu.setSecondNumber(0);
    menu.setOddList(null);
    menu.setEvenList(null);
    FibonacciClass.restartFibonacciClass();
  }

  void outOddAndEven() {

    OutOddAndEven.outOddAndEvenConsole();
  }

  void outSumOddAndEven() {

    OutSumOddAndEven.outSumOddAndEven();
  }

  void enterNumFibonacciOperation() {

    FibonacciClass.outFibonacciLoop();
  }

  void outPercentageFibonacciOddAndEven() {
    FibonacciClass.outPercentFibonacci();
  }


  void viewToString() {
    soutNL(menu.toString());
  }

  public int getFirstNumber() {

    return firstNumber;
  }

  private void setFirstNumber(int firstNumber) {
    this.firstNumber = firstNumber;
  }

  public int getSecondNumber() {
    return secondNumber;
  }

  private void setSecondNumber(int secondNumber) {
    this.secondNumber = secondNumber;
  }

  public List<Integer> getOddList() {
    return oddList;
  }

  public void setOddList(List<Integer> oddList) {
    this.oddList = oddList;
  }

  public List<Integer> getEvenList() {
    return evenList;
  }

  public void setEvenList(List<Integer> evenList) {
    this.evenList = evenList;
  }

//  public FibonacciClass getFibonacciClass() {
//    return fibonacciClass;
//  }
//
//  public void setFibonacciClass(FibonacciClass fibonacciClass) {
//    this.fibonacciClass = fibonacciClass;
//  }

  @Override
  public String toString() {
    return "Menu{\n" +
        "\nfirstNumber=" + firstNumber +
        "\n, secondNumber=" + secondNumber +
//        ", fibonacciClass=" + fibonacciClass +
        "\n, oddList=" + oddList +
        "\n, evenList=" + evenList +
        '}';
  }
}
