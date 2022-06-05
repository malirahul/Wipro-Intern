package string_and_stringBuffer;

import java.util.Scanner;

public class SASB10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		int i=0;
		int len = Math.min(a.length(), b.length());
		String res ="";
		while(i<len) {
			res+=a.substring(i,i+1)+b.substring(i,i+1);
			i++;
		}
		if(a.length()!=b.length())
			res+=b.substring(len);
		if(b.length()!=a.length())
			res+=a.substring(len);
		
		
		
		System.out.println(res);

	}

}
