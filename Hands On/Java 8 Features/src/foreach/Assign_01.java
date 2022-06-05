package foreach;

import java.util.ArrayList;
import java.util.Arrays;

public class Assign_01 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(
				Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));
		
		al.forEach(day -> System.out.println(day));
	}

}
