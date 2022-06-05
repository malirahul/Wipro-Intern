package map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class contactDiary{
	
	TreeMap<String, Integer> hs = new TreeMap<String, Integer>();
	
	public void addContactNames(String name,Integer contact) {
		hs.put(name , contact);
	}
	
	public void getContactNumber(String Name) {
		Set<Map.Entry<String, Integer>> entries = hs.entrySet();
        for( Map.Entry<String, Integer> entry : entries ){
            
            if(entry.getKey().equals(Name)){
                System.out.println("Value for Key '" + Name + "' is: " + entry.getValue());
                break;
            }
        }
	}
	public void getContactName(Integer Number) {
		Set<Map.Entry<String, Integer>> entries = hs.entrySet();
        for( Map.Entry<String, Integer> entry : entries ){
            
            if(entry.getValue().equals(Number)){
                System.out.println("Key for Value '" + Number + "' is: " + entry.getKey());
                break;
            }
        }
	}
	
	public void display() {
		Set set = hs.entrySet();
		Iterator i =set.iterator();
		while(i.hasNext()) {
			Map.Entry<String, Integer> m = (Map.Entry<String, Integer>)i.next();
			System.out.println(m.getKey() + ":" + m.getValue());
		}
	}
}

public class Map_02 {

	public static void main(String[] args) {
		contactDiary c = new contactDiary();
		c.addContactNames("Police", 100);
		c.addContactNames("Ambulance", 102);
		c.addContactNames("Fire", 101);
		
		c.getContactNumber("Police");
		c.getContactName(100);
		
		System.out.println();
		System.out.println("All the key values pair are ");
		c.display();
		
	

	}

}
