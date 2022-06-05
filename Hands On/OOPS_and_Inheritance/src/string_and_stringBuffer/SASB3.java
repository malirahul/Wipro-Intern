package string_and_stringBuffer;

import java.util.Scanner;

//String n copies


public class SASB3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		
		String copy="";
		if(n<=1) {
			copy=s;
		}
		else {
			copy = s.substring(0,2);
		}
		String res ="";
		for(int i=0;i<n;i++) {
			res+=copy;
		}
		
		System.out.println(copy);
		

	}

}
