package builder_pattern;

public class Engine {   
    private double mileage;
    private boolean started;
    private final double volume;
    
    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }
    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getVolume() {
		return volume;
	}
	public void setStarted(boolean started) {
		this.started = started;
	}
}
