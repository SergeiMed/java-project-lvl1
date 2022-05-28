package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Random;


public class Calc {
    private static final String MARK_ADDITION = "1";
    private static final String MARK_SUBTRACTION = "2";
    private static final String MARK_MULTIPLICATION = "3";
    private static String operation;
    private static String rightAnswer;
    private static final int MAX_VALUE_RANDOM_NUMBER = 15;
    private static final int COUNT_OF_OPERATION = 3;
    private static final int COUNT_OF_TRANSMITTED_VALUES_IN_ROUND = 2;

    public static void runGame() {
        Engine calc = new Engine();
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][COUNT_OF_TRANSMITTED_VALUES_IN_ROUND];
        for (String[] questionAndAnswer : questionsAndAnswers) {
            int randomNumber1 = Random.getRandomNumber(MAX_VALUE_RANDOM_NUMBER);
            int randomNumber2 = Random.getRandomNumber(MAX_VALUE_RANDOM_NUMBER);
            int randomOperation = Random.getRandomNumber(COUNT_OF_OPERATION);
            String markOperation = Integer.toString(randomOperation);
            switch (markOperation) {
                case MARK_ADDITION -> {
                    operation = "+";
                    rightAnswer = Integer.toString(randomNumber1 + randomNumber2);
                }
                case MARK_SUBTRACTION -> {
                    operation = "-";
                    rightAnswer = Integer.toString(randomNumber1 - randomNumber2);
                }
                case MARK_MULTIPLICATION -> {
                    operation = "*";
                    rightAnswer = Integer.toString(randomNumber1 * randomNumber2);
                }
                default -> System.exit(0);
            }
            questionAndAnswer[0] = randomNumber1 + " " + operation + " " + randomNumber2;
            questionAndAnswer[1] = rightAnswer;
        }
        calc.runGame("What is the result of the expression?", questionsAndAnswers);
    }
}
