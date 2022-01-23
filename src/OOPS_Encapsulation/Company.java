package OOPS_Encapsulation;

public class Company {

	private String name;
	private int empCount;
	private String hq;
	
	
	public String getCompInfo(){ //getter of getting all company information
		String info = name + empCount + hq ;
		return info;
	}
	
	// setter and getter : public
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpCount() {
		return empCount;
	}
	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	public String getHq() {
		return hq;
	}
	public void setHq(String hq) {
		this.hq = hq;
	}

	
//	public static void main(String[] args) {
//		Company obj = new Company();
//		obj.name = "IBM";
//		System.out.println(obj.name);
//		
//		
//
//	}

}
