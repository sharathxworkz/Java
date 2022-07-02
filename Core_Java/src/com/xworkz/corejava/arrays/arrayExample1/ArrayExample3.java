package com.xworkz.corejava.arrays.arrayExample1;

public class ArrayExample3 {

	public static void main(String[] args) {
		char [] alphabet = new char[26];
		char arr = 'A';
		for(char i=0; i<alphabet.length;i++) {
		alphabet[i] = arr;
		arr++;
		System.out.print(alphabet[i]+" ");		
			
			
		}
		

	}

}
