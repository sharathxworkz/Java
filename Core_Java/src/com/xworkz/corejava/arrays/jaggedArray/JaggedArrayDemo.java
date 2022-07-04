package com.xworkz.corejava.arrays.jaggedArray;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		
		//declaring a 2D array with odd columns
		
		int arr[][] = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[4];
		
		//initializing a jagged array
		
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			arr[i][j] = count++;	
			}
		}
		//int[][] jaggedarr = {{1,2},{3,4,5},{6,7,8}};
		
		//printing data of a jaggrd array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	}
}
