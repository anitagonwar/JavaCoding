//1. Write a java program to store 5 student information in a treeMap
//Note: student object has student name and student reg no

package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapProg {

	public static void main(String[] args) {
		Map<Key, Integer> treemap = new TreeMap<>();
		
        treemap.put(new Key("Anamika"), 100);
        System.out.println("Tree size:" + treemap.size());
        
        treemap.put(new Key("Rushika"), 200);
        System.out.println("Tree size:" + treemap.size());
        
        treemap.put(new Key("Dinesh"), 500);
        System.out.println("Tree size:" + treemap.size());
        
        treemap.put(new Key("Arnav"), 300);
        System.out.println("Tree size:" + treemap.size());
        
        treemap.put(new Key("Ajay"), 700);
        System.out.println("Tree size:" + treemap.size());
        
        treemap.put(new Key("Anthony"), 400);
        System.out.println("Tree size:" + treemap.size());
        
        System.out.println(treemap.get(new Key("Arnav")));
        
        treemap.remove(new Key("Anthony"));
        System.out.println(treemap.get(new Key("Anthony")));
	}

}
