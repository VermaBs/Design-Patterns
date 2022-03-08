package prototype_pattern;


//Prototype Pattern says that cloning of an existing object instead of creating new one and 
//can also be customized as per the requirement. 

public class EmployeeRecord implements Prototype {
	   private int id;  
	   private String name,designation; 
	   private double salary;  
	   private String address;
	   
	   public EmployeeRecord(int id, String name,String designation, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.designation=designation;
	}
	 
	   public String toString(){  
	       return (id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);  
	   }

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return new EmployeeRecord(id,name,designation,salary,address) ;
	}     
}
