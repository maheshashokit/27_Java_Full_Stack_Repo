package com.ashokit.iostreams;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args)throws IOException {
		
	   //creating the File Object
	   File f  = new File("src/mahesh");
	   //creating directory
	   boolean directoryStatus = f.mkdir();
	   System.out.println("Created Directory Status:::::"+ directoryStatus);
	   //verifying the file object is existed or not
	   System.out.println("File exists or not:::::" + f.exists());
	   //File objects contains directory or file
	   System.out.println("Is Directory or not ::::" + f.isDirectory());
	   
	   //creating the File using programmatic
	   File f1 = new File("src/NewFile.txt");
	   //creating File using method
	   boolean fileCreationStatus = f1.createNewFile();
	   System.out.println("File Creation Status :::::" + fileCreationStatus);
	   //verifying the file object is existed or not
	   System.out.println("File exists or not:::::" + f1.exists());
	   //File objects contains directory or file
	   System.out.println("Is File or not ::::" + f1.isFile());
	   
	   //creating the file under directory
	   File f2 = new File(f,"details.txt");
	   System.out.println("File Created Under Directory::::" + f2.createNewFile());
	   
	   //create Programs folder under that we need create 10 Java Files
	   //create Program folder under that each program should be in seperate folder
	    
	   File mainfolder = new File("programs");
	   if(!mainfolder.exists()) {
		  boolean mainFolderStatus = mainfolder.mkdir();
		  if(mainFolderStatus) {
			  for(int i = 1 ; i<=10 ; i++) {
				  //JavaProgram-1,JavaProgram-2,JavaProgram-3.....JavaProgram-10
				  File programFolder = new File(mainfolder,"JavaProgram-"+i);
				  if(programFolder.mkdir()) {
					  //JavaProgram-1(Java-1.java),JavaProgram-2(Java-2.java)
					  File javaFile = new File(programFolder,"Java-"+i+".java");
					  javaFile.createNewFile();
				  }
			  }
		  }		  
	   }
	   
	   //getting the paths of files
	   File[] listFiles = mainfolder.listFiles();
	   for(File currentObject  : listFiles) {
		   //Filtering only files
		   if(currentObject.isDirectory()) {
			   System.out.println("Path::::" + currentObject.getPath());
			   System.out.println("Absolute Path::::" + currentObject.getAbsolutePath());
		   }
	   }
	}
}
