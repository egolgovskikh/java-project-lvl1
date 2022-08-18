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
}
