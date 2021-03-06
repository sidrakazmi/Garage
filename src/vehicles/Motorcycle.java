package vehicles;
import java.io.Serializable;

public class Motorcycle extends Vehicle implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int cylinderVolume;
	private boolean turnedOn;

	public Motorcycle(String registrationNumber, String color, int numberOfWheels, int cylinderVolume) {
		super(registrationNumber, color, numberOfWheels);
		this.cylinderVolume = cylinderVolume;
		turnedOn = false;
	}

	public void toggleVehicle () {
		if(turnedOn) {
			System.out.println("The motorcycle has been turned off");
		}
		else {
			System.out.println("The motorcycle has been started");
		}
		turnedOn = !turnedOn;
	}
	
	public  String getVehicleType() {
		return "Motorcycle";
	}

	public int getCylinderVolume() {
		return cylinderVolume;
	}

}
