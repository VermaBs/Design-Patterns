package facade1;

import java.io.File;

public class AudioMixer {
  public File fixAudio(VideoFile file) {
		 System.out.println("AudioMixer: fixing the file...");
        return new File("tmp");
  }
}
