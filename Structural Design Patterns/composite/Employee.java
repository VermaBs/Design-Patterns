package composite;
/**
 * Create an Employee interface that will be treated as a component.
 * @author bhimsingh
 *
 */
public interface Employee {
	 public  int getId();  
	 public String getName();  
	 public double getSalary();  
	 public void print();  
	 public void add(Employee employee);  
	 public void remove(Employee employee);  
	 public Employee getChild(int i);  
}
