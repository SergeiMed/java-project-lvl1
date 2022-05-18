package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        System.out.print("Your choice: ");
        Scanner scan = new Scanner(System.in);
        var choice = scan.nextInt();
        switch (choice) {
            case 1 -> Cli.greeting();
            case 2 -> Cli.even();
        }
    }
}
