package ua.com.Epam.task8LambStreamAPI.task8Commander.computer;

public class ReloadCommander implements CommanderComputer {

  Computer thisComputer;

  public ReloadCommander(Computer computer) {
    this.thisComputer = computer;
  }

  @Override
  public void execute() {
    thisComputer.reload();
  }
}
