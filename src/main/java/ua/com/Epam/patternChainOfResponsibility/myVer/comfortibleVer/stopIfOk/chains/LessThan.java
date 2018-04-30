package ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.stopIfOk.chains;

public class LessThan extends ChainModule {

  public LessThan(
      ChainModule chainModule) {
    super(chainModule);
  }

  @Override
  boolean check(Number number) {
    boolean b = number.intValue() < 0;
    System.out.println(number + " < " + 0 + b);
    return false;
  }

  @Override
  void doing(Number number) {
    System.out.println(number + " менше за 0");
  }

}
