package FactoryMethod;

public class DomesticPlan extends Plan {

	@Override
	double getRate() {
		// TODO Auto-generated method stub
		 rate=3.50;   
		 return rate;
	}

	@Override
	String gePlantName() {
		// TODO Auto-generated method stub
		return "Domestic Plan";
	}

}
