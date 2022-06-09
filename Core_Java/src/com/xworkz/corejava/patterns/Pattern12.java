package com.xworkz.corejava.patterns;

public class Pattern12 {
       
	   public static void main(String[] args)     
	   {    
	      int i,j,k;
	      k=0;
	      
	      for(i=0;i<4;i++) 
	      {	
	    	  for(j=1;j<4;j++)
	    	  {	   
	    			System.out.print(j+k+i);
	    			k++;
	    		  }
	    	  System.out.println(" ");
	    	  }
	      }
	      
	   } 
//1
//2 3
//4 5 6
//7 8 9 10