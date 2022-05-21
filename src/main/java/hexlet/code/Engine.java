package hexlet.code;

import java.util.Scanner;

public class Engine {

    private int rangeBoundary;
    private final int numberOfRounds = 3;
    private int randomNumber;
    private String rightAnswer;
    private static String name = "";
    private final Scanner SC = new Scanner(System.in);

    public Engine(int inputRangeBoundary) {
        this.rangeBoundary = inputRangeBoundary;
    }

    public Engine() {
    }

    public final int getNumberOfRounds() {
        return numberOfRounds;
    }

    public final int getRandomNumber() {
        randomNumber = (int) ((Math.random() * rangeBoundary) + 1);
        return randomNumber;
    }

    public final void setRightAnswer(String inputRightAnswer) {
        this.rightAnswer = inputRightAnswer;
    }

    public final void greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = SC.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public final void userInteraction() {
        System.out.print("Your answer: ");
        var userAnswer = SC.nextLine();
        if (userAnswer.equals(rightAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + rightAnswer + ".");
            System.out.println("Let's try again, " + name + "!");
            System.exit(0);
        }
    }
    public static void getCongratulations() {
        System.out.println("Congratulations, " + name + "!");
    }
}






