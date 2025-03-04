package Emps;

class Energy{
	private String name;
	private int idno;
	public Energy(String name, int idno) {
		
		this.name = name;
		this.idno = idno;
	}


Energy(){  
	
}

	@Override
	public String toString() {
		return "employeename :"+ name +"\n employeeIdno :" + idno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIdno() {
		return idno;
	}


	public void setIdno(int idno) {
		this.idno = idno;
	}
	
}




public class Assesment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Energy emp=new Energy("tamil",1234);
		Energy emp1=new Energy("elangamban",17834);
		System.out.println(emp);
		Energy emp2=new Energy();
		emp2.setIdno(7901);
		emp2.setName("tamil");
		System.out.println(emp2.getIdno());
		System.out.println(emp2.getName());
		

	}

}
