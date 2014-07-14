public class Visitor {
  private int id;
  private String name;
  private String date;

  public Visitor() {
  }

  public Visitor(String name, String date) {
    this.name = name;
    this.date = date;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getDate() {
    return this.date;
  }

  public void setId(int id) {
    this.id = id;
  }
}