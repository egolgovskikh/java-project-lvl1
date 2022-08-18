package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;

public class Engine {
    public static void initGame(String typeOfGame) {
        final int maxNumber = 10;
        final int minNumber = 1;
        final int maxQuestions = 3;

        switch (typeOfGame) {
            case ("1") -> Cli.greetPlayer();
            case ("2") -> {
                Even even = new Even();
                User user = Cli.greetPlayer();
                String name = user.getName();
                int correctAnswers = even.startGame(maxQuestions, minNumber, maxNumber);
                even.displayResult(name, correctAnswers, maxQuestions);
            }
            case ("3") -> {
                Calc calc = new Calc();
                User user = Cli.greetPlayer();
                String name = user.getName();
                int correctAnswers = calc.startGame(maxQuestions, minNumber, maxNumber);
                calc.displayResult(name, correctAnswers, maxQuestions);
            }
            case ("0") -> {}
            default -> throw new IllegalStateException("Unexpected value typeOfGame: " + typeOfGame);
        }
    }
}
