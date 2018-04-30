package ua.com.Epam.task10AnnotationReflections.task10MyAnnoTest;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {

    Person person = new Person("Roman", 17);
    GetPropertiesLogic.getPropertyName(person.getClass());
    person.aVoid();
  }
}
