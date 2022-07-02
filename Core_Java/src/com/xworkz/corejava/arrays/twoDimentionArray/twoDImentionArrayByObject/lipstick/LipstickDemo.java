package com.xworkz.corejava.arrays.twoDimentionArray.twoDImentionArrayByObject.lipstick;

public class LipstickDemo {

	public static void main(String[] args) {
		
		Lipstick lakme = new Lipstick("Lakme","Black",10.00f);
		Lipstick mac = new Lipstick("Mac","Pink",5.00f);
		Lipstick myglamm = new Lipstick("Myglamm","green",1.00f);
		Lipstick sugar = new Lipstick("Sugar","Yellow",3.00f);
		Lipstick maybeLine = new Lipstick("MaybeLine","red",350.00f);
		
		Lipstick [] lipsticks = {lakme,mac,myglamm,sugar,maybeLine};
		
		for(int i=0; i<lipsticks.length;i++){ //we can also condition to get selected data
			if(lipsticks[i].price < 10.0f) {
			System.out.println(lipsticks[i]);
			}
		}
	}
}
