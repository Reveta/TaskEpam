package ua.com.Epam.task1.operation;

import static com.Utils.sout;
import static com.Utils.soutNL;

import java.util.ArrayList;
import java.util.List;
import ua.com.Epam.task1.Menu;

class SimilarOperation {

  private static Menu menu = Menu.getMenu();

  SimilarOperation() {
  }


  @Deprecated
  static void forInterval(int firstNumber, int secondNumber) {
    //sout firstNumber because fori can`t do that;
    sout(firstNumber + ", ");
    for (int i = firstNumber; i < secondNumber - 1; ) {
      i += 2;
      sout(i + ",");
    }
    soutNL();

  }

  //------------.-------------------------------------------------
  private static int backRightFirstOdd() {
    int firstNumber = menu.getFirstNumber();
    //If firstNumber is ever, skip first number;
    if (menu.getFirstNumber() % 2 == 0) {
      firstNumber += 1;
    }
    return firstNumber;
  }

  private static int backRightFirstEven() {
    int firstNumber = menu.getFirstNumber();
    //If firstNumber is odd, skip first number;
    if (menu.getFirstNumber() % 2 != 0) {
      firstNumber += 1;
    }
    return firstNumber;
  }

  static int backSumList(List<Integer> list) {
    int sum = 0;

    for (int one : list) {
      sum += one;
    }
    return sum;
  }

  static void checkVersionListsAndUpdateIfNeed() {
    if (menu.getOddList().size() > 0){
      int yourSecondOdd = (menu.getOddList().size() - 1);
      int yourSecondEven = (menu.getOddList().size() - 1);
      int yourSecond =
          yourSecondEven > yourSecondOdd ? yourSecondEven : yourSecondOdd;

      if (menu.getSecondNumber() != yourSecond) {
        updateEvenListIfNeed();
        updateOddListIfNeed();
      }
    } else {
      updateEvenListIfNeed();
      updateOddListIfNeed();
    }
  }

  

  private static void updateEvenListIfNeed() {

    int first = backRightFirstEven();
    int second = menu.getSecondNumber();

    menu.setEvenList(backIntervalList(first, second));
  }

  private static void updateOddListIfNeed() {
    int first = backRightFirstOdd();
    int second = menu.getSecondNumber();

    menu.setOddList(backIntervalList(first, second));
  }

  private static List<Integer> backIntervalList(int firstNumber, int secondNumber) {
    List<Integer> list = new ArrayList<>();

    //sout firstNumber because fori can`t do that;
    list.add(firstNumber);

    for (int i = firstNumber; i < secondNumber - 1; ) {
      i += 2;
      list.add(i);
    }

    return list;
  }

}
