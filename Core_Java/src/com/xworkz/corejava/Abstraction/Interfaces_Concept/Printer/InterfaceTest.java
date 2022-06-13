package com.xworkz.corejava.Abstraction.Interfaces_Concept.Printer;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer();
		Epson epson = new Epson();
		Sony sony = new Sony();
		computer.slot(epson);
		

	}

}
