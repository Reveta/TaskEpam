package ua.com.Epam.task8LambStreamAPI.task8Commander.user;

import ua.com.Epam.task8LambStreamAPI.task8Commander.computer.ReloadCommander;
import ua.com.Epam.task8LambStreamAPI.task8Commander.computer.TurnOffCommander;
import ua.com.Epam.task8LambStreamAPI.task8Commander.computer.TurnOnCommander;

public class User {
  private String name;

  TurnOnCommander turnOnCommander;
  TurnOffCommander turnOffCommander;
  ReloadCommander reloadCommander;

  public User(String name,
      TurnOnCommander turnOnCommander,
      TurnOffCommander turnOffCommander,
      ReloadCommander reloadCommander) {
    this.name = name;
    this.turnOnCommander = turnOnCommander;
    this.turnOffCommander = turnOffCommander;
    this.reloadCommander = reloadCommander;
  }

  public void doComandTurnOn(){turnOnCommander.execute();}
  public void doComandTurnOff(){turnOffCommander.execute();}
  public void doComandReload(){reloadCommander.execute();}
}
