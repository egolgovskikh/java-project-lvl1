package hexlet.code.games;

import hexlet.code.Generator;

import java.util.Scanner;

public class GCD implements Game {
    /**
     * A method fo start game "GCD".
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
            int number1 = Generator.generateNumber(minNumber, maxNumber);
            int number2 = Generator.generateNumber(minNumber, maxNumber);

            System.out.println("Question: " + number1 + " " + number2);
            int answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);
            int correctAnswer = findGCD(number1, number2);
            if (answer == correctAnswer) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                break;
            }
        }
        return correctAnswers;
    }

    private int findGCD(int num1, int num2) {
        int divider = Math.min(num1, num2);
        for (; divider >= 1; divider--) {
            if (num1 % divider == 0 && num2 % divider == 0) {
                break;
            }
        }
        return divider;
    }
}
