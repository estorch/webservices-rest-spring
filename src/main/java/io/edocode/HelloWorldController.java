package main.java.io.edocode;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-06-01
 */
@Controller
public class HelloWorldController {

  /** Counter */
  private final AtomicLong counter = new AtomicLong();
  /** Response string template */
  private static final String template = "Hello, %s!";

  /**
   * Controller for /helloworld service
   *
   * @param     name      Name of person being greeted
   * @return
   */
  @RequestMapping(value = "/helloworld", method = RequestMethod.GET )
  public @ResponseBody HelloWorld helloWorld(@RequestParam(value="name", required=false, defaultValue="World") String name) {
    return new HelloWorld(counter.incrementAndGet(), String.format(template, name));
  }
}