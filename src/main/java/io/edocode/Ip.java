package main.java.io.edocode;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-07-17
 */
public class Ip {

  /** IP address string */
  private String ip;

  /**
   * Constructor
   *
   * @param     ip      IP address of visitor
   */
  public Ip(String ip) {
    this.ip = ip;
  }

  /**
   * IP address getter
   *
   * @return    ip
   */
  public String getIp() {
    return this.ip;
  }
}