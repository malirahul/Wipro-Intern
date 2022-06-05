package classes_and_objects;

class Patient{
	String name;
	double weight,height;
	public Patient(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	double BMI() {
		double res = (weight/(height*height))*703;
		return res;
	}
}

public class CAO3 {

	public static void main(String[] args) {
		Patient p = new Patient("Rahul",57,5.9);
		
		System.out.println("BMI is : "+p.BMI());

	}

}
