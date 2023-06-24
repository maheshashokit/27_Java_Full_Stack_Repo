package com.ashokit.iostreams;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintStreamDemo {
	
	public static void main(String[] args)throws Exception {
		
		try(PrintStream ps = new PrintStream("src/stream.txt");){
			String data = "Welcome To Ashok IT PrintStream Class...";
			ps.write(data.getBytes());
			ps.println(false);
			ps.println('a');
			ps.println("Mahesh");
			ps.println(213);
			ps.println(12.3658f);
			System.out.println("Data Written Completed.....");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try(PrintStream pw1 = new PrintStream(System.out);){
			
			pw1.println("Welcome To Ashok IT Java Full Stack Development");
			
			pw1.println("Hyderabad, Ameerpet.....");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}