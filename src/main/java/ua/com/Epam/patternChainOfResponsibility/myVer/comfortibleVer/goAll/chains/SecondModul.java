package ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.goAll.chains;

public class SecondModul extends ChainModul {

  public SecondModul(
      ChainModul chainModul) {
    super(chainModul);
  }

  @Override
  void check(Number number) {
    System.out.println("Second modul finish: " + number.intValue());
  }
}
