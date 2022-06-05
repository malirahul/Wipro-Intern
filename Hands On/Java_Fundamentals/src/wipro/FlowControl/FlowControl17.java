package wipro.FlowControl;

public class FlowControl17 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		int temp = num;
		int rev=0;
		while(num!=0) {
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		if(temp==rev) {
			System.out.println(args[0]+" is a palindrome");
		}
		else {
			System.out.println(args[0]+" is not a palindrome");
		}

	}

}
