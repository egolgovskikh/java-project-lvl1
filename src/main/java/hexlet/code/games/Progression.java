package hexlet.code.games;

import hexlet.code.Generator;

import java.util.Arrays;
import java.util.Scanner;

public class Progression implements Game {
    /**
     * A method fo start game "Progression".
     *
     * @param maxQuestions - total number of questions
     * @param minNumber    - min number in game
     * @param maxNumber    - max number in game
     * @return - number of correct answers
     */
    public int startGame(int maxQuestions, int minNumber, int maxNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        int correctAnswers = 0;
        for (int numberOfQuestion = 1; numberOfQuestion <= maxQuestions; numberOfQuestion++) {
            String[] numbers = Generator.generateProgression(minNumber, maxNumber);
            String correctAnswer = Generator.generateMissing(numbers);
            System.out.println("Question: " + Arrays.toString(numbers));
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                break;
            }
        }
        return correctAnswers;
    }

    /**
     * A method for display result.
     *
     * @param name           - name of user
     * @param correctAnswers - number of correct answers
     * @param maxQuestions   - total number of questions
     */
    public void displayResult(String name, int correctAnswers, int maxQuestions) {
        if (correctAnswers == maxQuestions) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
