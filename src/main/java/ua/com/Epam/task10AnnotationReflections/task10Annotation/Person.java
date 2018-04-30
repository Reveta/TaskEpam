package ua.com.Epam.task10AnnotationReflections.task10Annotation;

@MyAnnotate
public class Person {
  @ChangeField(replace = "Jone")
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
