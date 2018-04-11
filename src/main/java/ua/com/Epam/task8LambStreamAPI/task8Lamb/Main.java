package ua.com.Epam.task8LambStreamAPI.task8Lamb;

public class Main {

  public static void main(String[] args) {
    Calculator calDod = new Calculator() {
      @Override
      public void calculate(int a, int b) {
        System.out.println(a+b);
      }
    };

    Calculator calMin = (a, b) -> {
      System.out.println(a-b);
    };

    calDod.calculate(10,49);
    calMin.calculate(10,49);
  }
}
