package wipro.FlowControl;

import java.util.Scanner;

public class FLowControl12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 0;
		if(n==0 || n==1)
			flag =1;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Given number is a prime");
		else
			System.out.println("Given number is not prime");
		
	}

}
