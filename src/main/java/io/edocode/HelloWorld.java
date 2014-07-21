package main.java.io.edocode;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-06-01
 */
public class HelloWorld {

  /** ID counter */
  private final long id;
  /** Content string */
  private final String content;

  /**
   * Constructor
   *
   * @param     id        Unique id
   * @param     content   Content string
   */
  public HelloWorld(long id, String content) {
    this.id = id;
    this.content = content;
  }

  /**
   * ID Getter
   *
   * @return    id
   */
  public long getId() {
    return this.id;
  }

  /**
   * Content getter
   *
   * @return    content
   */
  public String getContent() {
    return this.content;
  }
}