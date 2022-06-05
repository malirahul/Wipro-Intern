package wipro.FlowControl;

public class FlowControl3 {

	public static void main(String[] args) {
			if(args.length==0) {
				System.out.println("No values");
			}
			else {
				for(String i :args)
				System.out.println(i+",");
			}
	}

}
