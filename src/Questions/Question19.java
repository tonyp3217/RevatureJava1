package Questions;

import java.util.ArrayList;


/*
Create an ArrayList and insert integers 1 through 10. Display the ArrayList. Add all the even
numbers up and display the result. Add all the odd numbers up and display the result. Remove
the prime numbers from the ArrayList and print out the remaining ArrayList.

 */
public class Question19 {
    // Defines what a prime number is
    private static boolean isPrime(int n){
        for(int i = 2;i<n;i++){
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public void ArrayTest(){

        ArrayList<Integer> myList = new ArrayList<Integer>();
        int evenSum = 0;
        int oddSum = 0;

        //Runs for 10x and fills arraylist 1 through 10
        for (int i = 1; i <= 10; i++) {
            myList.add(i);
        }

        // set Even/Odd bool
        boolean evenNum = true;
        boolean oddNum = true;


        //Even Sum
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                evenSum += myList.get(i);
            }
        }
        System.out.println("Sum of even numbers is: " + evenSum);

        //Odd Sum
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 1) {
                oddSum += myList.get(i);
            }
        }
        //Removes Prime Numbers from list
        System.out.println("Sum of odd numbers is: " + oddSum);
        for (int i = 0; i < myList.size(); i++) {
            if (isPrime(myList.get(i))) {
                myList.remove(i);
                i--;
            }
        }
        //prints out left over list of none prime numbers
        System.out.println("Removed the prime numbers, results are:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

    }
}

