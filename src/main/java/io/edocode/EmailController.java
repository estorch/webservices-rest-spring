package main.java.io.edocode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import javax.mail.internet.AddressException;
import javax.mail.MessagingException;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-07-16
 */
@Controller
public class EmailController {

  /** Counter */
  private final AtomicLong counter = new AtomicLong();
  /** Emailer object */
  private Emailer emailer = new Emailer();

  /**
   * Controller for the /email service
   *
   * @param         email_p               Email object
   * @return        response
   * @throws        AddressException
   * @throws        MessagingException
   */
  @RequestMapping(value = "/email", method=RequestMethod.POST )
  public @ResponseBody Response email(@RequestBody Email email_p) throws AddressException, MessagingException {
    /** Send email using JavaMail */
    emailer.sendEmail(email_p);

    // Spring Emailer. Will get to soon.
    //Email2 email2 = new Email2();
    //email2.sendEmail();

    Response response = new Response();
    return response;
  }
}