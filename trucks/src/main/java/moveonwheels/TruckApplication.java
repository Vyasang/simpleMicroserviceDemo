package moveonwheels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;

import moveonwheels.Truck;
import moveonwheels.TruckRepository;

@RestController
@SpringBootApplication
public class TruckApplication {
  
  @Autowired
  private TruckRepository trucksRepository;

  @RequestMapping(value = "/")
  public @ResponseBody Iterable<Truck> getAllTrucks() {
    return trucksRepository.findAll();
  }
  
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public @ResponseBody Truck newTruck(@RequestBody Truck newTruck) {
    Truck myTruck = new Truck();
    myTruck.setCapacityInLts(newTruck.getCapacityInLts());
    myTruck.setMileageInKms(newTruck.getMileageInKms());
    myTruck.setType(newTruck.getType());
    
    return trucksRepository.save(myTruck);
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