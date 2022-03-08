package FactoryMethod;

public class CommercialPlan extends Plan {


	@Override
	double getRate() {
		// TODO Auto-generated method stub
		 rate=5.50;   
		 return rate;
	}

	@Override
	String gePlantName() {
		// TODO Auto-generated method stub
		return "Commercial Plan";
	}

}
