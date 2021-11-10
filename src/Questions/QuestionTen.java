package Questions;
/*
 * Find the minimum of two numbers using ternary operators.
 */
public class QuestionTen {
    public void MinMaxTernary() {
        /*
        General syntax for ternary is Number1 <comparison operator> Number2 ? <Return_this_if_true> : <Return_this_if_false>
         */
        int n1 = 67, n2 = 134;

        int maxOfTwo = n1 < n2 ? n1 : n2;
        System.out.println("Max of two is: " + maxOfTwo);

        int minOfTwo = n1 > n2 ?  n1 : n2;
        System.out.println("Min of min is: " + minOfTwo);

        //if we were to add 3 numbers it would be n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 >n3 ? n2 : n3)
    }
}