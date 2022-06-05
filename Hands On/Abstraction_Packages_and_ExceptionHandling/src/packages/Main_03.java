package packages;

import packages.com.automobile.Honda;
import packages.com.automobile.twowheeler.Hero;

//Test class
public class Main_03 {

	public static void main(String[] args) {
		Hero h = new Hero("Hero","RA123456","Rahul",150);
		System.out.println(h.getModelName());
		System.out.println(h.getRegistrationNumber());
		System.out.println(h.getOwnerName());
		System.out.println(h.getSpeed());
		h.radio();
		
		System.out.println("=====================================");
		Honda honda = new Honda("Honda","DP123456","Dimple",180);
		System.out.println(honda.getModelName());
		System.out.println(honda.getRegistrationNumber());
		System.out.println(honda.getOwnerName());
		System.out.println(honda.getSpeed());
		honda.cdPlayer();
	}

}
