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
    String email = emailObj.getEmail();
    String subject = emailObj.getSubject();
    String message = emailObj.getMessage();

    Properties mailServerProperties;
    Session getMailSession;
    MimeMessage generateMailMessage;

    mailServerProperties = System.getProperties();
    mailServerProperties.put("mail.smtp.port", "587");             // TLS Port
    mailServerProperties.put("mail.smtp.auth", "true");            // Enable Authentication
    mailServerProperties.put("mail.smtp.starttls.enable", "true"); // Enable StartTLS

    getMailSession = Session.getDefaultInstance(mailServerProperties, null);
    generateMailMessage = new MimeMessage(getMailSession);
    generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
    generateMailMessage.setSubject(subject);
    String emailBody = message;
    generateMailMessage.setContent(emailBody, "text/html");

    Transport transport = getMailSession.getTransport("smtp");
    transport.connect("mail.edocode.io", "mailer@edocode.io", "hi4U4EyM");
    transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
    transport.close();
  }
}