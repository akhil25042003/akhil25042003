import java.io.Serializable;

public class Cricketer implements Serializable{
	String name;
	int age;
	String country;
	int runs;
	int wickets;
	public Cricketer(String name, int age, String country, int runs, int wickets) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
		this.runs = runs;
		this.wickets = wickets;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
	public int getRuns() {
		return runs;
	}
	public int getWickets() {
		return wickets;
	}

}
