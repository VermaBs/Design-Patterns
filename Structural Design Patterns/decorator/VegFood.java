package decorator;

public class VegFood implements Food {

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return "veg food";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return 150;
	}

}
