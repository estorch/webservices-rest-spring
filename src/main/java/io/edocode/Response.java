package main.java.io.edocode;

import java.util.List;
import java.util.ArrayList;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-07-13
 */
public class Response<T> {

  /** Status string */
  private String status;
  /** Creation time */
  private long time;
  /** Payload list */
  private List<T> payload = null;
  /** Payload notes */
  private List<T> notes = null;

  /**
   * Default constructor
   */
  public Response() {
    this.status = "SUCCESS";
    this.time = System.currentTimeMillis();
  }

  /**
   * Constructor
   *
   * @param     payload     Response payload
   */
  public Response(List<T> payload) {
    this.status = "SUCCESS";
    this.time = System.currentTimeMillis();
    this.payload = payload;
    this.notes = null;
  }

  /**
   * Constructor
   *
   * @param     payload     Response payload
   * @param     notes       Response notes
   */
  public Response(List<T> payload, List<T> notes) {
    this.status = "SUCCESS";
    this.time = System.currentTimeMillis();
    this.payload = payload;
    this.notes = notes;
  }

  /**
   * Status getter
   *
   * @return
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * Time getter
   *
   * @return
   */
  public long getTime() {
    return this.time;
  }

  /**
   * Payload getter
   *
   * @return
   */
  public List<T> getPayload() {
    return this.payload;
  }

  /**
   * Notes getter
   *
   * @return
   */
  public List<T> getNotes() {
    return this.notes;
  }

  /**
   * Payload setter
   *
   * @param       payload     Response payload
   */
  public void setPayload(List<T> payload) {
    this.payload = payload;
  }

  /**
   * Notes setter
   *
   * @param       notes       Note payload
   */
  public void setNotes(List<T> notes) {
    this.notes = notes;
  }
}
