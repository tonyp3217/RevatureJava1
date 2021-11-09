package Questions;
/*
Create a notepad file called Data.txt and enter the following:
Mickey:Mouse:35:Arizona
Hulk:Hogan:50:Virginia
Roger:Rabbit:22:California
Wonder:Woman:18:Montana
Write a program that would read from the file and print it out to the screen in the following format:
Name: Mickey Mouse
Age: 35 years
State: Arizona State

 */
import java.io.BufferedReader;
import java.io.FileReader;


public class QuestionTwenty {

    FileReader fr = new FileReader("Data.txt");

    BufferedReader buffRead = new BufferedReader(fr);

    while (buffRead.ready()){

    System.out.println("Name: " +(char)buffRead.read());
    }


}
