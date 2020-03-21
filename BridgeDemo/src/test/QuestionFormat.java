package test;

public class QuestionFormat extends QuestionManager {

	public QuestionFormat(String catalog) {
		super(catalog);
		// TODO Auto-generated constructor stub
	}
	
	public void displayAll() {  
        System.out.println("\n---------------------------------------------------------");  
        super.displayAll();  
        System.out.println("-----------------------------------------------------------");  
    }  

}
