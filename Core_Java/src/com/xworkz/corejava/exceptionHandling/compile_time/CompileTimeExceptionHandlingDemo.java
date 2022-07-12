package com.xworkz.corejava.exceptionHandling.compile_time;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeExceptionHandlingDemo {

	public static void main(String[] args) {
		int i;
		try {
			FileReader fd = new FileReader("D:\\Hello.txt");
			BufferedReader br = new BufferedReader(fd);
			for(i=0; i<=4;i++){
				System.out.println(br.readLine());
			}
			
		} 
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception cought");
		}
		
		
	}
}
