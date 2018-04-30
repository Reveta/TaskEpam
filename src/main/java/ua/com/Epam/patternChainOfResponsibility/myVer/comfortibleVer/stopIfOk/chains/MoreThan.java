package ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.stopIfOk.chains;

public class MoreThan extends ChainModule {

  public MoreThan(
      ChainModule chainModule) {
    super(chainModule);
  }

  @Override
  boolean check(Number number) {
    boolean b = number.intValue() > 0;
    System.out.println(number + " > " + 0 + b);
    return true;
  }

  @Override
  void doing(Number number) {
    System.out.println(number + " є більшим за 0");
  }

}
