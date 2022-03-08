package facade1;

public class CodecFactory {
	public static Codec extract(VideoFile file) {
		String type=file.getCodecType();

		 if (type.equals("mp4")) {
	            System.out.println("CodecFactory: extracting mpeg audio...");
	            return new MPEG4CompressionCodec();
	        }
	        else {
	            System.out.println("CodecFactory: extracting ogg audio...");
	            return new OggCompressionCodec();
	        }
		
	}
	public static Codec extract(String codecType) {
		 if (codecType.equals("mp4")) {
	            System.out.println("CodecFactory: getting mp4 Codec Object...");
	            return new MPEG4CompressionCodec();
	        }
	        else {
	            System.out.println("CodecFactory: getting ogg Codec Object...");
	            return new OggCompressionCodec();
	       }
	}
}
