package string_and_stringBuffer;

import java.util.Scanner;

//Concatination
class A{
	String conCat(String s1, String s2) {
		if(s1.length()!=0 && s2.length()!=0 && s1.charAt(s1.length()-1) == s2.charAt(0)) {
			return s1.concat(s2.substring(1));
		}
		return s1.concat(s2);
	}
}

public class SASB2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		A a = new A();
		System.out.println(a.conCat(s1.toLowerCase(), s2.toLowerCase()));

	}

}
