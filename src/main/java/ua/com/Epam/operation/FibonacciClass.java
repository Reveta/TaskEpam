package ua.com.Epam.operation;


import static ua.com.Epam.Utilts.sout;
import static ua.com.Epam.Utilts.soutNL;

import java.util.LinkedList;
import java.util.List;
import ua.com.Epam.Menu;
import ua.com.Epam.Utilts;

public final class FibonacciClass extends SimilarOperation{

  private int F1;
  private int F2;
  private int N;
  private List<Integer> fibonacciResult = new LinkedList<>();

  private Menu menu = Menu.getMenu();
  private static FibonacciClass fibonacciClass = new FibonacciClass();

  private FibonacciClass() {
  }

  public static FibonacciClass getFibonacciClass() {
    if (fibonacciClass == null) {
      fibonacciClass = new FibonacciClass();
    }
    return fibonacciClass;
  }

  public static void restartFibonacciClass(){
    fibonacciClass.F1 = 0;
    fibonacciClass.F2 = 0;
    fibonacciClass.N = 0;
  }

  public static void outFibonacciLoop() {

    fibonacciClass.updateFibonacciData();

    soutNL("Fibonacci loop: ");
    sout(fibonacciClass.getFibonacciResult());
    soutNL();
  }

  private void updateFibonacciData() {
    fibonacciClass.reloadFibonacciN();
    fibonacciClass.reloadFibonacciF1F2();

    int f1 = fibonacciClass.getF1();
    int f2 = fibonacciClass.getF2();
    List<Integer> list = fibonacciClass.fibonacciLoop(f1, f2);
    fibonacciClass.setFibonacciResult(list);
  }

  private void reloadFibonacciN() {
    soutNL("Enter number of iterations Fibonacci loop: ");
    this.setN(Utilts.scanInt());
  }

  private void reloadFibonacciF1F2() {
    checkVersionListsAndUpdateIfNeed();

    this.setF1(menu.getOddList().get(menu.getOddList().size() - 1));
    this.setF2(menu.getEvenList().get(menu.getEvenList().size() - 1));
  }

  private List<Integer> fibonacciLoop(int f1, int f2) {
    List<Integer> list = new LinkedList<>();
    list.add(f1);
    list.add(f2);
    int f3;
    for (int i = 0; i < fibonacciClass.N; i++) {
      f3 = f1 + f2;
      f1 = f2;
      f2 = f3;
      list.add(f3);
    }

    return list;
  }

  public static void outPercentFibonacci() {
//    if (fibonacciClass.getFibonacciResult().size() == 0) {
//      fibonacciClass.updateFibonacciData();
//    }
    fibonacciClass.updateFibonacciData();


    List<Integer> list = fibonacciClass.fibonacciResult;
    Integer lastFibonacci = list.get(list.size() - 1);

    int evenFib;
    int oddFib;

    if(lastFibonacci % 2 == 0){
      evenFib = lastFibonacci;
      oddFib = list.get(list.size() - 2);
    }else {
      oddFib = lastFibonacci;
      evenFib = list.get(list.size() - 2);
    }

    fibonacciClass.outPercentNumbers(evenFib, oddFib);
  }

  private void outPercentNumbers(int evenFib, int oddFib) {
    double sum;
    sum = evenFib + oddFib;
    double perEvenFib = (evenFib * 100)/sum;
    double perOddFib = (oddFib * 100)/sum;


    soutNL("Percent of Even fibonacci number: " + perEvenFib + "%" + " ("+ evenFib + ")");
    soutNL("Percent of Odd fibonacci number: " + perOddFib + "%"+ " ("+ oddFib + ")");
  }


  public List<Integer> getFibonacciResult() {
    return fibonacciResult;
  }

  public void setFibonacciResult(List<Integer> fibonacciResult) {
    this.fibonacciResult = fibonacciResult;
  }

  public int getF1() {
    return F1;
  }

  public void setF1(int f1) {
    F1 = f1;
  }

  public int getF2() {
    return F2;
  }

  public void setF2(int f2) {
    F2 = f2;
  }

  public int getN() {
    return N;
  }

  public void setN(int n) {
    N = n;
  }
}
