package RemoveDuplicatesWithoutCollections;

public class Employee {
	private int regno;
	private String name;

//constructor of Employee class  
	public Employee(int regNo, String name) {
		this.name = name;
		this.regno = regNo;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regNo) {
		this.regno = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		if (obj == this)
			return true;
		return this.getRegno() == ((Employee)obj).getRegno();
	}

}