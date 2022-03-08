package FactoryMethod;

public abstract class Plan {
	 protected double rate;  
     abstract double getRate();
     abstract String gePlantName();
     public double calculateBill(int units){  
         return units*rate;  
     }  
}
