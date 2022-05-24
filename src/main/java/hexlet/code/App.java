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
        String userChoice;
        String selectGame = "Please enter the game number and press Enter.";
        String listOfGames = "1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit";
        System.out.println(selectGame);
        System.out.println(listOfGames);
        System.out.print("Your choice: ");
        Scanner scan = new Scanner(System.in);
        userChoice = scan.nextLine();
        switch (userChoice) {
            case GREETING -> Cli.greeting();
            case EVEN -> Even.even();
            case CALC -> Calc.calc();
            case GCD -> Gcd.gcd();
            case PROGRESSION -> Progression.progression();
            case PRIME -> Prime.prime();
            case EXIT -> System.out.println("Goodbye");
            default -> System.out.println("Incorrect choice");
        }
    }
}
