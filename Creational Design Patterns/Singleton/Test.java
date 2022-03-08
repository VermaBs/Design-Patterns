package Singleton_design_pattern;

public class Test extends Thread {
	public void run(){  
		//BillPughOuterClass obj =BillPughOuterClass.getInstance();
		//Lazy_initialization obj=Lazy_initialization.getObject();
		//System.out.println(this.getName()+"   "+obj);
		System.out.println(BillPughOuterClass.getInstance());
	}  
	public static void main(String []args) throws CloneNotSupportedException {
		Test[] arr=new Test[20];
		for(int i=0 ; i<20 ; i++)
		{	
			arr[i]=new Test();
			arr[i].setName(i+" num thread");
		}
		SingletonAll instance1 = SingletonAll.getInstance();
		SingletonAll instance2 = (SingletonAll) instance1.clone();
	    System.out.println(instance1+" instance1 hashCode:- "
	                           + instance1.hashCode());
	    System.out.println(instance2+" instance2 hashCode:- " 
	                           + instance2.hashCode());

	}
}
