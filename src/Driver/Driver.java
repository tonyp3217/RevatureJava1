package Driver;


import Questions.*;




public class Driver {

	public static void main(String a[]){

		QuestionOne q1 = new QuestionOne();
		System.out.println("Question 1 \n");
		q1.BubbleSort();

		System.out.println("Question 2 \n");
		QuestionTwo.Fib(25);

		QuestionThree q3 = new QuestionThree();
		System.out.println("Question 3 \n");
		q3.reverseString();

		QuestionFour q4 = new QuestionFour();
		System.out.println("Question 4 \n");
		q4.factor();

		QuestionFive q5 = new QuestionFive();
		//passing argument isn't working

		QuestionSix q6 = new QuestionSix();
		System.out.println("Question 6 \n");
		q6.evenOrOdd();

		//7 needs more work
		QuestionSeven q7 = new QuestionSeven();
		System.out.println("Question 7 \n");
		//q7.EmpComparative(); not sorting correctly

		QuestionEight q8 = new QuestionEight();
		System.out.println("Question 8 \n");
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

		QuestionThirteen q13 = new QuestionThirteen();
		System.out.println("Question 13 \n");
		q13.triangle();

		QuestionFourteen q14 = new QuestionFourteen();
		System.out.println("Question 14 \n");
		q14.SwitchCase(1);
		q14.SwitchCase(2);
		q14.SwitchCase(3);

		QuestionFifthteen q15 = new QuestionFifthteen();
		System.out.println("Question 15 \n");

		QuestionSixteen q16 = new QuestionSixteen();
		System.out.println("Question 16 \n");
		q16.QuestionSixteen(new String[]{"The challenging world of Java"});

		QuestionSeventeen q17 = new QuestionSeventeen();
		System.out.println("Question 17 \n");
		q17.SimpleInterest();

		QuestionEighteen q18 = new QuestionEighteen();
		System.out.println("Question 18 \n");
		System.out.println(q18.hasUppercaseLetter("Anthony"));
		System.out.println(q18.hasUppercaseLetter("giraffe"));
		System.out.println(q18.hasUppercaseLetter("Java hashmaps are confusing"));
		System.out.println(q18.hasUppercaseLetter("THIS HAS BEEN MORE CHALLENGING THAN WORKING IN COBOL"));

		System.out.println(q18.toUpperCase("someday soon i will have my csa"));

		System.out.println(q18.stringToInt("downtown"));

		Question19 q19 = new Question19();
		System.out.println("Question 19 \n");
		q19.ArrayTest();

		QuestionTwenty q20 = new QuestionTwenty();
		System.out.println("Question 20 \n");
		q20.fileRead();



	}
}
