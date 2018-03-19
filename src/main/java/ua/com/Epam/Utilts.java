package ua.com.Epam;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Utilts {

  public static int scanInt() {

    try {

      return new Scanner(System.in).nextInt();
    } catch (InputMismatchException ignored) {
      System.out.println("System working only with int number");
      return scanInt();
    }
  }

  public static void sout() {
    System.out.print(" ");
  }

  public static void sout(int num) {
    System.out.print(num);
  }

  public static void sout(String word) {
    System.out.print(word);
  }

  public static void sout(int[] array) {
    for (int num : array) {
      System.out.print(num + ", ");
    }
  }

  public static void sout(List<Integer> list) {
    for (int num : list) {
      System.out.print(num + ", ");
    }
  }

  public static void soutNL() {
    System.out.println(" ");
  }

  public static void soutNL(int num) {
    System.out.println(num);
  }

  public static void soutNL(String word) {
    System.out.println(word);
  }

  public static void soutNL(int[] array) {
    for (int num : array) {
      System.out.println(num);
    }
  }

  public static void soutNL(List<Integer> list) {
    for (int num : list) {
      System.out.println(num + " ");
    }
  }

  /*public String qwe(String n) {
    String name = "dasdas";
    return "dsd";
  }

  public int qwe(int n){
    return 123;
  }*/

}
