package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_ROUNDS = 3;

    public static void runGame(String gameDescription, String[][] roundsData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        System.out.println(gameDescription);
        for (String[] roundData : roundsData) {
            String question = roundData[0];
            String answer = roundData[1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (!userAnswer.equals(answer)) {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. ");
                System.out.println("Correct answer was " + "'" + answer + "'.");
                System.out.println("Let's try again, " + name + "!");
                scanner.close();
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!");
        scanner.close();
    }
}






