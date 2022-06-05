package string_and_stringBuffer;

import java.util.Scanner;


public class SASB9 {
	
	static String str(String s) {
		StringBuffer sb = new StringBuffer(s);
		int i = s.indexOf('*');
		int l=s.lastIndexOf('*');
		
		return new String(sb.delete(i-1, l+2));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(str(s));

	}

}
