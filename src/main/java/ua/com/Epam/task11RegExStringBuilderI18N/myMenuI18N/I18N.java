package ua.com.Epam.task11RegExStringBuilderI18N.myMenuI18N;

import java.util.Locale;
import java.util.ResourceBundle;

class I18N {

  static void changeEnglish() {

    changeLang("uk");
  }

  static void changeUkrainian() {

    changeLang("ua");
  }

  static void changeGerman() {

    changeLang("de");
  }

  static void changeEggs() {

   changeLang("gopto");
  }

  private static void changeLang(String lang){

    View view = View.getView();
    Locale locale = new Locale(lang);

    view.locale = locale;
    view.bundle =
        ResourceBundle.getBundle("MyMenuTask11", locale);
    view.reloadMenuText();
  }


}
