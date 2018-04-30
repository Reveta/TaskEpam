package ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.stopIfOk.chains;

public class EqualsZero extends ChainModule {

  public EqualsZero(
      ChainModule chainModule) {
    super(chainModule);
  }

  @Override
  boolean check(Number number) {
    boolean b = number.intValue() == 0;
    System.out.println(number + " = " + 0 + b);
    return false;
  }

  @Override
  void doing(Number number) {
    System.out.println(number + " дорівнює 0");
  }
}
