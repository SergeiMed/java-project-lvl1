package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_ROUNDS = 3;

    public Engine() {
    }

    public final void runGame(String gameDescription, String[][] questionsAndAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name);
        System.out.println(gameDescription);
        for (String[] questionAndAnswer : questionsAndAnswers) {
            System.out.println("Question: " + questionAndAnswer[0]);
            System.out.print("Your answer: ");
            String userAnswer = scan.nextLine();
            if (userAnswer.equals(questionAndAnswer[1])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. ");
                System.out.println("Correct answer was " + "'" + questionAndAnswer[1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + name + "!");
        scan.close();
    }
}






