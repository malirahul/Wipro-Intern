package string_and_stringBuffer;

import java.util.Scanner;

public class SASB7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String str="";
		
		if(s.charAt(0)=='x' && s.charAt(s.length()-1)=='x')
			str = s.substring(1,s.length()-1);
		else if(s.charAt(0)=='x')
			str =s.substring(1,s.length());
		else if(s.charAt(s.length()-1)=='x')
			str = s.substring(0,s.length()-1);
		else 
			str = s;
		
		
		System.out.println(str);

	}

}
