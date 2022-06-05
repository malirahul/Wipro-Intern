package wrapper_classes;

import java.util.Scanner;

public class WC_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer number between 1 to 255 : ");
		int num = sc.nextInt();
		
		
		if(num>1 && num<255) {
		String s = String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
		System.out.println(s);
		}else {
			System.out.println("Integer value should be lies between 1 to 255");
		}

	}

}
