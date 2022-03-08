package Singleton_design_pattern;

import java.io.ObjectStreamException;
import java.io.Serializable;


public class SingletonAll implements Cloneable,Serializable {
	
	private static class MyInnerClass
    {
	    private static final SingletonAll INSTANCE = new SingletonAll();
	}
    public static SingletonAll getInstance()
    {
      return MyInnerClass.INSTANCE;
    }
	  @Override
	  protected Object clone() throws CloneNotSupportedException 
	  {
		  //throw new CloneNotSupportedException();
		  return MyInnerClass.INSTANCE;
	  }
	  
	// implement readResolve method
	    protected Object readResolve() 
	    {
	    	return MyInnerClass.INSTANCE;
	    }

}
