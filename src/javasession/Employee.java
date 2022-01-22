package javasession;

public class Employee{
	
	String name;
	int age;
	double salary;
	boolean isActive;
	
	public static void main(String args[])
	{
		Employee e1 = new Employee();
			System.out.println(e1.name);
			System.out.println(e1.age);
			System.out.println(e1.salary);
			System.out.println(e1.isActive);
			
			
	System.out.println("=====================");
	
	 	Employee e2 = new Employee();
	 		e2.name = "Shyam";
	 		e2.age = 18;
	 		e2.salary = 23.89;
	 		e2.isActive = true;
	 			System.out.println(e2.name);
	 			System.out.println(e2.salary);
	 		
	 			//No reference object
	 		new Employee().name = "Lisa";
	 		new Employee().age = 22;
	 		
	 		Employee e5 = new Employee();
	 		e5 = null; // null reference object
	 		System.out.println(e5.name);// NullPointerException because we are accessing one of the class property with null
	 		
	 		System.gc();// will try to destroy 3 objects

	}

}
