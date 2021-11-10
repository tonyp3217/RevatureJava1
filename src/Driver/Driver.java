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
		//q5.pSub(); passing argument wasn't working

		QuestionSix q6 = new QuestionSix();
		q6.evenOrOdd();

		QuestionSeven q7 = new QuestionSeven();
		//q7.

		QuestionEight q8 = new QuestionEight();
		q8.sortArrays();

		Question19 q19 = new Question19();
		q19.ArrayTest();

		QuestionTwenty q20 = new QuestionTwenty();
		q20.fileRead();



	}
}
