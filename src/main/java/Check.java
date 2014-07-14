public class Check {
  private final long id;
  private final String content = "Webservice active.";

  public Check(long id) {
    this.id = id;
  }

  public long getId() {
    return this.id;
  }

  public String getContent() {
    return this.content;
  }
}