package com.xworkz.corejava.arrays.arrayExample1;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		int [] arr = new int[4];
		int k=1;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = k;
			k++;
		}	
			
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
