package wipro.FlowControl;

import java.util.Scanner;

public class FlowControl7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(c>='a' && c<='z') {
			System.out.print(c + "->");
			c=(char)(c-32);
			System.out.println(c);
		}
		else {
			System.out.print(c + "->");
			c=(char)(c+32);
			System.out.println(c);
		}

	}

}
