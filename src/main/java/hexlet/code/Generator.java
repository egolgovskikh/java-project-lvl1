package hexlet.code;

import java.util.Random;

public class Generator {
    public static int generateNumber(int min, int max) {
        final int range = max - min + 1;
        return min + (int) (Math.random() * range);
    }

    public static char generateOperation() {
        char[] typesOperations = new char[]{'+', '-', '*'};
        int random = new Random().nextInt(typesOperations.length);
        return typesOperations[random];
    }

    public static String[] generateProgression(int minNumber, int maxNumber, int countOfNumbers) {
        final int maxStep = 10;
        final int minNStep = 1;
        final int rangeOfStep = maxStep - minNStep + 1;
        int step = minNStep + (int) (Math.random() * rangeOfStep);

        final int rangeOfNumbers = maxNumber - minNumber + 1;
        String[] numbers = new String[countOfNumbers];
        numbers[0] = Integer.toString(minNumber + (int) (Math.random() * rangeOfNumbers));

        for (int i = 1; i < countOfNumbers; i++) {
            numbers[i] = Integer.toString(Integer.parseInt(numbers[i - 1]) + step);
        }
        return numbers;
    }

    public static String[] generateProgression(int min, int max) {
        final int recommendedCount = 10;
        return generateProgression(min, max, recommendedCount);
    }

    public static String generateMissing(String[] numbers) {
        int min = 0;
        int max = numbers.length - 1;
        final int range = max - min + 1;
        int missingNumberIndex = min + (int) (Math.random() * range);
        String valueOfMissingNumber = numbers[missingNumberIndex];
        numbers[missingNumberIndex] = "..";
        return valueOfMissingNumber;
    }
}
