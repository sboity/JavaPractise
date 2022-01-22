package javasession;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList<>();
		
		System.out.println(ar.size());
		
		ar.add(10);
		ar.add(20);
		System.out.println(ar.size());
		
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(60);
		
		ar.remove(3);
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		
		System.out.println("================================");
		
		//print all values from array-for loop
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("===============================");
		
		//print all values from array-for each loop
		
		ar.add("Hi");
		ar.add('F');
		ar.add(12.89);
		
		
		for(Object e : ar) {
			System.out.println(e);
			
		}
		
		// 	ArrayList with name(string)
		ArrayList<String> empList =new ArrayList<String>();
		empList.add("Neeta");
		empList.add("Suresh");

		//ArrayList with different data types- 	String,int,double, char,boolean,
		
		ArrayList<Object> empData = new ArrayList<Object>();
		
		empData.add("Anari");
		empData.add(298);
		empData.add(45.999);
		empData.add('F');
		empData.add(true);
		
		for(Object e : empData) {
			System.out.println(e);
		}
		
		ArrayList<String> prod = new ArrayList<String> ();
		prod.add("MacBook");
		//prod.add(4,"Samsung");// IndexOutOfBoundsException thrown during runtime.
		prod.add("Samsung");
		System.out.println(prod);
		//System.out.println(prod.get(3)); // IndexOutOfBoundsException thrown during runtime
	}

}
