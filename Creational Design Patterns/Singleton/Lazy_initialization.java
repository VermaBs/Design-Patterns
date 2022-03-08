package Singleton_design_pattern;

public class Lazy_initialization {

	 private static Lazy_initialization obj;
	 
	 private Lazy_initialization(){}  
	   
	 public static   Lazy_initialization getObject(){  
		 if(obj==null) {
			 synchronized(Lazy_initialization.class) {
				 if(obj==null) 
						 obj=new Lazy_initialization();  
					 
					
		} 
		 } 
		 return obj;	
	 }  
}


/* Improvement over above method(“Double Checked Locking” )
 * If you notice carefully once an object is created synchronization is no longer useful because 
 * now obj will not be null and any sequence of operations will lead to consistent results. 
 * So we will only acquire lock on the getInstance() once, when the obj is null. 
 * This way we only synchronize the first way through, just what we want. 
 *
 * 
 *
 if(obj==null) {
	synchronized(Lazy_initialization.class) {
		 if(obj==null) {
				 obj=new Lazy_initialization();  
			 }
			return obj;	
	}
}
*/