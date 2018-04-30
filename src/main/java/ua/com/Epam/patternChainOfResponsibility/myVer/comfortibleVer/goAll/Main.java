package ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.goAll;

import ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.goAll.chains.ChainModul;
import ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.goAll.chains.FirstModul;
import ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.goAll.chains.SecondModul;
import ua.com.Epam.patternChainOfResponsibility.myVer.comfortibleVer.goAll.chains.ThirdModul;

public class Main {

  public static void main(String[] args) {
    ChainModul chainModul =
        new SecondModul(
            new ThirdModul(
                new FirstModul(
                    null)));

    chainModul.start(42);
  }
}
