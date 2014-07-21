package main.java.io.edocode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-07-01
 */
@Controller
public class SortController {
  private static Sort sort = null;
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping(value = "/sort", method = RequestMethod.GET )
  public @ResponseBody Response sort(@RequestParam(value="nums", required=true) String nums, @RequestParam(value="sort", required=true) String sort) {
    this.sort = new Sort(nums, sort);

    Response response = new Response(this.sort.getSortedList());

    return response;
  }
}