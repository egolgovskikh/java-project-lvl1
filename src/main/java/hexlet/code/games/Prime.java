package hexlet.code.games;

import hexlet.code.Generator;

import java.util.Scanner;

public class Prime implements Game {
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
        System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");
        int correctAnswers = 0;
        for (int numberOfQuestion = 1; numberOfQuestion <= maxQuestions; numberOfQuestion++) {
            int number = Generator.generateNumber(minNumber, maxNumber);
            System.out.println("Question: " + number);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            String correctAnswer = (isPrime(number)) ? "yes" : "no";
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

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int startDivider = number / 2; startDivider > 1; startDivider--) {
            if (number % startDivider == 0) {
                return false;
            }
        }
        return true;
    }
}
