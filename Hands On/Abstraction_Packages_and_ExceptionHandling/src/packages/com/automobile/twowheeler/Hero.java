package packages.com.automobile.twowheeler;

import packages.com.automobile.Vehicle;

public class Hero extends Vehicle {
	public String modelName;
	public String registrationNumber;
	public String ownerName;
	public int speed;

	

	public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
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
	public void radio(){
		System.out.println("Radio Control access");
	}
}
