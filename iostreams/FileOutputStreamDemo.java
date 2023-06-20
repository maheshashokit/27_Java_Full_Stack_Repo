package com.ashokit.iostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	
	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("ashokit.txt",true)){
			
			//Taking the String variable of data for writing into file
			String data  = "Welcome To Ramesh IT For Java Full Stack Development";
			
			//converting the string into bytes
			byte[] dataOfBytes = data.getBytes();
			
			//writing the byteArray into FileOutputStream Stream
			fos.write(dataOfBytes);
			
			//flushing to write all the characters to outputStream
			fos.flush();
						
			System.out.println("File Data Written Got Complete Pleaser Verify the File.....");
			
		} catch(FileNotFoundException fne) {
			fne.printStackTrace();
		} catch(IOException ie) {
			ie.printStackTrace();
		}
	}

}
