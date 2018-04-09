package ua.com.Epam.task6.task6Generics;

import java.util.ArrayList;
import java.util.List;

public class CreatingObj {

  public static List<Person> getArray() {
    List<Person> list = new ArrayList<>();

    Person person1 = new Person(12, "Roman");
    Person person2 = new Person("ewqeqw", "Taras");
    Person person3 = new Person(43, 45);

    list.add(person1);
    list.add(person2);
    list.add(person3);

    return list;
  }


}
