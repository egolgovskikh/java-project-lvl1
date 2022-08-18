package hexlet.code.games;

import hexlet.code.Generator;

import java.util.Scanner;

public class Calc implements Game {

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

            int correctAnswer;
            switch (operation) {
                case '+' -> correctAnswer = number1 + number2;
                case '-' -> correctAnswer = number1 - number2;
                case '*' -> correctAnswer = number1 * number2;
                default -> throw new IllegalStateException("Unexpected value operation: " + operation);
            }

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

    public void displayResult(String name, int correctAnswers, int maxQuestions) {
        if (correctAnswers == maxQuestions) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Let's try again, " + name + "!");
        }
    }
}

