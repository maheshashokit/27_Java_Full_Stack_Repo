package com.ashokit.iostreams;

import java.io.FileWriter;

public class FileWriterDemo {
	
	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("sureshit.txt");){
			
			//Preparing the data
			String data = "Welcome To Ashok IT For Java Full Stack Development\t";

			//writing the data
			fw.write(data);
			fw.write("\n");
			//writing the single character
			fw.write(97);
			
			//forcily writing the characters into destination
			fw.flush();
			
		    System.out.println("File Created Successfylly with Data.....");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}