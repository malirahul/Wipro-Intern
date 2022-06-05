package wipro.FlowControl;

public class FlowControl4 {

	public static void main(String[] args) {
		int c1 =args[0].charAt(0);
		int c2 =args[1].charAt(0);
		
		if(c1>c2)
			System.out.println(args[1]+","+args[0]);
		else
			System.out.println(args[0]+","+args[1]);

	}

}
