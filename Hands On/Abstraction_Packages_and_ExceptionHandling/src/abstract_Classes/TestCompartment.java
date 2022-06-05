package abstract_Classes;

public final class TestCompartment {

	public static void main(String[] args) {
		Compartment c[] = new Compartment[10];
		double i = Math.random()*5;
		int n = (int)i;
		System.out.println(n);

		if(n==1)
			c[(int)i] = new FirstClass();
		else if(n==2)
			c[(int)i] = new Ladies();
		else if(n==3)
			c[(int)i] = new General();
		else if(n==4)
			c[(int)i] = new Luggage();
		else {
			System.out.println("No Compartment");
		}
		c[(int)i].Notice();
	}

}
