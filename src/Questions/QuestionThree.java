package Questions;
/*
 * Reverse a string without using a temporary variable. Do NOT use reverse() in the StringBuffer or 
 * the StringBuilder APIs.
 */
import java.util.Scanner;

public class QuestionThree 
{
	public void reverseString() {	
		  Scanner input = new Scanner(System.in);
		  String myStr = "";
		  int length = 0;
		  int index; 
		  char[] input = ;

		  // Iterate in place, from both sides at one time
		  int fromFront = 0;
		  int fromEnd = input.length - 1;

		  while (fromFront < fromEnd) {
	    	  // Swap elements
	    		char temp = input[fromEnd];
	    		input[fromEnd] = input[fromFront];
	    		input[fromFront] = temp;

	    	fromFront++;
	    	fromEnd--;
	}


	    //convert back to string
	    String newString = new String(stringChars2);

	    //output result
	    System.out.println(newString);


	 }
	}

}
