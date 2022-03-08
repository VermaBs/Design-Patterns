package FactoryMethod;

/*
GenerateBill class will use GetPlanFactory to get a Plan object.
It will pass information (DOMESTICPLAN / COMMERCIALPLAN / INSTITUTIONALPLAN) to
GetPalnFactory to get the type of object it needs.
*/

public class GenerateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       GetPlanFactory bridge=new GetPlanFactory();
      Plan p1= bridge.getPlan("DOMESTICPLAN");
      Plan p2=  bridge.getPlan("COMMERCIALPLAN");
      System.out.println(p1.gePlantName()+"  "+ p1.getRate()+"  "+ p1.calculateBill(10));
      System.out.println(p2.gePlantName()+"  "+ p2.getRate()+"  "+ p2.calculateBill(10));

	}

}
