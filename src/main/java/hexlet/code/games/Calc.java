package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final char[] OPERATIONS = {'+', '-', '*'};
    private static final int MAX_VALUE_RANDOM_NUMBER = 15;

    public static void runGame() {
        String[][] roundsData = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.runGame("What is the result of the expression?", roundsData);
    }

    public static int calculate(char operation, int number1, int number2) {
        switch (operation) {
            case '+' -> {
                return number1 + number2;
            }
            case '-' -> {
                return number1 - number2;
            }
            case '*' -> {
                return number1 * number2;
            }
            default -> throw new RuntimeException("Incorrect operation");
        }
    }

    public static String[] generateRoundData() {
        int randomNumber1 = Utils.getRandomNumber(MAX_VALUE_RANDOM_NUMBER);
        int randomNumber2 = Utils.getRandomNumber(MAX_VALUE_RANDOM_NUMBER);
        char randomOperation = OPERATIONS[Utils.getRandomNumber(OPERATIONS.length - 1)];
        int answer = calculate(randomOperation, randomNumber1, randomNumber2);
        String question = randomNumber1 + " " + randomOperation + " " + randomNumber2;
        return new String[]{question, Integer.toString(answer)};
    }
}
