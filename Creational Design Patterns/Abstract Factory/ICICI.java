package AbstractFactoryMethod;

public class ICICI implements Bank {
	private final String BNAME;  
    public ICICI(){  
           BNAME="ICICI BANK";  
    }  
   
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BNAME;
	}

}
