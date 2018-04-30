package ua.com.Epam.patternChainOfResponsibility.ver1.MessagePrinters;

public class FileMessagePrint extends MessagePrinter {

  public FileMessagePrint(
      MessagePrinter nextMessagePrinter) {
    super(nextMessagePrinter);
  }

  @Override
  void printMessage(String message) {
    System.out.println("Print to file: " + message);
  }
}
