package main.java.io.edocode;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-06-25
 */
public class Visitor {
  /** Unique identifier */
  private int id;
  /** Visitor name */
  private String name;
  /** Date of visit */
  private String date;

  /**
   * Default constructor
   */
  public Visitor() {
  }

  /**
   * Constructor
   *
   * @param name
   */
  public Visitor(String name) {
    this.name = name;
  }

  /**
   * Id getter
   *
   * @return      id
   */
  public int getId() {
    return this.id;
  }

  /**
   * Name getter
   *
   * @return      name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Date getter
   *
   * @return      date
   */
  public String getDate() {
    return this.date;
  }

  /**
   * ID setter
   *
   * @param       id      ID of visitor
   */
  public void setId(int id) {
    this.id = id;
  }
}