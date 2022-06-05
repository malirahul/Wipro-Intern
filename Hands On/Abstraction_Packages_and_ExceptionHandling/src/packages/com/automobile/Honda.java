package packages.com.automobile;

public class Honda extends Vehicle{
	public String modelName;
	public String registrationNumber;
	public String ownerName;
	public int speed;

	public Honda(String modelName, String registrationNumber, String ownerName,int speed) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
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

	public int getSpeed(){
		System.out.print("Speed : ");
		return speed;
	}
	public void cdPlayer(){
		System.out.println("CD Player available");
	}
}
