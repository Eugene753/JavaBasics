package com.class13;

public class Account {

	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void login(String passedUserNameWhenLogging,String passedUserNameWhenPassword) {
		if(userName.equals("passedUserNameWhenLogging")&&password.equals("passedUserNameWhenPassword")) {
			System.out.println("Welcome to banl of America your balance is "+balance);
		}
	}
	
	public void printInfo() {
		if(isLoggedIn) {
			System.out.println("your Account number is "+accountNumber+" Your balance is "+balance);
		}
	}
	
	public void printUsernameAndPassword(String passedUserNameWhenLogging,String passedUserNameWhenPassword ) {
		System.out.println(passedUserNameWhenLogging+passedUserNameWhenPassword);
	}
}
