package moveonwheels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Truck {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id; 
	private Integer capacityInLts;	
	private Integer mileageInKms;
	private String type;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getCapacityInLts() {
		return capacityInLts;
	}

	public void setCapacityInLts(Integer v) {
		this.capacityInLts = v;
	}
	
	public Integer getMileageInKms() {
		return mileageInKms;
	}

	public void setMileageInKms(Integer v) {
		this.mileageInKms = v;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String v) {
		this.type = v;
	}
}

