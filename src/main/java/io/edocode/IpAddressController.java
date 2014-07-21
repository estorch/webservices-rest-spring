package main.java.io.edocode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-07-17
 */
@Controller
public class IpAddressController {

  /**
   * Controller for /ip service
   *
   * @param     ip      IP address of visitor
   */
  @RequestMapping(value = "/ip", method=RequestMethod.POST )
  public @ResponseBody void ipAddress(@RequestBody Ip ip) {
    /** Set date format */
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    /** Get current date and time */
    Date date = new Date();

    /** Output visitor IP and visit date/time to console window */
    System.out.printf("Visit from %s at %s\n", ip.getIp(), dateFormat.format(date));
  }
}