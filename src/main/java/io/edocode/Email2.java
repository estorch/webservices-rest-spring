package main.java.io.edocode;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-07-16
 */
public class Email2 implements ApplicationContextAware {

  ApplicationContext applicationContext;
  private MailSender mailSender;
  private SimpleMailMessage templateMessage;

  public void setMailSender(MailSender mailSender) {
    this.mailSender = mailSender;
  }

  public void setTemplateMessage(SimpleMailMessage templateMessage) {
    this.templateMessage = templateMessage;
  }

  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
  }

  public void sendEmail() {
    String host = "edocode.io";
    String user = "himalstorch";
    String password = "eric";
    String emailMsg = "Hi thar";
    String emailSbj = "Test";
    String from = "eric@edocode.io";
    String to = "himalstorch@gmail.com";

    SimpleMailMessage msg = new SimpleMailMessage(this.templateMessage);
    msg.setTo(to);
    msg.setText("Hi thar");
    try{
      mailSender.send(msg);
    } catch(MailException ex) {
      System.err.println(ex.getMessage());
    }
    System.out.println("Mail sent");

  }
}