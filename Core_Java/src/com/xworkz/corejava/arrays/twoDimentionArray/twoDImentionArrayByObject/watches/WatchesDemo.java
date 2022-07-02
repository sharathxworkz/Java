package com.xworkz.corejava.arrays.twoDimentionArray.twoDImentionArrayByObject.watches;

public class WatchesDemo {

	public static void main(String[] args) {
		
		Watches titan = new Watches("Titan","Analog","Chain",90,2000.00);
		Watches fastrack = new Watches("Fastrack","Digital","Chain",97,3500.100);
		Watches rado = new Watches("Rado","Analog","Chain",100,90000.00);
		Watches timex = new Watches("Times","Analog","Belt",97,4000.00);
		Watches sonata = new Watches("Sonata","Digital","Belt",87,4000.00);
		
		Watches [] watch = {titan,fastrack,rado,timex,sonata};
		for(int i = 0; i<watch.length;i++) {
			if(watch[i].type == "Digital") {
				if(watch[i].material == "Chain") {
			System.out.println(watch[i]);
				}
			}
		}
	}
}
