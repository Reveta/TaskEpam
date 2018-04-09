package ua.com.Epam.task5.task5MailSender;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Main {

  private static InputStream s = Main.class.getResourceAsStream("/mail.properties");

  public static void main(String[] args) {
    Properties property = new Properties();
    try {
      property.load(s);
    } catch (IOException e) {
      e.printStackTrace();
    }

    Session session = Session.getInstance(property,
        new javax.mail.Authenticator() {
          protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(
                property.getProperty("username"),
                property.getProperty("password"));
          }
        });

    try {

      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress("Krasava!"));
      message.setRecipients(Message.RecipientType.TO,
          InternetAddress.parse("gfdsre1999@gmail.com"));
      message.setSubject("Testing Subject");
      message.setText(
          "I do that!");

      Transport.send(message);

      System.out.println("Done");

    } catch (MessagingException e) {
      throw new RuntimeException(e);
    }
  }
}
