package hexlet.code.games;

import hexlet.code.User;

import java.util.Scanner;

public class Cli {
    public static User greetPlayer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!\nMay I have your name? ");
        User user = new User(scanner.nextLine());
        System.out.println("Hello, " + user.getName() + "!");

        return user;
    }
}
