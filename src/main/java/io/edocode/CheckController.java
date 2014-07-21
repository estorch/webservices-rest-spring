package main.java.io.edocode;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-07-13
 */
@Controller
public class CheckController {

  /** Counter */
  private final AtomicLong counter = new AtomicLong();

  /** Controller for /check service
   * Checks to see if ws' are available
   *
   * @return
   */
  @RequestMapping("/check")
  public @ResponseBody Check check() {
    return new Check(counter.incrementAndGet());
  }
}