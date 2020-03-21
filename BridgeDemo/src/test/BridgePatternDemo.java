package test;

/***
 * 
 * decouple the functional abstraction from the implementation so that the two can vary independently
 *
 */
public class BridgePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QuestionFormat questions = new QuestionFormat("Java programming questions");
		  questions.q = new JavaQuestions(); 
		  
		  questions.delete("What is class?"); 
		  
		  questions.newOne("What is inheritance?");  
	      
		    questions.newOne("How many types of inheritance are there in java?");  
	        questions.display();  
		  questions.displayAll();
	}

}
