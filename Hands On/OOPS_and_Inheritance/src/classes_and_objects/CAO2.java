package classes_and_objects;


class Calculator{
	int num1,num2;
	
	static int powerInt(int num1,int num2) {
		return (int)Math.pow(num1, num2);
	}
	
	static double powerDouble(double num1,double num2) {
		return Math.pow(num1, num2);
	}
	
}

public class CAO2 {

	public static void main(String[] args) {
		
		Calculator.powerInt(4, 2);
		Calculator.powerDouble(4.0,2.0);

	}

}
