package ua.com.Epam.patternChainOfResponsibility.ver1.MessagePrinters;

public class DbMessagePrint extends MessagePrinter {

  public DbMessagePrint(
      MessagePrinter nextMessagePrinter) {
    super(nextMessagePrinter);
  }

  @Override
  void printMessage(String message) {
    System.out.println("Print to dateBase: " + message);
  }
}
