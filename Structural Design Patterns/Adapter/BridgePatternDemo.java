package adapter;

import bridge.JavaQuestions;
import bridge.QuestionFormat;

public class BridgePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    QuestionFormat questions = new QuestionFormat("Java Programming Language");  
	    questions.q  = new JavaQuestions();  
	    questions.delete("what is class?");  
	    questions.display();  
	    questions.newOne("What is inheritance? ");  
	      
	    questions.newOne("How many types of inheritance are there in java?");  
	    questions.displayAll();  
	}

}
