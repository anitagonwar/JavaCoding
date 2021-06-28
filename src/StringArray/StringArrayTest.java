package StringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayTest {

	public static void main(String[] args) {
		String [] words = {"ace" , "boom", "dog" , "monkey", "donkey"};
		
		List<String> wordslist = Arrays.asList(words);
		
		for(String elist : wordslist) {
			System.out.println(elist);
		}
	}

}
