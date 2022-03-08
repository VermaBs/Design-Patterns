package proxy;
/**
 * Create a RealInternetAccess class that will implement OfficeInternetAccess 
 * interface for granting the permission to the specific employee.
 * 
 * @author bhimsingh
 *
 */
public class RealInternetAccess implements OfficeInternetAccess {
	private String employeeName;  
    public RealInternetAccess(String empName) {  
        this.employeeName = empName;  
    }
	@Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
        System.out.println("Internet Access granted for employee: "+ employeeName);  
	}  
}
