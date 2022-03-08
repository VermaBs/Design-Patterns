package ChainOfResponsibilityPattern;

public class DebugBasedLogger extends Logger {

	public DebugBasedLogger(int levels) {  
        this.levels=levels;  
	} 
	@Override
	protected void displayLogInfo(String msg) {
		// TODO Auto-generated method stub
        System.out.println("DEBUG LOGGER INFO: "+msg);  
	}

}
