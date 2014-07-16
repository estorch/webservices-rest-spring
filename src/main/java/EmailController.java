import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class EmailController {
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/email")
  public @ResponseBody Response email(@RequestBody Email email_p) {
    email_p.sendEmail();

    Email2 email2 = new Email2();
    //email2.sendEmail();

    Response response = new Response();
    return response;
  }
}