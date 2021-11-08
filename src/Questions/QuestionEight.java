package Questions;
/*
 * Write a program that stores the following strings in an ArrayList and saves all the palindromes 
 * in another ArrayList.
 * “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”, “refer”, “billy”, “did”
 */
import java.util.*;

public class QuestionEight {
	 public void sortPalindrome() { 
	      {
	        
	    	ArrayList< String > words = new ArrayList< String >();
	        Scanner scan = new Scanner(System.in); 
	        
	        while(scan.hasNext())     
	           words.add(scan.next());
	        System.out.println("Is it a palindrome? " + isPalindrome(words));
	      }
	      static boolean isPalindrome(ArrayList< String > w)
	      {
	       int front  = 0, back = w.size() - 1;
	       while( front < back)
	         if (!w.get(front++).equals(w.get(back--)))
	            return false;
	        return true;
	   }
	}


