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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class QuestionTwenty {
    public void fileRead(){

        BufferedReader reader;

        try{
            reader = new BufferedReader(new FileReader("src/Questions/Data.txt"));
        String line = reader.readLine();

        // **bug runs through all data doesn't stop at 1
        while(line != null) {
            String[] data = line.split(":");
            System.out.println("Name: " + data[0] + " " + data[1]);
            System.out.println("Age: " + data[2] + " years");
            System.out.println("State: " + data[3] + "State");
            System.out.println("\n");
            line = reader.readLine();
        }
        reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}