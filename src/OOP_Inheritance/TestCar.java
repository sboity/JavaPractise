package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.stop();// inherited method
		b.refuel();//inherited method
		b.start();//overridden method
		b.autoParking();//individual method
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		//top casting
		Car c1 = new BMW();
		c1.stop();
		c1.refuel();
		c1.start();
		
		//down casting- It will throw ClassCast exception in runtime.
		//BMW b1 = (BMW) new Car();
		

	}

}
