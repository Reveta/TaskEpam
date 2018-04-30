package ua.com.Epam.patternChainOfResponsibility.ver1.MessagePrinters;

public abstract class MessagePrinter {

  MessagePrinter nextMessagePrinter;

//  public void setNextMessagePrinter(MessagePrinter messagePrinter) {
//    nextMessagePrinter = messagePrinter;
//  }

  public MessagePrinter(
      MessagePrinter nextMessagePrinter) {
    this.nextMessagePrinter = nextMessagePrinter;
  }

  abstract void printMessage(String message);

  public void print(String message) {
    printMessage(message);
    if (nextMessagePrinter != null) {
      nextMessagePrinter.print(message);
    }
  }

}
