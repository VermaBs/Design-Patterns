package builder_pattern;

/**
 * Car is a product class.
 */
public class Car {
   private CarType carType;
   private Engine engine;
   private int seats;
   private GPSNavigator gps;
   private Transmission transmission;
   private int fuel;
   
	public Car(CarType carType, Engine engine, int seats, GPSNavigator gps, Transmission transmission) {
		super();
		this.carType = carType;
		this.engine = engine;
		this.seats = seats;
		this.gps = gps;
		this.transmission = transmission;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setGps(GPSNavigator gps) {
		this.gps = gps;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public CarType getCarType() {
		return carType;
	}

	public Engine getEngine() {
		return engine;
	}

	public int getSeats() {
		return seats;
	}

	public GPSNavigator getGps() {
		return gps;
	}

	public Transmission getTransmission() {
		return transmission;
	}
	
	
}
