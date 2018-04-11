package ua.com.Epam.task8LambStreamAPI.task8LamdEpam;


import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {

//  public static void main(String[] args) {
//    ArrayInterface maxTwo = ((int[] a) -> a[0] > a[1] ? a[0] : a[1]);
//    ArrayInterface maxTree = ((int[] a) -> maxTwo.count(
//        new int[]{maxTwo.count(new int[]{a[0], a[1]}), a[2]}));
//
//    int[] a = {54, 65, 12};
//    System.out.println(maxTree.count(a));
//  }

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(43);
    list.add(542);
    list.add(5562);
    list.add(2142);
    list.add(442);
    list.add(12);
    list.add(549);
    list.add(52);
    list.add(542);

    int max = list.stream()
        .max((a, b) -> (a - b))
        .get();
    System.out.println(max);

    int min = list.stream()
        .min((a, b) -> (a - b))
        .get();

    System.out.println(min);

    IntSummaryStatistics ave = list.stream()
        .mapToInt((x) -> x)
        .summaryStatistics();

    System.out.println(ave.getAverage());
  }
}
