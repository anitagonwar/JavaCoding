package ListExample;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Srinivas");
		names.add("Anita");
		names.add("Shripriya");
		names.add("Shrinika");
		
		for(String Name : names) {
			System.out.println(Name);
		}
	}

}
