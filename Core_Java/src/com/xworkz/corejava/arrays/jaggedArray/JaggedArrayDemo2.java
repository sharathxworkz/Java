package com.xworkz.corejava.arrays.jaggedArray;

public class JaggedArrayDemo2 {
	
	public static void main(String[] args) {
		
		int k=1;
		int jaggedarr[][] = {{1,2},{3,4,5},{6,7,8,9}};
		
		for(int i=0;i<jaggedarr.length;i++) {
			for(int j=0;j<jaggedarr[i].length;j++) {
				jaggedarr[i][j] = k;
				k++;
			}
			
		}
			for(int i=0;i<jaggedarr.length;i++) {
				for(int j=0;j<jaggedarr[i].length;j++) {
					System.out.print(jaggedarr[i][j]+" ");
				}
				System.out.println();
			}
			
		}
	}

