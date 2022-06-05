package string_and_stringBuffer;

import java.util.Scanner;

public class SASB6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		if(a.length()>b.length())
			System.out.println(b+a+b);
		else
			System.out.println(a+b+a);
		

	}

}
