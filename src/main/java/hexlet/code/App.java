package hexlet.code;

import hexlet.code.games.FirstGame;
import hexlet.code.games.SecondGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int userChoice;
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        System.out.print("Your choice: ");
        Scanner scan = new Scanner(System.in);
        userChoice = scan.nextInt();
        switch (userChoice) {
            case 1 -> Cli.greeting();
            case 2 -> FirstGame.even();
            case 3 -> SecondGame.calc();
            case 0 -> System.out.println("Goodbye");
            default -> System.out.println("Incorrect choice");
        }
    }
}
