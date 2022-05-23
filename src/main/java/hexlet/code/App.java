package hexlet.code;

import hexlet.code.games.FirstGame;
import hexlet.code.games.FourthGame;
import hexlet.code.games.SecondGame;
import hexlet.code.games.ThirdGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int userChoice;
        String selectGame = "Please enter the game number and press Enter.";
        String listOfGames = "1 - Greet\n2 - Even\n3 - Calc\n4 - NOD\n5 - Progression\n0 - Exit";
        System.out.println(selectGame);
        System.out.println(listOfGames);
        System.out.print("Your choice: ");
        Scanner scan = new Scanner(System.in);
        userChoice = scan.nextInt();
        switch (userChoice) {
            case 1 -> Cli.greeting();
            case 2 -> FirstGame.even();
            case 3 -> SecondGame.calc();
            case 4 -> ThirdGame.gcd();
            case 5 -> FourthGame.progression();
            case 0 -> System.out.println("Goodbye");
            default -> System.out.println("Incorrect choice");
        }
    }
}
