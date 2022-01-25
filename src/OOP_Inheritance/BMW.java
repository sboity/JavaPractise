package OOP_Inheritance;

public class BMW extends Car{
	
	@Override
	public void start() {
		System.out.println("BMW--start");
	}

	public void autoParking() {
		System.out.println("BMW--autoParking");
	}
	

	public static void getName() {
		System.out.println("BMW--Get Name");
	}

}
