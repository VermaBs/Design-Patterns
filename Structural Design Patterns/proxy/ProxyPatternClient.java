package proxy;

public class ProxyPatternClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        OfficeInternetAccess access = new ProxyInternetAccess("Bhim verma");  
        access.grantInternetAccess();
	}

}
