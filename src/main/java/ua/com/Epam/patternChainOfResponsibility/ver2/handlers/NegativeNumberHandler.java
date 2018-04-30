package ua.com.Epam.patternChainOfResponsibility.ver2.handlers;

public class NegativeNumberHandler extends ChainOfResponibility {

  @Override
  void requestProcess(Number number) {
    if (number.intValue() < 0) {
      System.out.println("NegativeNumberHandler: " + number.toString());
    } else {

    }
  }
}
