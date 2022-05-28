package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Random;


public class Gcd {

    private static final int MAX_VALUE_RANDOM_NUMBER = 50;
    private static int maxCommonDivider;
    private static final int COUNT_OF_TRANSMITTED_VALUES_IN_ROUND = 2;

    public static void runGame() {
        Engine gcd = new Engine();
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][COUNT_OF_TRANSMITTED_VALUES_IN_ROUND];
        for (String[] questionAndAnswer : questionsAndAnswers) {
            int randomNumber1 = Random.getRandomNumber(MAX_VALUE_RANDOM_NUMBER);
            int randomNumber2 = Random.getRandomNumber(MAX_VALUE_RANDOM_NUMBER);
            int maxPossibleCommonDivider = randomNumber1 >= randomNumber2 ? randomNumber1 / 2 : randomNumber2 / 2;
            for (int j = 1; j <= maxPossibleCommonDivider; j++) {
                if (randomNumber1 % j == 0 && randomNumber2 % j == 0) {
                    maxCommonDivider = j;
                }
            }
            questionAndAnswer[0] = randomNumber1 + " " + randomNumber2;
            questionAndAnswer[1] = Integer.toString(maxCommonDivider);
        }
        gcd.runGame("Find the greatest common divisor of given numbers.", questionsAndAnswers);
    }
}
