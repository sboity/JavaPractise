package OOPS_Encapsulation;

public class TestCompany {

	public static void main(String[] args) {
		
		Company obj = new Company();
		obj.setName("IBM");
		obj.setEmpCount(1000);
		obj.setHq("USA");
		
		System.out.println(obj.getName());
		System.out.println(obj.getEmpCount());
		System.out.println(obj.getHq());
	}

}
