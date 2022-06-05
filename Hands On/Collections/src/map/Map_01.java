package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Demo{
	
	HashMap<String, String> mapObj;
	
	public Demo() {
		mapObj = new HashMap<String, String>();
	}

	
	public String saveCountryCapital(String countryName,String capital) {
		mapObj.put(countryName , capital);
		return capital;
	}
	
	public String getCapital(String countryName) {
		if(mapObj.containsKey(countryName))
			return mapObj.get(countryName);
		else
			return "No Country found";
	}
	public String getCountry(String capitalName) {
		if(mapObj.containsValue(capitalName))
			return mapObj.get(capitalName);
		else
			return "No Capital found";
	}
	
	public void display1() {
		Set set = mapObj.entrySet();
		Iterator i =set.iterator();
		while(i.hasNext()) {
			Map.Entry<String, String> m = (Map.Entry<String, String>)i.next();
			System.out.println(m.getKey() + ":" + m.getValue());
		}
	}
	
	public HashMap<String, String> anotherHashMap(){
		HashMap<String, String> mapObj2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = mapObj.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> e = itr.next();
			mapObj2.put(e.getValue(), e.getKey());
		}
		
		return mapObj2;
	}
	
	public ArrayList<String> CountryName() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = mapObj.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> e = itr.next();
			list.add(e.getKey());
		}
		return list;
	}
	
	public ArrayList<String> CapitalName() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = mapObj.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> e = itr.next();
			list.add(e.getValue());
		}
		return list;
	}
	
}

public class Map_01 {
	

	public static void main(String[] args) {
		Demo d = new Demo();
		d.saveCountryCapital("India", "Delhi");
		d.saveCountryCapital("Japan", "Tokyo");
		d.saveCountryCapital("USA", "Washington DC");
		d.saveCountryCapital("Sri Lanka", "Columbo");
		d.saveCountryCapital("US", "London");
		d.saveCountryCapital("Australia", "Melbourne");
		
		d.display1();
		
		System.out.println(d.getCapital("India"));
		System.out.println(d.getCountry("Tokyo"));
		
		HashMap<String, String> mapObj2 = d.anotherHashMap();
		System.out.println(mapObj2);
		
		System.out.println(d.CountryName());
		System.out.println(d.CapitalName());
		

	}

}
