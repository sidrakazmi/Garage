
public class Airplane extends Vehicle {
	
	private int numberOfEngines;
	private boolean turnedOn;

	public Airplane(String registrationNumber, String color, int numberOfWheels, int numberOfEngines) {
		super(registrationNumber, color, numberOfWheels);
		this.numberOfEngines = numberOfEngines;
		turnedOn = false;
	}

	public void toggleVehicle () {
		if(turnedOn) {
			System.out.println("The Airplane has been turned off");
		}
		else {
			System.out.println("The Airplane has been started");
		}
		turnedOn = !turnedOn;
	}
	
	public  String getVehicleType() {
		return "Airplane";
	}

}
