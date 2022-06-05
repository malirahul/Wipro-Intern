package string_and_stringBuffer;

import java.util.Scanner;

public class SASB4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		
		StringBuffer sb = new StringBuffer(s);
		if(n%2==0) {
			System.out.println(sb.substring(0,n/2));
		}
		else {
			System.out.println("null");
		}
		

	}

}
