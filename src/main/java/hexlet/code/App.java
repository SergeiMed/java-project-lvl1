package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    private static final String GREETING = "1";
    private static final String EVEN = "2";
    private static final String CALC = "3";
    private static final String GCD = "4";
    private static final String PROGRESSION = "5";
    private static final String PRIME = "6";
    private static final String EXIT = "0";

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        switch (userChoice) {
            case GREETING -> Cli.greet();
            case EVEN -> Even.runGame();
            case CALC -> Calc.runGame();
            case GCD -> Gcd.runGame();
            case PROGRESSION -> Progression.runGame();
            case PRIME -> Prime.runGame();
            case EXIT -> System.out.println("Goodbye");
            default -> System.out.println("Incorrect choice");
        }
        scanner.close();
    }
}
