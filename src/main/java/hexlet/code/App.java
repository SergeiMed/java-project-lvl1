package hexlet.code;

import hexlet.code.games.FirstGame;
import hexlet.code.games.SecondGame;
import hexlet.code.games.ThirdGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int userChoice;
        String output = "Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - NOD\n0 - Exit";
        System.out.println(output);
        System.out.print("Your choice: ");
        Scanner scan = new Scanner(System.in);
        userChoice = scan.nextInt();
        switch (userChoice) {
            case 1 -> Cli.greeting();
            case 2 -> FirstGame.even();
            case 3 -> SecondGame.calc();
            case 4 -> ThirdGame.gcd();
            case 0 -> System.out.println("Goodbye");
            default -> System.out.println("Incorrect choice");
        }
    }
}
