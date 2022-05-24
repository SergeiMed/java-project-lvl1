package hexlet.code;

import java.util.Scanner;

public class Engine {

    private int randomNumber;
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int DEFAULT_MAX_RANDOM_NUMBER = 20;
    private String rightAnswer;
    private static String name = "";
    private static final Scanner SC_INPUT = new Scanner(System.in);

    public final int getNumberOfRounds() {
        return NUMBER_OF_ROUNDS;
    }


    public final int getRandomNumber(int maxValue) {
        randomNumber = (int) ((Math.random() * maxValue) + 1);
        return randomNumber;
    }
    public final int getRandomNumber(int minValue, int maxValue) {
        randomNumber = (int) (Math.random() * (maxValue + 1 - minValue) + minValue);
        return randomNumber;
    }
    public final int getRandomNumber() {
        randomNumber = (int) ((Math.random() * DEFAULT_MAX_RANDOM_NUMBER) + 1);
        return randomNumber;
    }

    public final void setRightAnswer(String inputRightAnswer) {
        this.rightAnswer = inputRightAnswer;
    }

    public final void greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = SC_INPUT.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public final void userInteraction() {
        System.out.print("Your answer: ");
        var userAnswer = SC_INPUT.nextLine();
        if (userAnswer.equals(rightAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. ");
            System.out.println("Correct answer was " + "'" + rightAnswer + "'.");
            System.out.println("Let's try again, " + name + "!");
            System.exit(0);
        }
    }
    public static void getCongratulations() {
        System.out.println("Congratulations, " + name + "!");
    }
}






