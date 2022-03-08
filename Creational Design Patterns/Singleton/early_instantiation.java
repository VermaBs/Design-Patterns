package Singleton_design_pattern;

public class early_instantiation {
 
		 private static early_instantiation obj=new early_instantiation();//Early, instance will be created at load time  
		 
		 private early_instantiation(){}  
		   
		 public static early_instantiation getObject(){  
		  return obj;  
		 }  
}
