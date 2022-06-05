package lambda_expressions;

import java.util.ArrayList;

public class Assign_02 {

	public static void main(String[] args) {
		ArrayList<StringBuffer> al = new ArrayList<StringBuffer>();
		String[] wordsArray = { "Java", "Python", "C++", "C", "JavaScript", "Go", "Rust", "Bash", "Haskell", "Ruby" };
		
		for (String word : wordsArray) {
			StringBuffer sb = new StringBuffer(word);
			al.add(sb);
		}
		al.forEach(word -> System.out.print(word.reverse() + " "));
				
	}

}
