import java.util.List;
import java.util.ArrayList;

public class Response<T> {
  private String status;
  private long time;
  private List<T> payload = null;
  private List<T> notes = null;

  public Response() {
  }

  public Response(List<T> payload) {
    this.status = "SUCCESS";
    this.time = System.currentTimeMillis();
    this.payload = payload;
    this.notes = null;
  }

  public Response(List<T> payload, List<T> notes) {
    this.status = "SUCCESS";
    this.time = System.currentTimeMillis();
    this.payload = payload;
    this.notes = notes;
  }

  public String getStatus() {
    return this.status;
  }

  public long getTime() {
    return this.time;
  }

  public List<T> getPayload() {
    return this.payload;
  }

  public List<T> getNotes() {
    return this.notes;
  }

  public void setPayload(List<T> payload) {
    this.payload = payload;
  }

  public void setNotes(List<T> notes) {
    this.notes = notes;
  }
}
