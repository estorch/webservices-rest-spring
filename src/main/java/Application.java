import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
@EnableAutoConfiguration
public class Application {

  public static void main(String[] args) {
//    ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");

    SpringApplication.run(Application.class, args);
  }
}