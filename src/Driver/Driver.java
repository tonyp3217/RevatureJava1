package Driver;


import Questions.*;

import java.io.IOException;


public class Driver {

	public static void main(String a[]){

		QuestionOne q1 = new QuestionOne();
		q1.BubbleSort();

		QuestionTwo.Fib(25);

		QuestionFour q4 = new QuestionFour();
		q4.factor();

		QuestionFive q5 = new QuestionFive();
		//passing argument isn't working

		QuestionSix q6 = new QuestionSix();
		q6.evenOrOdd();

		//7 needs more work
		QuestionSeven q7 = new QuestionSeven();
		q7.EmpComparative();

		QuestionEight q8 = new QuestionEight();
		q8.sortArrays();

		QuestionNine q9 = new QuestionNine();
		q9.primeArray();

		QuestionTen q10 = new QuestionTen();
		q10.MinMaxTernary();

		QuestionEleven q11 = new QuestionEleven();
		System.out.println("Float Variable 1: "+q11.a);
		System.out.println("Float Variable 2: "+q11.b);

		QuestionTwelve q12 = new QuestionTwelve();
		q12.EvenArray();

		QuestionFourteen q14 = new QuestionFourteen();
		q14.SwitchCase();

		Question19 q19 = new Question19();
		q19.ArrayTest();

		QuestionTwenty q20 = new QuestionTwenty();
		q20.fileRead();



	}
}
