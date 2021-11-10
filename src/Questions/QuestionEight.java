package Questions;
/*
 * Write a program that stores the following strings in an ArrayList and saves all the palindromes 
 * in another ArrayList.
 * “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”, “refer”, “billy”, “did”
 */
import java.util.ArrayList;

public class QuestionEight {
	 public void sortArrays() {
		 {
            //Array instantiation and filled with word list
			 ArrayList<String> words = new ArrayList<String>();
             words.add("karan");
			 words.add("madam");
			 words.add("tom");
			 words.add("civic");
			 words.add("radar");
			 words.add("jimmy");
			 words.add("john");
			 words.add("kayak");
			 words.add("refer");
			 words.add("billy");
			 words.add("did");

            //instantiate an array for palindromes
             ArrayList p_ar = new ArrayList();

             // loop each element in words
             for (int i = 0; i < words.size(); i++) {
                 if (isPalindrome((String) words.get(i))) { // if palindrome
                     p_ar.add((String) words.get(i)); // add the string to p_arr list
                 }
             }
             System.out.println("The Palindrome strings are : " + p_ar);
         }
     }
    private boolean isPalindrome(String str){
        String reverse = "";
        // reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        // check string matches to give string
        return str.equals(reverse);
    }
}


