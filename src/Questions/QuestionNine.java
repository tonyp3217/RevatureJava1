package Questions;
/*
 * Create an ArrayList which stores numbers from 1 to 100 and prints out all the prime numbers 
 * to the console. 
 */

import java.util.ArrayList;

public class QuestionNine {
    public void primeArray() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // fill array, but can use int[] a = IntStream.range(1, 100).toArray(); just need to import library
        for (int i = 1; i <= 100; i++) {
            arr.add(i);
        }
        //calls and checks if numbers in array are prime and prints them out
        for (int i = 2; i < arr.size(); i++)
        {
            if (checkPrime(i))
            {
                System.out.print(i+"  ");
            }
        }
    }

    //boolean check if number is prime
    public static boolean checkPrime(int n)
    {
        if (n <= 1)
            return false;
        int i = 2;
        while (i <= n / 2)
        {
            if ((n % i) == 0)
                return false;
            i++;
        }
        return true;
    }
}

