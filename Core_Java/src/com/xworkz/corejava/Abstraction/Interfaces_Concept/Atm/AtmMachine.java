package com.xworkz.corejava.Abstraction.Interfaces_Concept.Atm;

public class AtmMachine implements HdfcBank,CanaraBank {

	@Override
	public void depositAmount() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount that to be Deposited..!!");
		System.out.println("Please Make Sure that the Notes are not folded or Damaged...!!!");
	}
	

	@Override
	public void amountWithdrawal() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Amount in Multiples of 500 !!!");
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Pin !!!!");
	}

	@Override
	public void generatePin() {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Phone Number Linked To Bank....!!!");
		
	}
	
	
}
