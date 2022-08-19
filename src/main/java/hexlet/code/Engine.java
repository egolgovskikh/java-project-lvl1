package hexlet.code;

import hexlet.code.games.*;

public class Engine {
    public static void initGame(String typeOfGame) {
        final int maxNumber = 100;
        final int minNumber = 1;
        final int maxQuestions = 3;

        switch (typeOfGame) {
            case ("1") -> Cli.greetPlayer();
            case ("2") -> {
                Even even = new Even();
                String name = Cli.greetPlayer();
                int correctAnswers = even.startGame(maxQuestions, minNumber, maxNumber);
                even.displayResult(name, correctAnswers, maxQuestions);
            }
            case ("3") -> {
                Calc calc = new Calc();
                String name = Cli.greetPlayer();
                int correctAnswers = calc.startGame(maxQuestions, minNumber, maxNumber);
                calc.displayResult(name, correctAnswers, maxQuestions);
            }
            case ("4") -> {
                GCD gsd = new GCD();
                String name = Cli.greetPlayer();
                int correctAnswers = gsd.startGame(maxQuestions, minNumber, maxNumber);
                gsd.displayResult(name, correctAnswers, maxQuestions);
            }
            case ("5") -> {
                Progression progression = new Progression();
                String name = Cli.greetPlayer();
                int correctAnswers = progression.startGame(maxQuestions, minNumber, maxNumber);
                progression.displayResult(name, correctAnswers, maxQuestions);
            }
            case ("6") -> {
                Prime prime = new Prime();
                String name = Cli.greetPlayer();
                int correctAnswers = prime.startGame(maxQuestions, minNumber, maxNumber);
                prime.displayResult(name, correctAnswers, maxQuestions);
            }
            case ("0") -> {
            }
            default -> throw new IllegalStateException("Unexpected value typeOfGame: " + typeOfGame);
        }
    }
}
