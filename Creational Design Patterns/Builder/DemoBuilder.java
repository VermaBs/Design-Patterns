package builder_pattern;

/**
The example also shows how Builder produces products of different kinds (car manual) using the same building steps.

The Director controls the order of the construction. It knows which building steps to call to produce this or that car model.
It works with builders only via their common interface. This allows passing different types of builders to the director.

The end result is retrieved from the builder object because the director can’t know the type of resulting product. 
Only the Builder object knows what does it build exactly.
**/

public class DemoBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director();
		
		// Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
		CarBuilder carbuilder=new CarBuilder();
        director.constructSportsCar(carbuilder);
		
        Car car = carbuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
        System.out.println("");
        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructCityCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

	
	}

}
