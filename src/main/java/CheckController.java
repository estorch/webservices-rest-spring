import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheckController {
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/check")
  public @ResponseBody Check check() {
    return new Check(counter.incrementAndGet());
  }
}