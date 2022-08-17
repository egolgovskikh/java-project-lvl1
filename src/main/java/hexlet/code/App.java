package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        System.out.println("Your choice: " + choice + "\n");
        switch (choice) {
            case ("1") -> {
                Cli.greetPlayer();
            }
            case ("2") -> {
                Even.parityCheck();
            }
            default -> {
            }
        }
    }
}
