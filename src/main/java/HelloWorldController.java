import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping(value = "/helloworld", method = RequestMethod.GET )
  public @ResponseBody HelloWorld helloWorld(@RequestParam(value="name", required=false, defaultValue="World") String name) {
    return new HelloWorld(counter.incrementAndGet(), String.format(template, name));
  }
}