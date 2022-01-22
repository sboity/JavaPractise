package javasession;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.name = "Shyam";
		c1.emailId = "shyam@gmail.com";
		c1.phone = 67867786;
		c1.isPrime = true;
		
		System.out.println(c1.name);
		System.out.println(Customer.category);

	}

}
