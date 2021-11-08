package Questions;
/*
 * Write a program to determine if an integer is even without using the modulus operator (%)
 *
 */
import java.util.Scanner;

public class QuestionSix {
	
	    public void evenOrOdd() 
	    {
	        int number = 0;
	        
	        // suppressing resource warning until closed. 
	        @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a number to check whether it is \"even\" or \"odd\"");
	        //Read the value entered in the command prompt
	        number = scanner.nextInt();
	        
	        if((number / 2)==0)
	        {
	            System.out.println("The Given Number \""+number+"\" is Even");
	        }
	        else
	        {
	            System.out.println("The Given Number \""+number+"\" is Odd");

	        }
	    }
}
