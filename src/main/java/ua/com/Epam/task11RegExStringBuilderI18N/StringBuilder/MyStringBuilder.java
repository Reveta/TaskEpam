package ua.com.Epam.task11RegExStringBuilderI18N.StringBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MyStringBuilder<T> {

  private List list;
  private StringBuilder builder;

  public MyStringBuilder() {
    this.list = new LinkedList<>();
    this.builder = new StringBuilder();
  }

  public MyStringBuilder <T>addToString(T o){
    this.builder.append(o.toString());
    return this;
  }

//  public MyStringBuilder addToString(Object t){
//    this.builder.append(t.toString());
//    return this;
//  }

  public void showToString(){
//    StringBuilder stringBuilder = new StringBuilder();
//    list.forEach(t -> stringBuilder.append(t));
//    System.out.println(list.size());
    System.out.println(builder.toString());
  }



}
