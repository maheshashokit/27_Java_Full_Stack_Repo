package com.ashokit.iostreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class AshokITStudentsData {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("src/students.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);){
			/*byte[] readAllBytes = fis.readAllBytes();
			String studentInfo = new String(readAllBytes);
			System.out.println(studentInfo);
			
			System.out.println("*******************************************");*/
			int data;
			while((data= fis.read()) != -1) {
				System.out.print((char) data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}