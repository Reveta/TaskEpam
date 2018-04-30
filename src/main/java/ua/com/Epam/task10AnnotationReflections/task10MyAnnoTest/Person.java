package ua.com.Epam.task10AnnotationReflections.task10MyAnnoTest;


@GetProperties(proprtiesFileName = "anno.properties")
public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @PropValue(fildName = "test")
  public void aVoid(){
    String string = null;
    String string2 = "4141";
    String string3 = "21asdas";
    System.out.println(string);
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
