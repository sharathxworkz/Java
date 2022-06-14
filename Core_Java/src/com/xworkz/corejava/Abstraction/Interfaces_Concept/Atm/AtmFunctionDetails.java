package com.xworkz.corejava.Abstraction.Interfaces_Concept.Atm;

public class AtmFunctionDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmMachine atmMachine = new AtmMachine();
		atmMachine.depositAmount();
		System.out.println(" ");
		atmMachine.generatePin();
		System.out.println(" ");
		atmMachine.checkBalance();
		System.out.println(" ");
		atmMachine.amountWithdrawal();
	}

}
