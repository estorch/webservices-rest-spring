import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Emailer {

  public Emailer() {
  }

  public static void sendEmail(Email emailObj) throws AddressException, MessagingException {
//    String host = "edocode.io";
//    String user = "himalstorch";
//    String password = "eric";
//    String emailMsg = "Hi thar";
//    String emailSbj = "Test";
//    String from = "eric@edocode.io";
//    String to = "himalstorch@gmail.com";

    String name = emailObj.getName();
    String email = emailObj.getEmail();
    String message = emailObj.getMessage();

      Properties mailServerProperties;
      Session getMailSession;
      MimeMessage generateMailMessage;

//Step1
      mailServerProperties = System.getProperties();
      mailServerProperties.put("mail.smtp.port", "587"); // TLS Port
      mailServerProperties.put("mail.smtp.auth", "true"); // Enable Authentication
      mailServerProperties.put("mail.smtp.starttls.enable", "true"); // Enable StartTLS

//Step2
//      System.out.println("\n\n 2nd ===> get Mail Session..");
      getMailSession = Session.getDefaultInstance(mailServerProperties, null);
      generateMailMessage = new MimeMessage(getMailSession);
      generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress("eric@edocode.io"));
      generateMailMessage.setSubject("Message from Edocode.io");
      String emailBody = message + "  Sent from:   " + email + "  Name:  " + name;
      generateMailMessage.setContent(emailBody, "text/html");
//      System.out.println("Mail Session has been created successfully..");

//Step3
//      System.out.println("\n\n 3rd ===> Get Session and Send mail");
      Transport transport = getMailSession.getTransport("smtp");
      // Enter your correct gmail UserID and Password
      transport.connect("mail.edocode.io", "mailer@edocode.io", "hi4U4EyM");
      transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
      transport.close();
    }
}