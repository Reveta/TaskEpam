package ua.com.Epam.task10AnnotationReflections.task10Annotation;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    Person person = new Person("roman", 18);
    System.out.println(person);
    handlerChangeFields(person);
    System.out.println(person);
  }

  private static void handlerChangeFields(Person person) {
    Class<? extends Person> clazz = person.getClass();
    List<Field> fieldList = Arrays.stream(clazz.getDeclaredFields())
        .collect(Collectors.toList());

    fieldList.forEach(field -> {
        field.setAccessible(true);
        if (field.isAnnotationPresent(ChangeField.class)){
          ChangeField annotation = field.getAnnotation(ChangeField.class);
          final String replace = annotation.replace();
          try {
            field.set(person, replace);
          } catch (IllegalAccessException e) {
            e.printStackTrace();
          }

        }

    });

  }

  private static void handelerCondtructor(Class clazz) {

    System.out.println(clazz.isAnnotationPresent(MyAnnotate.class));
  }


}
