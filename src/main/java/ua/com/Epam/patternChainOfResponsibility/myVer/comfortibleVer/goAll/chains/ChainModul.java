package ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.goAll.chains;

public abstract class ChainModul {

  ChainModul chainModul;

  public ChainModul(ChainModul chainModul) {
    this.chainModul = chainModul;
  }

  abstract void check(Number number);

  public void start(Number number){
    check(number);
    if (chainModul != null){chainModul.start(number);}
  }

}
