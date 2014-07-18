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


@Controller
public class IpAddressController {
  @RequestMapping(value = "/ip", method=RequestMethod.POST )
  public @ResponseBody void ipAddress(@RequestBody Ip ip) {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    System.out.printf("Visit from %s at %s\n", ip.getIp(), dateFormat.format(date));
  }
}