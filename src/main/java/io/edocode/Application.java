package main.java.io.edocode;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-06-01
 */
@ComponentScan
@EnableAutoConfiguration
public class Application {

  public static void main(String[] args) {

    /** Run Spring Application */
    SpringApplication.run(Application.class, args);
  }

}