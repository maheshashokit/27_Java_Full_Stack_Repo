package com.ashokit.iostreams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		File f = new File("sureshit.txt");

		try (FileReader fr = new FileReader("sureshit.txt")) {
			
			char[] ch = new char[(int) f.length()];
			// Reading the data from File
			fr.read(ch);

			System.out.println("File Content Data");
			System.out.println(new String(ch));

		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}