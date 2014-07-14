import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class EmailController {
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/email")
  public @ResponseBody Email email() {
    return new Email(counter.incrementAndGet());
  }
}