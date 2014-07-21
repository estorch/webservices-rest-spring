package main.java.io.edocode;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-07-16
 */
public class Emailer {

  /**
   * Default constructor
   */
  public Emailer() {
  }

  /**
   * Mail sender method. Recieves email object, extracts data, and uses JavaMail to send the email
   *
   * @param     emailObj            Email object containg mail data
   * @throws    AddressException
   * @throws    MessagingException
   */
  public static void sendEmail(Email emailObj) throws AddressException, MessagingException {

    // Extract object data
    String email = emailObj.getEmail();
    String subject = emailObj.getSubject();
    String message = emailObj.getMessage();

    // Instantiate required JavaMail objects
    Properties mailServerProperties;
    Session getMailSession;
    MimeMessage generateMailMessage;

    // Get system properties and set server properties
    mailServerProperties = System.getProperties();
    mailServerProperties.put("mail.smtp.port", "587");             // TLS Port
    mailServerProperties.put("mail.smtp.auth", "true");            // Enable Authentication
    mailServerProperties.put("mail.smtp.starttls.enable", "true"); // Enable StartTLS

    // Start new mail sesson
    getMailSession = Session.getDefaultInstance(mailServerProperties, null);
    generateMailMessage = new MimeMessage(getMailSession);

    // Set message data
    generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
    generateMailMessage.setSubject(subject);
    generateMailMessage.setContent(message, "text/html");

    // Set new transport connection, connect, send, and close
    Transport transport = getMailSession.getTransport("smtp");
    transport.connect("mail.edocode.io", "mailer@edocode.io", "hi4U4EyM");
    transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
    transport.close();
  }
}