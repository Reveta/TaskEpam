package ua.com.Epam.task12IO_NIO.IO;

import java.io.File;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * A
 * B
 * C
 * D
 * E
 */
public class Main {

  public static void main(String[] args) {

    File file = new File("D:\\file2.txt");

//    try (ObjectOutputStream objectOutputStream =
//        new ObjectOutputStream(
//            new BufferedOutputStream(
//                new FileOutputStream(file),20*1024))) {
//
//      objectOutputStream.writeObject(new Ship("Hope"));
//
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

//    try (ObjectInputStream objectInputStream =
//        new ObjectInputStream(
//            new BufferedInputStream(
//                new FileInputStream(file)/*,20*1024*/)) {

//    long dateF = new Date().getTime();
////    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file),10*1024)) {
//
//    try (FileReader fileReader = new FileReader(file)){
//      int s;
//      while ((s = (char)fileReader.read()) != -1) {
//        System.out.print((char) fileReader.read());
//        System.out.println((char) s);
//      }
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    long dateE = new Date().getTime();
//
//    System.out.println(dateF + "\n" + dateE);
//  }
//  Write your implementation of InputStream with capability of push read data
//  back to the stream.

//    File fileJava = new File("D:\\Student\\Epam\\TaskEpam1\\src\\main\\java\\ua\\com\\Epam\\task12IO_NIO\\IO\\Main.java");
//    try(BufferedReader fileReader = new BufferedReader(new FileReader(fileJava))) {
////    try(FileReader fileReader = new FileReader()) {
//      String s;
//      while ((s = fileReader.readLine()) != null){
//        String trim = s.trim();
//        if (trim.startsWith("/") || trim.startsWith("*")){
//          System.out.println(s);
//        }
//      }
//
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

//    File directory = new File("D:\\");
////    Arrays.stream(directory.list()).forEach(System.out::println);
//
//      List<File> list = new ArrayList<>();
//      try {
//        list = Files.walk(Paths.get(String.valueOf(directory)))
//            .map(Path::toFile)
//            .filter(File::canExecute)
//            .filter(File::canRead)
//            .filter(File::canWrite)
//            .filter(File::isAbsolute)
////            .filter(File::setReadOnly)
//            .collect(Collectors.toList());
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//
//      list.forEach(System.out::println);
//
//  }

//  Write a program that displays the contents of a specific directory (file and
//  folder names + their attributes) with the possibility of setting the current
//  directory (similar to “dir” and “cd” command line commands).
//
    try (FileChannel channel = (FileChannel) Files.newByteChannel(
        Paths.get("file.txt"),
        StandardOpenOption.WRITE,
        StandardOpenOption.READ,
        StandardOpenOption.CREATE)) {

      MappedByteBuffer buffer = channel.map(MapMode.READ_WRITE, 0,26);
      buffer.clear();

      for (int i = 0; i < buffer.capacity(); i++) {
        buffer.put((byte) ('A' + i));
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

//    for (int i = 0; i < 26; i++) {
//      char s = (char) ('A' + i);
//      System.out.println(s);
//    }

  }
}
