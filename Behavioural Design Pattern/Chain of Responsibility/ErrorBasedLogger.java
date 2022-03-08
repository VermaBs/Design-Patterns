package ChainOfResponsibilityPattern;

public class ErrorBasedLogger extends Logger{
    
	public ErrorBasedLogger(int levels) {  
	        this.levels=levels;  
	} 
	@Override
	protected void displayLogInfo(String msg) {
		// TODO Auto-generated method stub
        System.out.println("ERROR LOGGER INFO: "+msg);  
	}

}
