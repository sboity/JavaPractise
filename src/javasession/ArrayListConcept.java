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

	}

}
