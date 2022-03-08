package bridge;
/**
 * Create a Question interface that provides the navigation from one question to another or vice-versa.
 * 
 * @author bhimsingh
 *
 */
public interface Question {
    public void nextQuestion();  
    public void previousQuestion();  
    public void newQuestion(String q);  
    public void deleteQuestion(String q);  
    public void displayQuestion();  
    public void displayAllQuestions();  
}
