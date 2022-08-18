package hexlet.code.games;

public interface Game {
    int startGame(int maxQuestions, int minNumber, int maxNumber);

    void displayResult(String name, int correctAnswers, int maxQuestions);
}
