package com.ashokit.iostreams;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializedDemo {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("src/employee.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);){
			
			Object obj=null;
			while((obj = ois.readObject())!= null) {
				Employee emp = (Employee) obj;
				System.out.println(emp);
			}
		    
		}catch(EOFException eof) {
			//doesn't handling the Exception
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
