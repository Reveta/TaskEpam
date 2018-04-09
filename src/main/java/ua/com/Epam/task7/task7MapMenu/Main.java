package ua.com.Epam.task7.task7MapMenu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
//    RedBlackTree<Integer> integers = new RedBlackTree<>();
//    integers.add(12);
//    integers.add(42);
//    integers.add(62);
//    integers.add(122);
//    integers.add(12);
//
//
//    for (int num: integers) {
//      System.out.println(num);
//    }
    System.out.println("\nArrayList");
    ArrayListTest();
    System.out.println("\nLinkedList");
    linkedListTest();
    System.out.println("\nHashSet(LinkedHashSet)");
    setHashTest();
    System.out.println("\nNewTest");
    newListTest();


  }

  public static void newListTest() {
    RedBlackTree<Integer> blackTree = new RedBlackTree<>();
    for (int i = 0; i < 2000000000; i++) {
      for (int j = 0; j < 100; j++) {

        blackTree.add(i*j);
      }
    }
    System.out.println(new Date().getTime());
    System.out.println(blackTree.contains(1240077234));
    System.out.println(new Date().getTime());
  }

  public static void linkedListTest() {
    List<Integer> linkedList = new LinkedList<>();
    addvalues(linkedList);
  }

  public static void setHashTest() {
    Set<Integer> hashSet = new LinkedHashSet<>();
    addvalues(hashSet);
  }

  public static void ArrayListTest() {
    List<Integer> arrayList = new ArrayList<>();
    addvalues(arrayList);
  }

  private static void addvalues(Collection list) {
    for (int i = 0; i < 2000000000; i++) {
      list.add(i);
    }
    System.out.println("List is full");
    findNum(list);
  }

  private static void findNum(Collection list) {

//    long stTime = new Date().;
    System.out.println(new Date().getTime());
    System.out.println(list.size());
    System.out.println(list.contains(7407234));
    System.out.println(new Date().getTime());
//    boolean endTime = new Date().toInstant(stTime);
//    long totTime = (endTime - stTime);
//    System.out.println("Number has find: " + totTime);
  }
}
