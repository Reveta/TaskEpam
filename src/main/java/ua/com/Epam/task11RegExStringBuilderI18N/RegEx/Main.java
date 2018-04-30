package ua.com.Epam.task11RegExStringBuilderI18N.RegEx;

public class Main {

  public static void main(String[] args) {
    String s = " Roman takuy molodec! Classna robota, bro!".trim();

    System.out.println(s);
    System.out.println(s.charAt(0));
    System.out.println((String.valueOf(s.charAt(0)).matches("[A-Z]")));

    String q = " Roman takuy molodec! Classna robota, bro!".trim();
    String[] split = q.split("\\s");

    for (String s1 : split) {
      System.out.println(s1);
    }

    String c = " Roman takuy molodec! Classna robota, bro!".trim();
    System.out.println(c.replaceAll("[A-Z]", "_"));


  }
}
