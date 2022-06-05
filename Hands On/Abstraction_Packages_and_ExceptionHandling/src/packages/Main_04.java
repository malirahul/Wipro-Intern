package packages;

import packages.com.automobile.Ford;
import packages.com.automobile.Logan;

public class Main_04 {

	public static void main(String[] args) {
		Logan l = new Logan("Logan","LG12345","Rahul",120,7);
		System.out.println(l.getModelName()+"\n"+l.getRegistrationNumber()+"\n"+l.getOwnerName());
		System.out.println(l.speed());
		System.out.println(l.gps());
		
		System.out.println("============================================");
		
		
		Ford f = new Ford("Ford","FD12345","Dimple",175,3);
		System.out.println(f.getModelName()+"\n"+f.getRegistrationNumber()+"\n"+f.getOwnerName());
		System.out.println(f.speed());
		System.out.println(f.tempControl());
	}

}
