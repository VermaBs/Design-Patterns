package facade1;

public class VideoFile {
	private String name;
	private String codecType;
	public VideoFile(String name) {
		super();
		this.name = name;
		this.codecType =  this.codecType = name.substring(name.indexOf(".") + 1);
	}
	public String getName() {
		return name;
	}
	public String getCodecType() {
		return codecType;
	}
}
