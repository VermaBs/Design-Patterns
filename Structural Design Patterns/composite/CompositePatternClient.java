package composite;

/**
 * Create a CompositePatternDemo class that will also be treated as a Client and 
 * it will use the Employee interface.
 * 
 * @author bhimsingh
 *
 */

public class CompositePatternClient {

	public static void main(String args[]){  
        Employee emp1=new Cashier(101,"Sohan Kumar", 20000.0);  //Leaf-Cashier ,component-Employee
        Employee emp2=new Cashier(102,"Mohan Kumar", 25000.0);  //Leaf-Cashier ,component-Employee
        Employee emp3=new Accountant(103,"Seema Mahiwal", 30000.0);  //Leaf -Accountant ,component-Employee
        Employee manager1=new BankManager(100,"Ashwani Rajput",100000.0);  //Composite 
        //Defines behavior for components having children. eg. Cashier,Accountant
        //Stores child components
        //Implements child related operations in the component interface
           
         manager1.add(emp1);  
         manager1.add(emp2);  
         manager1.add(emp3);  
         manager1.print();  
       }  

}
