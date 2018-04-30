package ua.com.Epam.patternChainOfResponsibility.ver1;

import ua.com.Epam.patternChainOfResponsibility.ver1.MessagePrinters.ConsoleMessagePrint;
import ua.com.Epam.patternChainOfResponsibility.ver1.MessagePrinters.DbMessagePrint;
import ua.com.Epam.patternChainOfResponsibility.ver1.MessagePrinters.FileMessagePrint;
import ua.com.Epam.patternChainOfResponsibility.ver1.MessagePrinters.MessagePrinter;

public class Main {

  public static void main(String[] args) {
    MessagePrinter messagePrinter =
        new ConsoleMessagePrint(
            new FileMessagePrint(
                new DbMessagePrint(null)));



    messagePrinter.print("Hello");
  }
}
