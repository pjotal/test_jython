

public class Person {
	private String name;
	private String birthdate;
	
	public Person(String name, String birthdate) {
		this.name = name;
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}

	public String getBirthdate() {
		return birthdate;
	}
	
	public String toString() {
		return "name: " + this.getName() + "\nbirthdate: " + this.getBirthdate();
	}
}
