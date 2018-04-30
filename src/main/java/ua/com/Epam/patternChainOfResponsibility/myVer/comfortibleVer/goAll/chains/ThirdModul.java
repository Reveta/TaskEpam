package ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.goAll.chains;

public class ThirdModul extends ChainModul {

  public ThirdModul(
      ChainModul chainModul) {
    super(chainModul);
  }

  @Override
  void check(Number number) {
    System.out.println("Third modul finish: " + number.intValue());
  }
}
