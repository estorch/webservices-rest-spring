package main.java.io.edocode;

/** Check object used in /check web-service response
 *
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-07-13
 */
public class Check {

  /** Counter long */
  private final long id;
  /** Status string */
  private final String content = "ACTIVE";

  /**
   * Constructor
   *
   * @param       id       Unique indentifier
   */
  public Check(long id) {
    this.id = id;
  }

  /** ID Getter
   *
   * @return      id
   */
  public long getId() {
    return this.id;
  }

  /** Content Getter
   *
   * @return      content
   */
  public String getContent() {
    return this.content;
  }
}