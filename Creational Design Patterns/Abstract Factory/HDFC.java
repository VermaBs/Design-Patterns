package AbstractFactoryMethod;

public class HDFC implements Bank{

	private final String BNAME;  
    public HDFC(){  
           BNAME="HDFC BANK";  
    }  
   
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BNAME;
	}

	

}
