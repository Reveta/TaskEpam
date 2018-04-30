package ua.com.Epam.task12IO_NIO.NIO.var1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

  //https://www.youtube.com/watch?v=65JGgbLSkjk&t

  public static void main(String[] args) throws IOException {
//    try (FileChannel channel = (FileChannel) Files.newByteChannel(
//        Paths.get("file.txt"),
//        StandardOpenOption.WRITE,
//        StandardOpenOption.READ,
//        StandardOpenOption.CREATE)) {
//
//      MappedByteBuffer buffer = channel.map(MapMode.READ_WRITE, 0, 26);
//      buffer.clear();
//
//      for (int i = 0; i < buffer.capacity(); i++) {
//        buffer.put((byte) ('A' + i));
//      }
//
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

//    File fileNIO = new File("fileNIO.txt");
//
//    try (FileInputStream fileInputStream = new FileInputStream(fileNIO)) {
//
//      SeekableByteChannel channel = Files
//          .newByteChannel(Paths.get(String.valueOf(fileNIO.getName())));
//
//      MappedByteBuffer buffer = channel.
//
//          System.out.println(channel.position());
//
////      byte[] chars = {1,0,10,0,0,1};
//
////      for (int i = 0; i < buffer.limit(); i++) {
////        buffer.put(chars,1,1);
////        System.out.println(buffer.get());
//
////      }
//
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

    Path testFilePath = Paths.get("D:\\Student\\Epam\\TaskEpam1\\logging\\log.log");
//    System.out.println(testFilePath.getFileName());
//    System.out.println(testFilePath.getRoot());
//    System.out.println(testFilePath.getParent());
//    System.out.println(testFilePath.toString());
//
//    System.out.println();
//    for (Path path:testFilePath) {
//      System.out.println(path);
//    }
//
//    for (int i = 0; i < testFilePath.getNameCount(); i++) {
//
//      System.out.println(i + "  " + testFilePath.getName(i));
//    }

//    Path testFilePath = Paths.get("./log.log");
//    System.out.println(testFilePath.getFileName());
//    System.out.println(testFilePath.toUri());
//    System.out.println(testFilePath.toAbsolutePath());
//    System.out.println(testFilePath.normalize().toAbsolutePath());
//
//    System.out.println();
//    for (Path path:testFilePath) {
//      System.out.println(path);
//    }

//    for (int i = 0; i < testFilePath.getNameCount(); i++) {
//
//      System.out.println(i + "  " + testFilePath.getName(i));
//    }



//    Path path = Paths.get("/home/heorhi/workspace/OCPJP/src/test/Test5.java");

    //Проверка для дериктории
    //Path path = Paths.get("/home/heorhi/workspace/OCPJP/src/test");
    Path path = Paths.get("");

//    if (Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
//      System.out.println("The file/directory " + path.getFileName()
//          + " exists");
//      if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
//        System.out.println(path.getFileName() + " is a directory");
//      } else {
//        System.out.println(path.getFileName() + " is a file");
//      }
//    } else {
//      System.out.println("The file/directory " + path.getFileName() + " does not exist");
//    }

//    System.out.println(Files.isHidden(testFilePath));
//    System.out.println(Files.isReadable(testFilePath));
//    System.out.println(Files.isWritable(testFilePath));
//    System.out.println(Files.isExecutable(testFilePath));
//    System.out.println(Files.getAttribute(testFilePath, "size"));


    SeekableByteChannel channel = Files
          .newByteChannel(Paths.get(String.valueOf(path)));


    ByteBuffer buffer = ByteBuffer.allocate(8);
    byte[] bytes = {1,0,0,0,1,1};
    buffer.put( bytes,0,12);

    System.out.println(channel.read(buffer));

  }

}
