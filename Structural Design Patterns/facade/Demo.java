package facade1;

import java.io.File;

/**
 * 
 * In this example, the Facade simplifies communication with a complex video conversion framework.
 * The Facade provides a single class with a single method that handles all the complexity of 
 * configuring the right classes of the framework and retrieving the result in a correct format.
 *   
 * @author bhimsingh
 *
 */

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 VideoConversionFacade converter = new VideoConversionFacadeImpl();
	     File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
	}

}
