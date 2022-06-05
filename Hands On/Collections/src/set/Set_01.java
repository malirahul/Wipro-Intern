package set;

import java.util.HashSet;
import java.util.Iterator;


class HashSetDemo{
	HashSet<String> set = new HashSet<String>();
	
	boolean addCountry(String CountryName) {
			set.add(CountryName);
			return true;
	}
	String findCountry(String CountryName) {
		Iterator<String> itr = set.iterator();
			if(itr.equals(CountryName))
				return CountryName;
			else
				return "Country Not Found";
	}
	
	void printAllCountries() {
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}

public class Set_01 {

	public static void main(String[] args) {
		HashSetDemo h = new HashSetDemo();
		h.addCountry("India");
		h.addCountry("USA");
		h.addCountry("Australia");
		h.addCountry("Japan");
		h.addCountry("India");
		h.addCountry("US");
		h.addCountry("USA");
		h.addCountry("India");
		h.addCountry("Ukrain");
		h.addCountry("Russia");
		h.addCountry("Japan");
		
		System.out.println(h.findCountry("India"));

	}

}
