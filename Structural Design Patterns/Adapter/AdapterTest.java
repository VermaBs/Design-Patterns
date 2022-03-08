package adapter;

/**
 * 
 * The Adapter pattern is pretty common in Java code. 
 * It’s very often used in systems based on some legacy code. In such cases, 
 * Adapters make legacy code work with modern classes.
 * @author bhimsingh
 * Adapter can make incompatible objects work together.
 */

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      RoundHole hole=new RoundHole(3);
      RoundPeg rpeg=new RoundPeg(3);
      
      System.out.println(hole.fits(rpeg));
      
      SquarePeg speg=new SquarePeg(5);
      SquarePegAdapter adapter=new SquarePegAdapter(speg);
      System.out.println(hole.fits(adapter));
      
	}

}
