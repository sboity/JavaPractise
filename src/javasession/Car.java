package javasession;

public class Car {
	
	String name;
	int price;
	String color;
	static int wheels = 4;// common property value

	public static void main(String[] args) {
		//Object will not hold any static property
		
		Car c1 = new Car();
			c1.name = "BMW";
			c1.price = 70;
			c1.color = "White";
			
		Car c2 = new Car();
			c2.name = "Audi";
			c2.price = 60;
			c2.color = "Red";
			
		Car c3 = new Car();
			c3.name = "Honda";
			c3.price = 40;
			c3.color = "Black";
		
			System.out.println(c1.name +"  "+ c1.price+ "  "+c1.color+"  "+Car.wheels);
			System.out.println(c1.wheels);//wrong practise
			
			System.out.println(wheels);//static variable can be accessed without class name also
	}

}
