package ua.com.Epam.task6.task6Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

  static Comparator<Integer> comparator = new Comparator<Integer>() {

    @Override
    public int compare(Integer o1, Integer o2) {
      if( o1 > o2 ){
        return -1;
      }
      if( o1 < o2 ){
        return 1;
      }
      return 0;
    }
  };

  public static void main(String[] args) {
    Queue<Integer> queue = new PriorityQueue<>(5, comparator);

    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);

    queue.offer(10);

    for (int o : queue) {
      System.out.println(o + ", ");
    }
  }

}
