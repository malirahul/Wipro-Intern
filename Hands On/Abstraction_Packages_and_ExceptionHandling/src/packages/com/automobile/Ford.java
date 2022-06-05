package packages.com.automobile;

public class Ford extends Vehicle{
	
	public String modelName;
	public String registrationNumber;
	public String ownerName;
	public int speed;
	public int tempControl;
	
	

	public Ford(String modelName, String registrationNumber, String ownerName, int speed, int tempControl) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.tempControl = tempControl;
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
		System.out.print("Speed : ");
		return speed;
	}
	public int tempControl() {
		System.out.print("Temperature Control : ");
		return tempControl;
	}

}
