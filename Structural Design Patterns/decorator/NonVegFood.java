package decorator;

public class NonVegFood extends FoodDecorator {

	public NonVegFood(Food nonVegFood) {
		super(nonVegFood);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood()+" With Roasted Chiken and Chiken Curry ";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice()+200;
	}
}
