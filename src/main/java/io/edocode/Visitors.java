package main.java.io.edocode;

import java.util.List;
import java.util.ArrayList;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-06-25
 */
public class Visitors {
  /** List of visitors */
  List<Visitor> visitorList = new ArrayList<Visitor>();

  /**
   * Default constructor (generates some data automatically)
   */
  public Visitors() {
    // Get some dummy data going
    Visitor visitor = null;
    visitor = new Visitor("Eric");
    this.setVisitor(visitor);
    visitor = new Visitor("Kaitlin");
    this.setVisitor(visitor);
    visitor = new Visitor("Kaze");
    this.setVisitor(visitor);
  }

  /**
   * Visitor setter
   *
   * @param       visitor     Visitor object
   * @return
   */
  public int setVisitor(Visitor visitor) {
    visitor.setId(visitorList.size());
    this.visitorList.add(visitor);

    return visitor.getId();
  }

  /**
   * Visitor getter
   *
   * @param       id        ID of visitor
   * @return
   */
  public List getVisitor(int id) {
    if (visitorList.isEmpty() || id < visitorList.size()) {
      String sMessage = "Error retrieving visitor.";
      //return createErrorResponse(sMessage);
    }

    // Create visitor object
    Visitor visitor = null;

    // Try to get the visitor
    try {
      visitor = this.visitorList.get(id);
    } catch (Exception e) {
      String sMessage = "Error retrieving visitor. [%1$s]";
      //return rest createErrorResponse(String.format(sMessage, e.toString()));
    }

    // Creates a list for one visitor?
    // TODO: simplify this
    List<Visitor> visitorList = new ArrayList<Visitor>();
    visitorList.add(visitor);

    return visitorList;
  }

  /**
   * Visitor getter
   *
   * @return
   */
  public List getVisitors() {
    return this.visitorList;
  }
}
