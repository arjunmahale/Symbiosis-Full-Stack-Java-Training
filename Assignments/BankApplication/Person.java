package Assignment6;

public class Person {
	private String personname;
	private String city;
	
	public Person(String personname, String city) {
		super();
		this.personname = personname;
		this.city = city;
	}

	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [personname=" + personname + ", city=" + city + "]";
	}
	
	
	
}
