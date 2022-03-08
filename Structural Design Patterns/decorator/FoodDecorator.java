package decorator;

/**
 * 
 * Step 3:Create a FoodDecorator abstract class that will 
 * implements the Food interface and override it's all methods and it has the ability
 *  to decorate some more foods.
 * 
 * @author bhimsingh
 *
 */

public abstract class FoodDecorator implements Food {
	 private Food newFood;

	public FoodDecorator(Food newFood) {
		super();
		this.newFood = newFood;
	}  
	
	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return newFood.prepareFood();
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return newFood.foodPrice();
	}
}
