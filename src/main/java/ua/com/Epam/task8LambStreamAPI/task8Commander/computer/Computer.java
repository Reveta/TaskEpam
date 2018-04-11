package ua.com.Epam.task8LambStreamAPI.task8Commander.computer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Computer {

  private String name;

  public Computer(String name) {
    this.name = name;
  }

//  public ComMet turnOn = () -> System.out.println(name + " is turning on!");
//  public ComMet turnOff = () -> System.out.println(name + " is turning off!");
//  public ComMet reload = () -> System.out.println(name + " is turning reloading!");

  void turnOn() {
    System.out.println(name + " is turning on!");
  }

  void turnOff() {
    System.out.println(name + " is turning off!");
  }

  void reload() {
    System.out.println(name + " is turning reloading!");
  }


  @FunctionalInterface
  private interface ComMet {

    void execute();
  }
}
