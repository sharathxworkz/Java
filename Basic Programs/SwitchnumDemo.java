import java.util.Scanner;
class SwitchnumDemo
{
	public static void main(String args[])
	{
	   
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = scn.nextInt(); 

		switch (num) {

		  case 0: System.out.println("Entered Number is Zero");
			    break;
		  case 1: System.out.println("Entered Number is One");
			    break;	
	          case 2: System.out.println("Entered Number is Two");
			    break;
		  case 3: System.out.println("Entered Number is Three");
			    break;
		  case 4: System.out.println("Entered Number is Four");
			    break;
		  case 5: System.out.println("Entered Number is Five");
			    break;
		  default: System.out.println("Invalid Number");
			  break; 
		} 
	}
}	
