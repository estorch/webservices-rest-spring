package main.java.io.edocode;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-07-16
 */
public class Email {

  /** Email string */
  private String email;
  /** Subject string */
  private String subject;
  /** Message string */
  private String message;

  /**
   * Default constructor
   */
  public Email() { }

  /**
   * Email address getter
   *
   * @return        email
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Subject getter
   *
   * @return      subject
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * Message getter
   *
   * @return      message
   */
  public String getMessage() {
    return this.message;
  }
}