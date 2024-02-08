package Quizz;

import java.io.File;
import java.util.Scanner;

public class Quizz {

    Scanner playerInput = new Scanner(System.in);
    Scanner file;
    Question[] questions = new Question[5];


    public void readQuestions(){
        System.out.println("Enter the location of the question file");
        String location = playerInput.nextLine();
        file = new Scanner(location);

        for (int i = 0; i<5; i++){
            Question question = new Question();

            System.out.println("Enter your question");
            question.text = file.nextLine();

            createAnswers(question);

            System.out.println("Enter your correct answer number");
            question.correctAnswer = Integer.parseInt(file.nextLine());
            questions[i] = question;
        }
    }

    private void createAnswers(Question question){
        System.out.println("Enter four answers");
        for(int j = 0; j<4; j++){
            System.out.println("Enter your " + Integer.toString(j+1) + ". answer");
            question.answers[j] = file.nextLine();
        }
    }
}
