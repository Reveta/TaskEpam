package ua.com.Epam.task12IO_NIO.IOtryWithResorses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {

  public static void main(String[] args) {

//    String text = "Hello baby";
//    byte[] bytes = text.getBytes();
//
//    try (FileOutputStream fileOutputStream = new FileOutputStream("file.txt")) {
//      for (byte b : bytes) {
//        fileOutputStream.write(b);
//      }
//    } catch (IOException ignore) {}
//---------------------------------------------
//    try (FileInputStream stream = new FileInputStream("file.txt")) {
//      int symbol;
//
//      while ((symbol = stream.read()) != -1){
//        System.out.print((char) symbol);
//      }
//    } catch (IOException ignore) {}

//---------------------------------------------
//    try(FileWriter fileWriter = new FileWriter("file.txt")) {
//      fileWriter.write("Hello world 2");
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//
//    try(FileReader fileReader = new FileReader("file.txt")) {
//
//      int s;
//      while ((s=fileReader.read()) != -1){
//        System.out.print((char)s);
//      }
//
//
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
    //---------------------------------------------

    File file = new File("object.txt");

  try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.txt"))){
    objectOutputStream.writeObject(new Person("Roman",18,new Flower("Rose")));
  } catch (IOException e) {
    e.printStackTrace();
  }

  try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
    Person person = (Person) objectInputStream.readObject();

    System.out.println(person.toString());
  } catch (IOException | ClassNotFoundException e) {
    e.printStackTrace();
  }


  }
}
