package Quizz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quizz {

    Scanner playerInput = new Scanner(System.in);
    File file;
    Scanner readFile;
    Question[] questions = new Question[5];


    public void readQuestions() throws FileNotFoundException {
        boolean success = false;
        while (!success)
        {
            try {
                System.out.println("Enter the location of the question file");
                String location = playerInput.nextLine();
                file = new File(location);
                readFile = new Scanner(file);
                success = true;
            } catch (FileNotFoundException readFile) {
                System.out.println("Location not found");
            }
        }

        for (int i = 0; i<5; i++){
            Question question = new Question();

            question.text = readFile.nextLine();

            createAnswers(question);

            question.correctAnswer = Integer.parseInt(readFile.nextLine());
            questions[i] = question;
        }
    }

    private void createAnswers(Question question){
        for(int j = 0; j<4; j++){
            question.answers[j] = readFile.nextLine();
        }
    }
}