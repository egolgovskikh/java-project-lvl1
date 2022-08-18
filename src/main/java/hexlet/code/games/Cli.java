package hexlet.code.games;

import java.util.Scanner;

public class Cli {
    public static String greetPlayer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!\nMay I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        return name;
    }
}
