package Questions;
/*
 * Write a program to compute N factorial.
 */
import java.util.Scanner; 

public class QuestionFour {
	static int factorial(int n){
		if (n == 0)
			return 1;
		else
			return(n * factorial(n-1));
	}
	public void factor(){
		int i,fact=1;
		int number=4;//It is the number to calculate factorial
		fact = factorial(number);
		System.out.println("\nFactorial of "+number+" is: "+fact);
	}
}

