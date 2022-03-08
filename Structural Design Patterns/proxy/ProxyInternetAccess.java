package proxy;

public class ProxyInternetAccess implements OfficeInternetAccess{
    private String employeeName;  
    private RealInternetAccess  realaccess;  
       
    public ProxyInternetAccess(String employeeName) {  
     this.employeeName = employeeName;  
    }  
    
    public int getRole(String emplName) {  
        // Check role from the database based on Name and designation  
        // return job level or job designation.  
        return 9;  
    }

	@Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
		  if (getRole(employeeName) > 4)   
          {  
              realaccess = new RealInternetAccess(employeeName);  
              realaccess.grantInternetAccess();  
          }   
          else   
          {  
              System.out.println("No Internet access granted. Your job level is below 5");  
          }  
	} 
}
