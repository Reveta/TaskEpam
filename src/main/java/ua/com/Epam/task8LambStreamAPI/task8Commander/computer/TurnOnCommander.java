package ua.com.Epam.task8LambStreamAPI.task8Commander.computer;

public class TurnOnCommander implements CommanderComputer {

  Computer thisComputer;

  public TurnOnCommander(Computer thisComputer) {
    this.thisComputer = thisComputer;
  }

  @Override
  public void execute() {
    thisComputer.turnOn();
  }
}
