package TreeMap;

import java.util.Comparator;

public class Key implements Comparable<Key>{
	private String key;
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Key(String key) {
		super();
		this.key = key;
	}
	
	@Override
	public int compareTo(Key obj) {
		return Comparator.comparing(Key::getKey).compare(this, obj);
	}
	
}