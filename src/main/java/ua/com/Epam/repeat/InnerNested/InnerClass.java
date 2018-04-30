package ua.com.Epam.repeat.InnerNested;

public class InnerClass {

  private String name;

  class InnerInnerClass{

    private int age;

    public void showfirstInnerClass(){
      System.out.println(name);
    }
  }

}
