import java.util.List;
import java.util.ArrayList;

public class Visitors {
  List<Visitor> visitorList = new ArrayList<Visitor>();

  public Visitors() {
    // Get some dummy data going
    Visitor visitor = null;
    visitor = new Visitor("Eric", "--");
    this.setVisitor(visitor);
    visitor = new Visitor("Kaitlin", "--");
    this.setVisitor(visitor);
    visitor = new Visitor("Kaze", "--");
    this.setVisitor(visitor);
  }

  public void setVisitor(Visitor visitor) {
    visitor.setId(visitorList.size());
    this.visitorList.add(visitor);
  }

  public Visitor getVisitor(int id) {
    if (visitorList.isEmpty() || id < visitorList.size()) {
      String sMessage = "Error retrieving visitor.";
      //return createErrorResponse(sMessage);
    }

    Visitor visitor = null;

    try {
      visitor = this.visitorList.get(id);
    } catch (Exception e) {
      String sMessage = "Error retrieving visitor. [%1$s]";
      //return createErrorResponse(String.format(sMessage, e.toString()));
    }

    return visitor;
  }

  public List getVisitors() {
    return this.visitorList;
  }
}
