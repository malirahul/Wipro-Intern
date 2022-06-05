package string_and_stringBuffer;

import java.util.Scanner;

public class SASB5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		
		if(n>2)
			System.out.println(s.substring(1,n-1));
		else
			System.out.println("String length should be more than 2");

	}

}
