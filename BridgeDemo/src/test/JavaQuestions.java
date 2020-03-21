package test;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestions implements Question {

	private List<String> questions = new ArrayList<String>();
	private int current = 0;

	public JavaQuestions() {
		questions.add("What is class?");
		questions.add("What is interface?");
		questions.add("What is abstraction? ");
		questions.add("How multiple polymorphism is achieved in java?");
		questions
				.add("How many types of exception  handling are there in java?");
		questions
				.add("Define the keyword final for  variable, method, and class in java?");
		questions.add("What is abstract class?");
		questions.add("What is multi-threading?");
	}

	@Override
	public void nextQuestion() {
		// TODO Auto-generated method stub
		if (current <= questions.size() - 1) {
			current++;
			System.out.println(current);
		}
	}

	@Override
	public void previousQuestion() {
		// TODO Auto-generated method stub
		if (current > 0) {
			current--;
			System.out.println(current);
		}
	}

	@Override
	public void newQuestion(String q) {
		// TODO Auto-generated method stub
		questions.add(q);
	}

	@Override
	public void deleteQuestion(String q) {
		// TODO Auto-generated method stub
		questions.remove(q);
	}

	@Override
	public void displayQuestion() {
		// TODO Auto-generated method stub
		System.out.println(questions.get(current));
	}

	@Override
	public void displayAllQuestions() {
		// TODO Auto-generated method stub
		for (String ques : questions) {
			System.out.println(ques);
		}
	}

}
