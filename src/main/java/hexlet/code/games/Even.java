package hexlet.code.games;

import hexlet.code.Generator;

import java.util.Scanner;

public class Even implements Game {

    /**
     * A method fo start game "Even".
     *
     * @param maxQuestions - total number of questions
     * @param minNumber    - min number in game
     * @param maxNumber    - max number in game
     * @return - number of correct answers
     */
    public int startGame(int maxQuestions, int minNumber, int maxNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int correctAnswers = 0;
        for (int numberOfQuestion = 1; numberOfQuestion <= maxQuestions; numberOfQuestion++) {
            int number = Generator.generateNumber(minNumber, maxNumber);
            System.out.println("Question: " + number);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
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
