package com.xworkz.corejava.arrays.twoDimentionArray;

	public class TwoDimentionArrayDemo {
		
		public static void main(String[] args) {
			
			int [][] arr = new int [3][3];
			int num = 1;
			for(int i = 0; i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j] = num;
					num++;
				}
				
			}
			
			for(int i = 0; i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");//provide in the matrix method
				}
				System.out.println();
		    }

		}
	}


