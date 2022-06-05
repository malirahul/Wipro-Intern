package wipro.FlowControl;

import java.util.Scanner;

public class FlowControl16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int t =0 ;
		while(n!=0) {
			int rem = n%10;
			t=t*10+rem;
			n/=10;
		}
		System.out.println(t);

	}

}
