package StrategyPattern;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Context context = new Context(new Addition());          
        System.out.println(context.executeStrategy(10, 2));
        context.setStrategy(new Multiplication());
        System.out.println(context.executeStrategy(10, 2));

	}

}
