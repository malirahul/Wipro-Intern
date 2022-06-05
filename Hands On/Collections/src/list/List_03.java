package list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class List_03 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		//Iterator
		System.out.println("Using Iterator");
		Iterator<Integer> it = v.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		//ListIterator
		System.out.println("Using List Iterator->Forward Direction");
		ListIterator<Integer> li = v.listIterator();
	    while (li.hasNext()) {
	        System.out.println(li.next());
	    }
		System.out.println("Using List Iterator->Backward Direction");
	    while (li.hasPrevious()) {
	        System.out.println(li.previous());
	    }
	    
	   
	    System.out.println("Using Enumeration");
	    Enumeration<Integer> enumeration = v.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        
	}

}
