import services.QuestionService;

public class QuizApp {
    
    public static void main(String args[]) {
        QuestionService quiz = new QuestionService();
        quiz.playQuiz();
    }

}
