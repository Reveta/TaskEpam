package ua.com.Epam.task6.task6Generics;

import lombok.Getter;
import lombok.Setter;

public class Main{

  public static void main(String[] args) {
//    showPerson(CreatingObj.getArray());

    for (Person o:CreatingObj.getArray()) {
      qwe(o);
    }
  }

  private static void qwe(Person person){
//ID
    if (person.getId() instanceof Integer){
      Integer id = (Integer) person.getId();
      System.out.println("Id "+id+id);
    }else if(person.getId() instanceof String){
      String id = (String) person.getId();
      System.out.println("Id "+id + " " + id);
    }
//Name
    if (person.getName() instanceof Integer){
      Integer id = (Integer) person.getName();
      System.out.println("Name "+id+id);
    }else if(person.getName() instanceof String){
      String id = (String) person.getName();
      System.out.println("Name "+id + " " + id);
    }
  }

//  private static <X> X showArray(List<X> list, int id){
//    for (X o:list) {
//    }
//    return null;
//  }
//
//  private static void showPerson(List<Person> people){
//    for (int i = 0; i < people.size(); i++) {
//      System.out.println(showArray(people, i).getName());
//    }
//  }


}
