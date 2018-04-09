package ua.com.Epam.task7.task7MapMenu;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    RedBlackTree<Integer> integers = new RedBlackTree<>();
    integers.add(12);
    integers.add(42);
    integers.add(62);
    integers.add(122);
    integers.add(12);


    for (int num: integers) {
      System.out.println(num);
    }
  }
}
