package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int userChoice;
        String selectGame = "Please enter the game number and press Enter.";
        String listOfGames = "1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit";
        System.out.println(selectGame);
        System.out.println(listOfGames);
        System.out.print("Your choice: ");
        Scanner scan = new Scanner(System.in);
        userChoice = scan.nextInt();
        switch (userChoice) {
            case 1 -> Cli.greeting();
            case 2 -> Even.even();
            case 3 -> Calc.calc();
            case 4 -> Gcd.gcd();
            case 5 -> Progression.progression();
            case 6 -> Prime.prime();
            case 0 -> System.out.println("Goodbye");
            default -> System.out.println("Incorrect choice");
        }
    }
}
