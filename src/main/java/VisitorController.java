import java.util.concurrent.atomic.AtomicLong;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@Controller
public class VisitorController {
  private static Visitors visitors = new Visitors();
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping(value = "/visitors", method = RequestMethod.GET )
  public @ResponseBody Response visitorGET() {
    Response response = new Response(this.visitors.getVisitors());

    return response;
  }

  @RequestMapping(value = "/visitors/{id}", method = RequestMethod.GET )
  public @ResponseBody Response visitorGET(@PathVariable("id") int id) {
    Response response = new Response(this.visitors.getVisitor(id));

    return response;
  }

  @RequestMapping(value = "/visitors", method = RequestMethod.POST )
  public @ResponseBody Response VisitorPOST(@RequestBody Visitor visitor_p) {
    int id = this.visitors.setVisitor(visitor_p);

    Response response = new Response(this.visitors.getVisitor(id));

    return response;
  }
}