package hexlet.code;

public class Generator {
    public static int generateNumber(int min, int max) {
        final int range = max - min + 1;
        return min + (int) (Math.random() * range);
    }

    public static char generateOperation() {
        final int max = 3;
        final int min = 1;
        final int range = max - min + 1;

        int operationNum = min + (int) (Math.random() * range);
        
        char operation;

        switch (operationNum) {
            case 1 -> operation = '+';
            case 2 -> operation = '-';
            case 3 -> operation = '*';
            default -> throw new IllegalStateException("Unexpected value: " + operationNum);
        }

        return operation;
    }
}
