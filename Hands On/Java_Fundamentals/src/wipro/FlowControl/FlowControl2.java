package wipro.FlowControl;

public class FlowControl2 {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		
		if(Integer.parseInt(args[0]) % 2 ==0 ) 
			System.out.println("Given Number is Even");
		
		else
			System.out.println("Given Number is Odd");

	}

}
