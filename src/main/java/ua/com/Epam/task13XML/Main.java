package ua.com.Epam.task13XML;

import java.io.IOException;
import java.nio.file.Paths;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {

  public static void main(String[] args)
      throws ParserConfigurationException, IOException, SAXException {

    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
//    Document document = builder.parse(Paths.get("src\\main\\resources\\task13.xml").toString());
    Document document = builder.parse(Paths.get("pom.xml").toString());

    Element element = document.getDocumentElement();
//    System.out.println(element.getTagName());

//    NodeList nodeList = element.getChildNodes();
//    for (int i = 0; i < nodeList.getLength(); i++) {
//      Node item = nodeList.item(i);
//      if (item instanceof Element) {
//        System.out.println(((Element) item).getTagName());
//      }
//    }

    printElement(element.getChildNodes(), 0);
  }

  private static void printElement(NodeList nodeList, int iteration) {

    for (int i = 0; i < nodeList.getLength(); i++) {
      Node item = nodeList.item(i);

      if (item instanceof Element) {
        StringBuilder builder = new StringBuilder();
        Element itemE = (Element) item;
        String tagName = itemE.getTagName().trim();

        String itemContent = itemE.getFirstChild().getTextContent().trim();
        String textContent = itemContent.matches("[(a-zA-Z0-9.\\-)]+")? ": " + itemContent: "";

        builder.append(spaces(iteration)).append("|").append(tagName);
        builder.append(textContent);
        builder.append(itemE.hasAttribute("id")?
            ": " + itemE.getAttribute("id") : "");


        System.out.println(builder.toString());

        if (item.hasChildNodes()) {
          printElement(item.getChildNodes(), iteration + 1);
        }
      }
    }
  }

  //+30/50mb RAM
  private static String spaces(int num) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < num; i++) {
      builder.append("|  ");
    }
    return builder.toString();
  }

//  +100mb RAM
//  private static String spaces(int num) {
//    String builder = "";
//    for (int i = 0; i < num; i++) {
//      builder = builder + " ";
//    }
//    return builder;
//  }

}
