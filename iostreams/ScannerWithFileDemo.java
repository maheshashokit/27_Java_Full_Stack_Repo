package com.ashokit.iostreams;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ScannerWithFileDemo {
	public static void main(String[] args) {
	    try(Scanner sc = new Scanner(new File("src/stream.txt"));
	    	Scanner sc1 = new Scanner("src/demo.jpg");) {
	    	//hasNextLine() checks in the file whether we have nextLine or not
	    	while(sc.hasNextLine()) {
	    		//sc.nextLine() is used to get the current line from file
	    		String currentLineInfo = sc.nextLine();
	    		System.out.println(currentLineInfo);
	    	}
	    	
	    	//Reading the image logic
	    	byte[] b = new byte[2048];
	    	int i = 0;
	    	System.out.println("sdfsfs" + sc1.hasNextByte());
	    	while(sc1.hasNextByte()) {
	    		byte currentByte = sc1.nextByte();
	    		b[i] = currentByte;
	    		i++;
	    		System.out.println(b[i]+ "  ");
	    	}
	    	
	    	FileOutputStream fos = new FileOutputStream("ashokit.jpg");
	    	fos.write(b);
	    	System.out.println("Image Created.......");
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
}