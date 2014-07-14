public class HelloWorld {
  private final long id;
  private final String content;

  public HelloWorld(long id, String content) {
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