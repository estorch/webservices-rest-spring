import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {
  private String email;
  private String subject;
  private String message;

  public Email() {
  }

  public String getEmail() {
    return this.email;
  }

  public String getSubject() { return this.subject; }

  public String getMessage() { return this.message; }
}