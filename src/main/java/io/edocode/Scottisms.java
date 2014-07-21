package main.java.io.edocode;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-06-02
 */
public class Scottisms {

  private final long id;
  private final String content;

  public Scottisms(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return this.id;
  }

  public String getContent() {
    return this.content;
  }
}