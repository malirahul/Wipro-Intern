package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class List_01 {
	
	static void printAll(ArrayList<String> al) {
		Iterator<String> it =  al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of name you want to print : ");
		int n =sc.nextInt();
		ArrayList<String> al = new ArrayList<String>();

		for(int i=0;i<n;i++) {
			al.add(sc.next());
		}
		
		System.out.println("Given Names are : ");
		printAll(al);
		
	}

}
