package com.rays.oop;

public class TestAccount {
	public static void main(String[] args) {
		
	 
	Account a = new Account();
	
	a.setName("Icici");
	a.setAccounttype("Saving");
	a.setBalance(100000);
	System.out.println("Acc"
			+ ""
			+ "ount name is "+a.getName());
	System.out.println("Account type is  "+a.getAccounttype());
	System.out.println("Account balance is "
			+ ""+a.getBalance());
}
		
	
}
