package ChainOfResponsibilityPattern;

public abstract class Logger {
    public static final int OUTPUTINFO=1;  
    public static final int ERRORINFO=2;  
    public static final int DEBUGINFO=3;  
    
    protected int levels;  
    protected Logger nextLevelLogger;  
    
    public void setNextLevelLogger(Logger nextLevelLogger) {  
        this.nextLevelLogger = nextLevelLogger;  
    }  
    
    public void logMessage(int levels, String msg){  
        if(this.levels<=levels){  
            displayLogInfo(msg);  
        }  
        if (nextLevelLogger!=null) {  
            nextLevelLogger.logMessage(levels, msg);  
        }  
    }  
    protected abstract void displayLogInfo(String msg);  
}
