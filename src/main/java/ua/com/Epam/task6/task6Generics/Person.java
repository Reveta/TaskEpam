package ua.com.Epam.task6.task6Generics;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person<T, X> {

  private T id;
  private X name;

  public Person(T id, X name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Main{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }

  public T getId() {
    return id;
  }

  public void setId(T id) {
    this.id = id;
  }

  public X getName() {
    return name;
  }

  public void setName(X name) {
    this.name = name;
  }
}
