package packages.com.automobile;

public class Logan extends Vehicle{
	
	public String modelName;
	public String registrationNumber;
	public String ownerName;
	public int speed;
	public int gps;
	
	

	public Logan(String modelName, String registrationNumber, String ownerName, int speed, int gps) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.gps = gps;
	}

	@Override
	public String getModelName() {
		return "Model Name : "+modelName;
	}

	@Override
	public String getRegistrationNumber() {
		return "Registration Number : "+registrationNumber;
	}

	@Override
	public String getOwnerName() {
		return "Owner Name : "+ownerName;
	}

	
	public int speed() {
		System.out.print("Speed :");
		return speed;
	}
	public int gps() {
		System.out.print("GPS : ");
		return gps;
	}

}
