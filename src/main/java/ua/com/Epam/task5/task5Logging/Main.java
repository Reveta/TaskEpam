package ua.com.Epam.task5.task5Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
  private static final Logger log = LogManager.getLogger(Main.class.getName());

  public static void testLogs(){
    log.trace("trace Message Logged !!!");
    log.debug("Debug Message Logged !!!");
    log.info("Info Message Logged !!!");
    log.warn("Warn Message Logged !!!");
    log.error("Error Message Logged !!!");
    log.fatal("Fatal Message Logged !!!");
  }

  public static void main(String[] args) {
    Main.testLogs();
  }
}
