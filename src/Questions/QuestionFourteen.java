package Questions;
/*
 * Write a program that demonstrates the switch case. Implement the following functionalities in the 
 * cases:java
 * Case 1: Find the square root of a number using the Math class method.
 * Case 2: Display today’s date.
 * Case 3: Split the following string and store it in a string array.
 * “I am learning Core Java”
 * 
 */


import java.time.LocalDateTime;

public class QuestionFourteen {

	public void SwitchCase() {
		int pickme = 0;
		
		
		
	switch (pickme) {
	case 1:
		System.out.println();
		break;
	case 2:
		System.out.println(LocalDateTime.now());
		break;
	case 3: String myStr = "I am learning Core Java";
		String[] spString = myStr.split("");
		printArray(spString);
	}
	}
    static void printArray(String myArray[])
    {
        //get array length
        int n = myArray.length;
        //iterate through array and print it out
        for (int i=0; i<n; ++i) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
	
}
