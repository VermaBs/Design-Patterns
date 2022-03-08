package decorator;

/**
 * 
 * When you want to transparently and dynamically add responsibilities 
 * to objects without affecting other objects.
 * When you want to add responsibilities to an object that you may want to change in future.
 * Extending functionality by sub-classing is no longer practical.
 * 
 * @author bhimsingh
 *
 */

public class DecoratorPatternCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food vf=new VegFood();  
        System.out.println(vf.prepareFood());  
        System.out.println( vf.foodPrice());  
        
        Food f1=new NonVegFood(vf);  
        System.out.println(f1.prepareFood());  
        System.out.println( f1.foodPrice());  
        
        Food f2=new ChineeseFood(vf);  
        System.out.println(f2.prepareFood());  
        System.out.println( f2.foodPrice());  
	}

}



//The Decorator Pattern uses composition 
//instead of inheritance to extend the functionality of an object at runtime.