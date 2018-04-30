package ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.stopIfOk.chains;

public abstract class ChainModule {

  ChainModule chainModule;

  public ChainModule(
      ChainModule chainModule) {
    this.chainModule = chainModule;
  }

  abstract boolean check(Number number);

  abstract void doing(Number number);

  public void start(Number number) {
    if (check(number)) {
      chainModule.start(number);
    } else {
      chainModule.doing(number);
    }
  }
}
