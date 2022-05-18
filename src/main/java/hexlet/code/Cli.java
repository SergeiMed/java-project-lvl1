package hexlet.code;

import java.util.Scanner;

public class Cli {
    static String name = "";
    public static void greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
    public static void even() {
        Cli.greeting();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int randomNumber = (int) (Math.random() * 101);
            var rightAnswer = "";
            if (randomNumber % 2 == 0) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }
            System.out.println("Question: " + randomNumber);
            Scanner sc = new Scanner(System.in);
            System.out.print("Your answer: ");
            var userAnswer = sc.nextLine();
            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
            }
            else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + rightAnswer + "\nLet's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");

    }
}
