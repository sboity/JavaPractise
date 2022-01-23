package ConstructorConcept;

public class Employee {
	
	public Employee() {
		System.out.println("Default constructor");
	}
	
	public Employee(int a) {
		System.out.println("1 param constructor" + " "+ a);
	}
	public Employee(int a, String b) {
		System.out.println("2 params constructor" + " " +  a+b);
	}
	
	public static void main(String args[]) {
		Employee e1 = new Employee(8,"Hi");
	}


}
