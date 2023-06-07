package com.ashokit.interfaces;

public interface SocialMedia {
	
	public abstract String postingMessages(String message);
	
	public abstract String postingMessages(String[] message);
	
	public abstract String voiceCalling();
	
	public abstract String videoCalling();
	
	public abstract void sharingDigitalFiles(String[] fileNames);
	
	public abstract void sharingDigitalFiles(String fileNames);
	
}