package lambda_expressions;

interface WordCount {
    int count(String str);
}

public class Assign_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCount wc = str -> {
			return (str.split(" ").length);
		};
		System.out.println(wc.count("This is Rahul Mali"));
	}

}
