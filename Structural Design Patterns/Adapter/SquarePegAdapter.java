package adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;
    

	public SquarePegAdapter(SquarePeg squarePeg) {
		this.squarePeg = squarePeg;
	}
	@Override
    public double getRadius() {
		 return this.squarePeg.getWidth()/Math.sqrt(2);  
	}
	
  
}
