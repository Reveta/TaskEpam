package ua.com.Epam.task8LambStreamAPI.task8Commander.computer;

public class TurnOffCommander implements CommanderComputer {

  Computer thisComputer;

  public TurnOffCommander(
      Computer computer) {
    this.thisComputer = computer;
  }

  @Override
  public void execute() {
    thisComputer.turnOff();
  }
}
