package facade1;

import java.io.File;

public class VideoConversionFacadeImpl implements VideoConversionFacade {

	@Override
	public File convertVideo(String fileName, String format) {
		// TODO Auto-generated method stub
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile video=new VideoFile(fileName);
        Codec sourceCodec=CodecFactory.extract(video); 
        Codec destinationCodec=CodecFactory.extract(format);
        
        VideoFile buffer = BitrateReader.read(video, sourceCodec);
        VideoFile intermediateResult =BitrateReader.convert(buffer, destinationCodec);
        File result =new AudioMixer().fixAudio(intermediateResult);
        
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
	}

}
