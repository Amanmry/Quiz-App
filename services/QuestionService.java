package services;

import java.util.Scanner;
import entities.Question;

public class QuestionService {

    private int score = 0;
    private Question[] questions = new Question[5];
    private final Scanner sc = new Scanner(System.in);

    public QuestionService() {
        System.out.println("Welcome to The Quiz Application...");
        questions[0] = new Question(1, "Capital of Odisha ?", "Bhubaneshwar", "Cuttack", "Kolkata", "Shillong", "Bhubaneshwar");
        questions[1] = new Question(2, "Capital of Haryana ?", "Chandigarh", "Panchkula", "Ambala", "Hisar", "Chandigarh");
        questions[2] = new Question(3, "Capital of Mizoram ?", "Agartala", "Shillong", "Aizawl", "Kohima", "Aizawl");
        questions[3] = new Question(4, "Capital of Meghalaya ?", "Durgapur", "Imphal", "Shallang", "Shillong", "Shillong");
        questions[4] = new Question(5, "Capital of West Bengal ?", "Calicut", "Durgapur", "Kharagpur", "Kolkata", "Kolkata");
    }

    private void printQuestion(Question q) {
        System.out.println("Q" + q.getQid() + ") " + q.getQuestion());
    }

    private void printOptions(Question q) {
        System.out.println("Option 1 : " +  q.getOption1());
        System.out.println("Option 2 : " +  q.getOption2());
        System.out.println("Option 3 : " +  q.getOption3());
        System.out.println("Option 4 : " +  q.getOption4());
    }

    private void printScore() {
        System.out.println("Your Score is : " + score);
        System.out.println("Quiz Completed...");
    }

    private void endQuiz() {
        sc.close();
    }

    private String chooseOption() {
        System.out.println("Please select one of the above options : ");
        String optionSelected = sc.nextLine();
        return optionSelected;
    }

    public void playQuiz() {
        for(var Question : questions) {
            printQuestion(Question);
            printOptions(Question);
            String optionSelected = chooseOption();
            if(optionSelected.equals(Question.getAnswer())) {
                ++score;
            }
        }
        printScore();
        endQuiz();
    }

}
