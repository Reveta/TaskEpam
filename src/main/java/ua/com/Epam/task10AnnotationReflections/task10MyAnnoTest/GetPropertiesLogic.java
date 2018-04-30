package ua.com.Epam.task10AnnotationReflections.task10MyAnnoTest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

class GetPropertiesLogic {

  private static String way = "src\\main\\resources\\";

  public static void start(Class clazz) {

    String oneProperty;
    if (checkAnnot(clazz)) {
//      oneProperty = getOneProperty();
    }
  }

  public static String getPropertyName(Class clazz){

    List<Method> methodList = Arrays.stream(clazz.getMethods())
        .collect(Collectors.toList());

    methodList.forEach(method -> {
      System.out.println("Start searching!");
      method.setAccessible(true);
      if (method.isAnnotationPresent(PropValue.class)){
        PropValue annotation = method.getAnnotation(PropValue.class);
        System.out.println();

      }

    });

    return "dsa0";
  }

  private static boolean checkAnnot(Class clazz) {

    return clazz.isAnnotationPresent(GetProperties.class);
  }

  private static String getOneProperty(String propertiesFileName, String propertyName) {

    Properties properties = getPropertiesFile(propertiesFileName);

    return properties.getProperty("dsa");
  }

  private static Properties getPropertiesFile(String propertiesFileName) {

    Properties properties = new Properties();
    try {
      File file = new File(way + propertiesFileName);
      FileReader fileReader = new FileReader(file);
      properties.load(fileReader);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return properties;
  }
}
