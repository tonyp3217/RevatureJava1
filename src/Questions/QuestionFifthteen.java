package Questions;
/*
 * Write a program that defines an interface having the following methods: addition, 
 * subtraction, multiplication, and division. Create a class that implements this interface and provides 
 * appropriate functionality to carry out the required operations. Hard code two operands in a test 
 * class having a main method that calls the implementing class.
 */


public class QuestionFifthteen {
    public void Interfaces() {

        Q15_interface q15 = new Q15_implem();

        Result(q15);
    }

    public void Result(Q15_interface q15) {
        System.out.println(q15.addition(5, 10));
    }
}
