package exception_handling;

import java.util.Scanner;

//UserRegistration

class UserRegistration{
	public void registerUser(String username,String userCountry) throws InvalidCountryException{
		if(!userCountry.equals("India"))
				throw new InvalidCountryException("User Outside India can't be register");
		else
			System.out.println("User Registration Successfully");
	}
}

class InvalidCountryException extends Exception{
	public InvalidCountryException(String userCountry) {
		super(userCountry);
	}
}


public class EH04{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String country = sc.next();
		
		UserRegistration ur = new UserRegistration();
		
		try {
			ur.registerUser(name,country);
		}catch(InvalidCountryException e) {
			System.out.println(e);
		}

	}

}
