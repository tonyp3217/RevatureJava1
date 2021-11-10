package Questions;
/*
 * Reverse a string without using a temporary variable. Do NOT use reverse() in the StringBuffer or 
 * the StringBuilder APIs.
 */


import java.util.Scanner;

public class QuestionThree
{
	public void reverseString() {	

		//take input line
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type a line String: ");
		int len;
		String str = scanner.nextLine();
		len = str.length();

		for(int i = 0;i<len;i++){
			//appending each character in reverse order to its end
			str += str.charAt(len - i - 1);
		}

		//Getting string that we have appended
		str = str.substring(len);
		System.out.println("Reversed string: " + str);
	}
}

