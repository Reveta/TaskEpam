package ua.com.Epam.task11RegExStringBuilderI18N.StringBuilder;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    MyStringBuilder<Object> myStringBuilder = new MyStringBuilder<>();
    myStringBuilder
        .addToString("1. ")
        .addToString("2. ")
        .addToString(321)
        .addToString(new Person("ewqewq", 12).toString())
        .addToString(List.of("32", "32131", "312"))
        .addToString("2. ");
    myStringBuilder
        .addToString("3. ");
    myStringBuilder.showToString();

  }
}
