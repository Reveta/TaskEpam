package ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.goAll.chains;

public class FirstModul extends ChainModul {

  public FirstModul(
      ChainModul chainModul) {
    super(chainModul);
  }

  @Override
  void check(Number number) {
    System.out.println("First model end: " + number.intValue());
  }
}
