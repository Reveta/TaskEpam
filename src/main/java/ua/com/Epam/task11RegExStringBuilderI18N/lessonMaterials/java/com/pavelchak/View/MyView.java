package ua.com.Epam.task11RegExStringBuilderI18N.lessonMaterials.java.com.pavelchak.View;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ua.com.Epam.task11RegExStringBuilderI18N.lessonMaterials.java.com.pavelchak.tasks.StringUtils;

public class MyView {

  private Map<String, String> menu;
  private Map<String, Printable> methodsMenu;
  private static Scanner input = new Scanner(System.in);

  Locale locale;
  ResourceBundle bundle;

  private void setMenu() {

    menu = new LinkedHashMap<>();
    menu.put("1", bundle.getString("1"));
    menu.put("2", bundle.getString("2"));
    menu.put("3", bundle.getString("3"));
    menu.put("4", bundle.getString("4"));
    menu.put("5", bundle.getString("5"));
    menu.put("Q", bundle.getString("Q"));
  }

  public MyView() {
    locale = new Locale("uk");
    bundle = ResourceBundle.getBundle("MyMenu", locale);
    setMenu();
    methodsMenu = new LinkedHashMap<>();

    methodsMenu.put("1", this::testStringUtils);
    methodsMenu.put("2", this::internationalizeMenuUkrainian);
    methodsMenu.put("3", this::internationalizeMenuEnglish);
    methodsMenu.put("4", this::testRegEx);
    methodsMenu.put("5", this::test3);
  }

  private void testStringUtils() {
    StringUtils utils = new StringUtils();
    utils.addToParameters(11)
        .addToParameters(22.05)
        .addToParameters("Pavelchak");
    System.out.println(utils.concat());
  }

  private void internationalizeMenuUkrainian() {
    locale = new Locale("uk");
    bundle = ResourceBundle.getBundle("MyMenu", locale);
    setMenu();
    show();
  }

  private void internationalizeMenuEnglish() {
    locale = new Locale("en");
    bundle = ResourceBundle.getBundle("MyMenu", locale);
    setMenu();
    show();
  }

  private void testRegEx() {
    String message = "Hello, I am Andrew";
    System.out.println(message);
    String message2 = message.replaceAll("e", "_");
    System.out.println(message2);
    String[] mm = message.split("e");
    for (String str : mm) {
      System.out.println(str);
    }
    System.out.println(message.matches("Hello, I am Andrew"));

    Pattern pattern = Pattern.compile("^Hello%");
    Matcher matcher = pattern.matcher(message);
    System.out.println(matcher.matches());
  }

  private void test3() {

    String s1 = "Cat";
    String s2 = "Cat";
    String s3 = new String("Cat");
    String s4 = s3.intern();

    System.out.println("s1 == s2 :"+(s1==s2));
    System.out.println("s1 == s3 :"+(s1==s3));

    System.out.println(System.identityHashCode(s1));
    System.out.println(System.identityHashCode(s2));
    System.out.println(System.identityHashCode(s3));
    System.out.println(System.identityHashCode(s4));
  }

  //-------------------------------------------------------------------------

  private void outputMenu() {
    System.out.println("\nMENU:");
    for (String key : menu.keySet()) {
      if (key.length() == 1) {
        System.out.println(menu.get(key));
      }
    }
  }

  public void show() {
    String keyMenu;
    do {
      outputMenu();
      System.out.println("Please, select menu point.");
      keyMenu = input.nextLine().toUpperCase();
      try {
        methodsMenu.get(keyMenu).print();
      } catch (Exception e) {
      }
    } while (!keyMenu.equals("Q"));
  }
}
