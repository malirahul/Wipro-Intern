package string_and_stringBuffer;

import java.util.Scanner;

class Count{
	String str(String s ,int n) {
		String res = "";
		while(n>0) {
			res+=s.concat("X");
			n--;
		}
		res = res.substring(0,res.length()-1);
		return res;
	}
}

public class SASB8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n= sc.nextInt();
		
		Count c= new Count();
		System.out.println(c.str(s,n));
	}
}
