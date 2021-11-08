package Questions;
/*
 * Write a program to compute N factorial.
 */
import java.util.Scanner; 

public class QuestionFour {
	 public void factor() {
		int i = 1;
		int fact = 1;
		
		Scanner n = new Scanner(System.in);

		System.out.println("Enter any number:");
		int result = Integer.parseInt(n);
		for(i=1;i<=result;i++){    
	      	fact=fact*i;    
	  }	    
	  System.out.println("Factorial of "+n+" is: "+fact);    
	 }  
	
}

