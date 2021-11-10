package Questions;
/*
 * Write a substring method that accepts a string str and an integer idx and returns the substring 
 * contained between 0 and idx-1 inclusive. Do NOT use any of the existing substring methods in 
 * the String, StringBuilder, or StringBuffer APIs
 */

public class QuestionFive {
	//instantiate string called Substring with argument
	String Substring(String str, int idx) {
		String temp="";

		for (int i = 0; i < idx; ++i) {
			temp = temp+str.charAt(i);
		}
		return temp;
	}
	public void pSub(String[] arg){
		System.out.println(Substring("Java is challenging", 8));
	}

}
