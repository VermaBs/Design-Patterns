package AbstractFactoryMethod;
/*
Abstract Factory Pattern says that just define an interface or abstract class for 
creating families of related (or dependent) objects but without specifying their concrete sub-classes.
That means Abstract Factory lets a class returns a factory of classes.
So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.
*/

public class AbstractFactoryPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String bankName="HDFC";  
	  
	System.out.print("\n");  
	System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");  
	  
	String loanName="Home";  
	AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");  
	Bank b=bankFactory.getBank(bankName);  
	  
	  
	double rate=10;  
	System.out.println("interest rate for "+b.getBankName()+ ": "+rate);  
	  
	double loanAmount=50000;    
	int years=5;  
	  
	System.out.println("you are taking the loan from "+ b.getBankName());  
	  
	AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");  
	           Loan l=loanFactory.getLoan(loanName);  
	           l.getInterestRate(rate);  
	           System.out.println("EMI calculated " +l.calculateLoanPayment(loanAmount,years) +"/Month for "+loanName+" Loan from "+b.getBankName()  );  
	  }  
	

}
