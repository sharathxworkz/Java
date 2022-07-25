package com.xworkz.corejava.collections.set.hashset.linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Cars lamborgini = new Cars();
		
			lamborgini.setModelNo(12567);
			lamborgini.setCompanyName("Lamborgini");
			lamborgini.setCarName("Mc-Larren Gallardo");
			lamborgini.setColor("Matt-Black");
			lamborgini.setPrice(32000000);
			
		Cars mastang = new Cars();
			
			mastang.setModelNo(756427);
			mastang.setCompanyName("Ford");
			mastang.setCarName("Mustang-GT");
			mastang.setColor("Glossy-Green");
			mastang.setPrice(25000000);
			
		Cars mitsubushi = new Cars();
			
			mastang.setModelNo(321547);
			mastang.setCompanyName("Mitsubushi");
			mastang.setCarName("Lancer");
			mastang.setColor("Matt-Black");
			mastang.setPrice(1500000);
			
			LinkedHashSet lhs = new LinkedHashSet();
			lhs.add(lamborgini);
			lhs.add(mastang);
			lhs.add(mitsubushi);
			lhs.add(null);
			System.out.println(lhs);
	}

}
