package builder_pattern;

/**
 * Car manual is another product. Note that it does not have the same ancestor
 * as a Car. They are not related.
 */
public class Manual {
	private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final GPSNavigator gpsNavigator;
    
    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, GPSNavigator gpsNavigator) {
		super();
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.gpsNavigator = gpsNavigator;
	}

	public CarType getCarType() {
		return carType;
	}

	public int getSeats() {
		return seats;
	}

	public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}

	  public String print() {
	        String info = "";
	        info += "Type of car: " + carType + "\n";
	        info += "Count of seats: " + seats + "\n";
	        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
	        info += "Transmission: " + transmission + "\n";
	      
	        if (this.gpsNavigator != null) {
	            info += "GPS Navigator: Functional" + "\n";
	        } else {
	            info += "GPS Navigator: N/A" + "\n";
	        }
	        return info;
	    }

}
