package ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.stopIfOk;

import ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.stopIfOk.chains.ChainModule;
import ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.stopIfOk.chains.EqualsZero;
import ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.stopIfOk.chains.LessThan;
import ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.stopIfOk.chains.MoreThan;

public class Main {

  public static void main(String[] args) {
    ChainModule chainModule =
        new LessThan(
            new EqualsZero(
                new MoreThan(
                    null
                )
            )
        );

//    chainModule.start(-11);
//    chainModule.start(0);
    chainModule.start(42);
  }
}
