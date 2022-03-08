package prototype_pattern;

public class PrototypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeRecord e1=new EmployeeRecord(1234,"Bhim","LS",25.5,"Hyd");
		EmployeeRecord e2=(EmployeeRecord)e1.getClone();
		
		System.out.println(e1);
		e2.setDesignation("Lead");
		System.out.println(e2);
	}

}
