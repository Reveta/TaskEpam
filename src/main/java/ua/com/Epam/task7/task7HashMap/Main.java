package ua.com.Epam.task7.task7HashMap;

import com.Utils;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    Person person1 = new Person("Roman", 18);
    Person person2 = new Person("Taras", 19);

    Map<Person, String> map = new HashMap<>();
    map.put(person1, "RomanTB");
    map.put(person2, "TarasTB");

    System.out.println(Utils.RED + map.keySet() + Utils.RESET);
    person1.setName("Borus");
    person1.setAge(22);
    System.out.println(Utils.BLUE + map.toString() + Utils.RESET);
    System.out.println(map.size());
    System.out.println(map.containsKey(person1));

    System.out.println(map.get(person1));
  }
}
