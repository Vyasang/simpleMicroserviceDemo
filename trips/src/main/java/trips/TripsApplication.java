package trips;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TripsApplication {

  @RequestMapping(value = "/", method = RequestMethod.POST)
  public String newTrip() {
    return "This is a new trip";
  }

  @RequestMapping(value = "/")
  @GetMapping
  public String getAllTrips() {
    return "These are the trips";
  }
  
  @RequestMapping(value = "/{tripId}")
  public String getTrip(@PathVariable String tripId) {
    return "This is specific details of the trip " + tripId;
  }

  public static void main(String[] args) {
    SpringApplication.run(TripsApplication.class, args);
  }
}