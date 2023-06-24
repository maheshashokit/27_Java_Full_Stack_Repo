package com.ashokit.iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args)throws Exception {
		// Create a FileWriter and wrap it with a BufferedWriter
		FileWriter fileWriter = new FileWriter("output.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		try {
			
			// Write some text
			bufferedWriter.write("Hello, world");
			bufferedWriter.newLine(); // Write a new line
			bufferedWriter.write("Welcome To Ashok IT Hyderabad....");

			// Close the buffered writer
			bufferedWriter.close();

			System.out.println("Data written successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fileWriter != null) fileWriter.close();
			if(bufferedWriter != null) bufferedWriter.close();
		}
	}
}
