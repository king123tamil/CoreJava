package Multithread_tamil;

public class Encapsulation {
	
	
	
	private  String customerName;
	private  int  customerId;
	private  String   customerPassword;
	
	public void getCustomerName(String Name) {
		customerName=Name;
		
		
	}
	public void getCustomerId(int customerId) {
		this.customerId=customerId;
		
	}
	public void getCustomerPassword( String password) {
		customerPassword=password;
	}
	public void display() {
		System.out.println("this is a customerName: "+customerName+"\nand the customerId is : "+customerId+"\nthe customer password is : "+customerPassword);
	}
	public void setCustomerName(String Name) {
		customerName=Name;
		
		
	}
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
		
	}
	public void setCustomerPassword( String password) {
		customerPassword=password;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation encp=new Encapsulation();
		
		encp.getCustomerName("tamil");
		encp.getCustomerId(123456);
		encp.getCustomerPassword("tamil9945054");
		encp.display();
		
		
		encp.setCustomerName("tamilking");
		encp.setCustomerId(9876);
		encp.setCustomerPassword("kinhl989843");
		encp.display();
		

	}

}
