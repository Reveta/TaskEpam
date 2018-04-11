package ua.com.Epam.task8LambStreamAPI.task8Commander;

import ua.com.Epam.task8LambStreamAPI.task8Commander.computer.Computer;
import ua.com.Epam.task8LambStreamAPI.task8Commander.computer.ReloadCommander;
import ua.com.Epam.task8LambStreamAPI.task8Commander.computer.TurnOffCommander;
import ua.com.Epam.task8LambStreamAPI.task8Commander.computer.TurnOnCommander;
import ua.com.Epam.task8LambStreamAPI.task8Commander.user.User;

public class Main {

  public static void main(String[] args) {
    Computer computer = new Computer("IraComp");
    User user = new User("Ira",
        new TurnOnCommander(computer),
        new TurnOffCommander(computer),
        new ReloadCommander(computer)
    );

    System.out.println("Default");
    user.doComandTurnOn();
    user.doComandReload();
    user.doComandTurnOff();

    System.out.println("Lambda");

  }


}