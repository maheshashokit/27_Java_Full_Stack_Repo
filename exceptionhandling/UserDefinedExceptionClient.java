package com.ashokit.exceptionhandling;

import java.util.Scanner;

public class UserDefinedExceptionClient {
	
	private static User user = new User();
	
	public static void main(String[] args) {
		String userId=null;
		try(Scanner sc = new Scanner(System.in);){			
			System.out.println("Enter userID To Search");
			userId = sc.next();			
			
			//Getting the All the users information
			User[] allUsers = user.getAllUsersInfo();			
			boolean userFlag = false;
			for(User user : allUsers) {				
				if(userId.equals(user.getUserId())) {
					userFlag = true;
					System.out.println("User Details ::::" + user);//toString()				}
			}
			
			if(userFlag) {
			   System.out.println("UserDetails Found in Database");
			}else {
				throw new UserNotFoundException("%s Not Present In Database",userId);
				//throw new UserNotFoundException("UserId Is not Present in Database....");
			}
		  }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
