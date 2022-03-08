package Singleton_design_pattern;

class Singleton2  implements Cloneable
{
  // public instance initialized when loading the class
  public static Singleton2 instance = new Singleton2();
  
  private Singleton2() 
  {
    // private constructor
  }
  
  @Override
  protected Object clone() throws CloneNotSupportedException 
  {
	  //throw new CloneNotSupportedException();
	  return instance;
  }
}
public class ForCloningSingleton {
	public static void main(String[] args) throws CloneNotSupportedException 
	  {
		Singleton2 instance1 = Singleton2.instance;
		Singleton2 instance2 = (Singleton2) instance1.clone();
	    System.out.println("instance1 hashCode:- " 
	                         + instance1.hashCode());
	    System.out.println("instance2 hashCode:- " 
	                         + instance2.hashCode()); 
	  }
}



//////*************For ClassLoader ********************///////
/*

private static Class getClass(String classname) throws ClassNotFoundException {
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    if(classLoader == null) 
        classLoader = Singleton.class.getClassLoader();
      return (classLoader.loadClass(classname));
}

*/