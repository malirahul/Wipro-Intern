package abstract_Classes;

public abstract class Compartment {
	
	public abstract String Notice();

}

class FirstClass extends Compartment {
	public String Notice(){
		System.out.println("This Compartment for FirstClass");
		return null;
	}
}

class Ladies extends Compartment {
	public String Notice(){
		System.out.println("This Compartment for Ladies");
		return null;
	}
}

class General extends Compartment {
	public String Notice(){
		System.out.println("This Compartment for General");
		return null;
	}
}

class Luggage extends Compartment {
	public String Notice(){
		System.out.println("This Compartment for Luggage");
		return null;
	}
}