package optional_class;

import java.util.Optional;

public class Assignment02 {
	String address;
	String default_address = "India";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment02 obj = new Assignment02();
		Optional<String> n = Optional.ofNullable(obj.address);
		
		System.out.println(n.orElse(obj.default_address));
	}

}