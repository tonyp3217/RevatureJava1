package Questions;
//Write a program to display the first 25 Fibonacci numbers beginning at 0
// could be done through loops or recursion

public class QuestionTwo {
	
	public static int Fib(int n){
		if((n == 0) || (n == 1))
			return n;
		else
			return Fib(n-1) + Fib(n-2);
		}
	    public static void main(String args[], int n) {
		int maxNumber = 25;
		System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
		for(int i = 0; i < maxNumber; i++){
				System.out.print(Fib(i) +" ");
			}
		}
}
