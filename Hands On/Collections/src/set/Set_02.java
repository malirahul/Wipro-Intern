package set;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;

public class Set_02 {
	
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Rahul");
		ts.add("Dev");
		ts.add("Chayan");
		ts.add("Harshit");
		ts.add("SuryaKaran");
		ts.add("Rahul");
		ts.add("Deepak");
		ts.add("Dev");
		
		System.out.println("==========Reverse Element=============");
		Iterator<String> it = ts.descendingIterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("==========Ascending Order=============");
		//Using TreeSet elements are stored in ascending order!
		Iterator<String> it1 = ts.iterator();
		while(it1.hasNext())
			System.out.println(it1.next());
		
		//Elements are present in Treeset or not!
		System.out.println("Does the name 'Chayan' is present or not : "+ts.contains("Chayan") );
		

	}

}
