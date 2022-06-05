package packages;

import packages.test_Package.Foundation;

public class Main_01{

	public static void main(String[] args) {
		Foundation f = new Foundation();
		/*
		System.out.println(f.val1); //private variable 
		System.out.println(f.val2); //default variable 
		System.out.println(f.val3); //protected variable
		*/
		System.out.println(f.val4); //public variable

	}

}
