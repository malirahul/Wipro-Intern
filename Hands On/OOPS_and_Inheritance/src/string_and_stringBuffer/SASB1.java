package string_and_stringBuffer;

import java.util.Scanner;

//Palindrome or not!

class SASB1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String s = sb.toString();
		
		if(str.equals(s)) {
			System.out.println(str + " -> String is palindrome");
		}else {
			System.out.println(str + " -> String is not palindrome");
		}
		
	}

}
