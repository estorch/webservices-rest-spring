import java.util.List;
import java.util.ArrayList;

public class Response<T> {
  private String status;
  private long time;
  private List<T> payload = new ArrayList<T>();

  public Response() {
  }

  public Response(List<T> payload) {
    this.status = "SUCCESS";
    this.time = System.currentTimeMillis();
    this.payload = payload;
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

//  public void setPayload(List<T> payload) {
//    this.payload = payload;
//  }
}
