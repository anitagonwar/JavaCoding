//8. Store user defined employee objects into arraylist and Remove duplicates from arraylist without using collections.

package RemoveDuplicatesWithoutCollections;

import java.util.ArrayList;

public class RemoveDuplicates {
	
	public static void main(String[] args){
	    ArrayList<Object> al = new ArrayList<Object>();
	  //creating two instances of the Employee class  
	    Employee emp1 = new Employee(918, "Maria");  
	    Employee emp2 = new Employee(918, "Maria");
	    Employee emp3 = new Employee(940, "Rose");
	    Employee emp4 = new Employee(942, "Ada");
	    Employee emp5 = new Employee(944, "Ann");
	    
	    al.add(emp1);
	    al.add(emp2);
	    al.add(emp3);
	    al.add(emp4);
	    al.add(emp5);
	   

	System.out.println("Before Remove Duplicate elements:"+al);
	for (int i = 0; i < al.size(); i++) {
		for (int j = i + 1; j < al.size(); j++) {
			if (al.get(i).equals(al.get(j))) {
				al.remove(j);
				j--;
			}
		}
	}
    System.out.println("After Removing duplicate elements:"+al);
	}
}
