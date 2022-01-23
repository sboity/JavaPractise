package ConstructorConcept;

public class TestUser {

	public static void main(String[] args) {
		User u1 = new User ("Shyam",22);
		User u2 = new User("Alok","BBSR");
		
		System.out.println(u1.getName());
		System.out.println(u1.getAge());
		System.out.println(u2.getCity());
	}

}
