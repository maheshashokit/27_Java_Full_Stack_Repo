package com.ashokit.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderdDemo {
	
	public static void main(String[] args) {
		
	    try(BufferedReader br = new BufferedReader(new 
	    	FileReader("src/students.txt"));){
	    	
	    	String studentInfo;
	    	while((studentInfo = br.readLine()) != null) {
	    		System.out.println("St==>" + studentInfo);	
	    		
	    		String[] stInfo = studentInfo.split(",");
	    		System.out.println(stInfo[0]+"===>"+stInfo[1]+"===>"+ stInfo[2]+"===>"+ stInfo[3]);
	    	}
	    }catch(Exception e) {
	    	e.printStackTrace(); 
	    }
	}

}
