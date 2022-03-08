package AbstractFactoryMethod;

//Abstract Factory lets a class returns a factory of classes.
//here class AbstractFactory will return factory of Bank and Loan classes
public abstract class AbstractFactory {
	public abstract Bank getBank(String bank);  
	public abstract Loan getLoan(String loan);  

}
