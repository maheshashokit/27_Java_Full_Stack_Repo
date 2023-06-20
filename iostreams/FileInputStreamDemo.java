package com.ashokit.iostreams;

import java.io.FileInputStream;

public class FileInputStreamDemo {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("ashokit.txt")){

			//reading single byte of information
			/*int data;
			System.out.println("Available Bytes::::" + fis.available());
			while((data = fis.read()) != -1) {
				System.out.println("121212121");
				System.out.print((char)data);
			}*/
			
			//version-2
			byte[] allInfo = fis.readAllBytes();
			//convert from byte[] into string
			String fileInfo = new String(allInfo);
			System.out.println(fileInfo);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
