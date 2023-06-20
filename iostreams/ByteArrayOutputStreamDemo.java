package com.ashokit.iostreams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) {

		String message = "Hi Welcome To Ashok IT Hyderabad";

		try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();) {

			// Write bytes to the byte array
			byteArrayOutputStream.write(72);
			byteArrayOutputStream.write(101);
			byteArrayOutputStream.write(108);
			byteArrayOutputStream.write(108);
			byteArrayOutputStream.write(111);

			// Get the resulting byte array
			byte[] byteArray = byteArrayOutputStream.toByteArray();

			// Process the byte array
			for (byte b : byteArray) {
				System.out.print((char) b);
			}
			System.out.println("\nData written to byte array successfully.");
		} // ending outer try-with-resource
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
