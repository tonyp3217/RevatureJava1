package Questions;
/*
 * Write a program to store numbers from 1 to 100 in an array. Print out all the even numbers 
 * from the array. Use the enhanced FOR loop for printing out the numbers.
 */
public class QuestionTwelve {
    public void EvenArray(){
        //instantiate array
        int arr[] = new int[100];
        //fill array inserting 1 to 100
        for(int i=1; i<=100; i++)
        {
            arr[i-1] = i;
        }
        // enhanced for loop
        for (int num: arr) {
            System.out.print(num+" ");
        }
    }
}
