package ua.com.Epam.patternChainOfResponsibility.ver1.MessagePrinters;

public class ConsoleMessagePrint extends MessagePrinter {

  public ConsoleMessagePrint(
      MessagePrinter nextMessagePrinter) {
    super(nextMessagePrinter);
  }

  @Override
  void printMessage(String message) {
    System.out.println("Print to console: " + message);
  }
}