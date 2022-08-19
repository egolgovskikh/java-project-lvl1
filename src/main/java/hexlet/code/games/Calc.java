package hexlet.code.games;

import hexlet.code.Generator;

import java.util.Scanner;

public class Calc implements Game {
    /**
     * A method fo start game "Calc".
     *
     * @param maxQuestions - total number of questions
     * @param minNumber    - min number in game
     * @param maxNumber    - max number in game
     * @return - number of correct answers
     */
    public int startGame(int maxQuestions, int minNumber, int maxNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        int correctAnswers = 0;
        for (int numberOfQuestion = 1; numberOfQuestion <= maxQuestions; numberOfQuestion++) {
            int number1 = Generator.generateNumber(minNumber, maxNumber);
            int number2 = Generator.generateNumber(minNumber, maxNumber);
            char operation = Generator.generateOperation();
            System.out.println("Question: " + number1 + " " + operation + " " + number2);

            int answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);

            int correctAnswer = calculateCorrectAnswer(operation, number1, number2);

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

    /**
     * A method for calculating an answer from parameters.
     *
     * @param operation - type of operations
     * @param number1   - first number
     * @param number2   - second number
     * @return - calculated result
     */
    public int calculateCorrectAnswer(char operation, int number1, int number2) {
        switch (operation) {
            case '+' -> {
                return number1 + number2;
            }
            case '-' -> {
                return number1 - number2;
            }
            case '*' -> {
                return number1 * number2;
            }
            default -> throw new IllegalStateException("Unexpected value operation: " + operation);
        }
    }
}

