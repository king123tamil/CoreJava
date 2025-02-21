package employeeDay14;

public class Employee {
	private String name;
	private String dept;
	private double phone;
	private int ID;
	
	
	public Employee(){
		
	}
	
	
	public Employee(String name, String dept, double phone, int iD) {
		
		this.name = name;
		this.dept = dept;
		this.phone = phone;
		this.ID = iD;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", phone=" + phone + ", ID=" + ID + "]";
	}
	
	

}
