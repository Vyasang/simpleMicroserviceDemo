package moveonwheels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// @EnableDiscoveryClient
@RestController
@SpringBootApplication
public class TruckApplication {

  @RequestMapping(value = "/")
  public String trucks() {
    return "Hello from trucks";
  }
  
  @RequestMapping(value = "/available")
  public String available() {
    return "These are the available trucks";
  }

  @RequestMapping(value = "/scheduled")
  public String checkedOut() {
    return "These are the trucks scheduled";
  }

  public static void main(String[] args) {
    SpringApplication.run(TruckApplication.class, args);
  }
}