package javasession;

public class MethodsInJava {

	public static void main(String[] args) {
		MethodsInJava obj = new MethodsInJava();
		obj.test(); // calling a method
		int c = obj.sum();
		System.out.println(c);
		int sumReturned = obj.sum(10, 60);
		System.out.println(sumReturned);

	}
	
	//no input and no return
	public void test() {
		System.out.println("test method");
	}
	
	//no input but some return
	public int sum() {
		System.out.println("sum method");
		int a = 10;
		int b = 20;
		int z = a+b;
		return z;
	}
	
	//some input and some return
	public int sum(int a,int b) {
		System.out.println("Add method");
		int sum = a+b;
		return sum;
	}

}
