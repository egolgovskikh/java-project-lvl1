package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class Engine {
    public static void initGame(String typeOfGame) {
        final int maxNumber = 100;
        final int minNumber = 1;
        final int maxQuestions = 3;
        final Engine engine = new Engine();

        switch (typeOfGame) {
            case ("1") -> Cli.greetPlayer();
            case ("2") -> {
                Even even = new Even();
                String name = Cli.greetPlayer();
                int correctAnswers = even.startGame(maxQuestions, minNumber, maxNumber);
                engine.displayResult(name, correctAnswers, maxQuestions);
            }
            case ("3") -> {
                Calc calc = new Calc();
                String name = Cli.greetPlayer();
                int correctAnswers = calc.startGame(maxQuestions, minNumber, maxNumber);
                engine.displayResult(name, correctAnswers, maxQuestions);
            }
            case ("4") -> {
                GCD gsd = new GCD();
                String name = Cli.greetPlayer();
                int correctAnswers = gsd.startGame(maxQuestions, minNumber, maxNumber);
                engine.displayResult(name, correctAnswers, maxQuestions);
            }
            case ("5") -> {
                Progression progression = new Progression();
                String name = Cli.greetPlayer();
                int correctAnswers = progression.startGame(maxQuestions, minNumber, maxNumber);
                engine.displayResult(name, correctAnswers, maxQuestions);
            }
            case ("6") -> {
                Prime prime = new Prime();
                String name = Cli.greetPlayer();
                int correctAnswers = prime.startGame(maxQuestions, minNumber, maxNumber);
                engine.displayResult(name, correctAnswers, maxQuestions);
            }
            case ("0") -> {
            }
            default -> throw new IllegalStateException("Unexpected value typeOfGame: " + typeOfGame);
        }
    }
    /**
     * A method for display result.
     *
     * @param name           - name of user
     * @param correctAnswers - number of correct answers
     * @param maxQuestions   - total number of questions
     */
    private void displayResult(String name, int correctAnswers, int maxQuestions) {
        if (correctAnswers == maxQuestions) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
