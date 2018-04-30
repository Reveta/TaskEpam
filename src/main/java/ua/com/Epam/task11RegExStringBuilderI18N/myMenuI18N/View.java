package ua.com.Epam.task11RegExStringBuilderI18N.myMenuI18N;

import com.Utils;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import ua.com.Epam.task11RegExStringBuilderI18N.lessonMaterials.java.com.pavelchak.View.Printable;

public class View {

  private List<String> menuText;
  private Map<Integer, Printable> menuMetods;

  Locale locale;
  ResourceBundle bundle;

  private static View view;

  private View() {
    locale = new Locale("uk");
    bundle = ResourceBundle.getBundle("MyMenuTask11", locale);

    reloadMenuText();
    reloadMenuMethods();
  }

  public static void show() {

    getView();

    boolean contin = true;
    while (contin) {

      view.printMap(view.menuText);
      int choice = Utils.scanInt();
      contin = !(choice == 0);//0 це варіант вибору - вийти з програми
      try {
        view.menuMetods.get(choice).print();
      } catch (NullPointerException | SQLException ignored) {
      }
    }
  }

  static View getView() {

    if (view == null) {
      view = new View();
    }

    return view;
  }

  private void printMap(List list) {
    list.forEach(System.out::println);
  }

  void reloadMenuText() {

    menuText = new ArrayList<>();
    try {//bundle.getString is dangerous
      menuText.add(bundle.getString("1"));
      menuText.add(bundle.getString("2"));
      menuText.add(bundle.getString("3"));
      menuText.add(bundle.getString("0"));
    } catch (MissingResourceException e) {
      System.out.println("Something wrong at properties!");
    }
  }

  void reloadMenuMethods() {

    menuMetods = new LinkedHashMap<>();

    menuMetods.put(1, I18N::changeEnglish);
    menuMetods.put(2, I18N::changeUkrainian);
    menuMetods.put(3, I18N::changeGerman);
    menuMetods.put(751, I18N::changeEggs);
    menuMetods.put(0, null);
  }
}
