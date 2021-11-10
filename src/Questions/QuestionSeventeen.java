package Questions;
/*
 * Write a program that calculates the simple interest on the principal, rate of interest and
 * number of years provided by the user. Enter principal, rate and time through the console using
 * the Scanner class.
 * Interest = Principal* Rate* Time
 */
import java.util.Scanner;

public class QuestionSeventeen {
    private static Scanner sc;

    public void SimpleInterest()
    {
        double PAmount, ROI, TimePeriod, simpleInterest;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter the Principal Amount : ");
        PAmount = sc.nextDouble();

        System.out.print(" Please Enter the Rate Of Interest : ");
        ROI = sc.nextDouble();

        System.out.print(" Please Enter the Time Period in Years : ");
        TimePeriod = sc.nextDouble();

        simpleInterest = (PAmount * ROI * TimePeriod) / 100; //more accurate

        System.out.println("\n The Simple Interest for Principal Amount " + PAmount + " is = " + simpleInterest);
    }
}

