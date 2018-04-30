package ua.com.Epam.patternChainOfResponsibility.ver2.handlers;

public abstract class ChainOfResponibility {

  private ChainOfResponibility chaine;

  void nextChaine(ChainOfResponibility nextChaine){
    chaine = nextChaine;
  }

  void requestProcess(Number number){

  }
}
