package builder_pattern;

public class CarBuilder implements Builder {
	private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;
    
	@Override
	public void setCarType(CarType type) {
		// TODO Auto-generated method stub
       this.type=type;
	}

	@Override
	public void setSeats(int seats) {
		// TODO Auto-generated method stub
     this.seats=seats;
	}

	@Override
	public void setEngine(Engine engine) {
		// TODO Auto-generated method stub
     this.engine=engine;
	}

	@Override
	public void setTransmission(Transmission transmission) {
		// TODO Auto-generated method stub
    this.transmission=transmission;
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		// TODO Auto-generated method stub
     this.gpsNavigator=gpsNavigator;
	}

	 public Car getResult() {
	        return new Car(type,engine, seats, gpsNavigator,  transmission);
	    }

}
