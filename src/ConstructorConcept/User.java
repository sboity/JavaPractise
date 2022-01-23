package ConstructorConcept;

public class User {
	
	private String name ;
	private int age;
	private String city ;
	
	public User(String name, int age) {
		this.name = name ;
		this.age = age ;
	}
	
	public User(String name, String city) {
		this.name = name ;
		this.city = city ;
	}
	
	public String getName() {
		return name ;
	}
	
	public int getAge() {
		return age ;
	}
	
	public String getCity() {
		return city ;
	}

}
