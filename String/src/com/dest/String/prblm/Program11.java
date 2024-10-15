package com.dest.String.prblm;
class Crickter{
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	private int matches;
	private int runs;
	private int age;
	private String team_name;
}

public class Program11 {
	public static void main(String[] args) {
		Crickter c1 = new Crickter();9
		c1.setName("Kohli");
		c1.setAge(29);
		c1.setMatches(100);
		c1.setRuns(1000);
		c1.setTeam_name("RCB");
		System.out.println(c1.getAge());
		System.out.println(c1.getMatches());
		System.out.println(c1.getName());
		System.out.println(c1.getRuns());
		System.out.println(c1.getTeam_name());
	}
}
