package ua.com.Epam.task7.task7HashMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

  private String name;
  private Integer age;

  protected Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int hashCode() {
    return age.hashCode();
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
