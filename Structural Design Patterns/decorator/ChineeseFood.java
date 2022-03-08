package decorator;

public class ChineeseFood extends FoodDecorator  {

	public ChineeseFood(Food newFood) {
		super(newFood);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood()+" With Fried Rice and Manchurian ";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice()+150;
	}
}
