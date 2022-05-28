package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Random;

public class Prime {
    private static final int COUNT_OF_TRANSMITTED_VALUES_IN_ROUND = 2;
    private static final int MAX_VALUE_RANDOM_NUMBER = 100;

    public static void runGame() {
        Engine prime = new Engine();
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][COUNT_OF_TRANSMITTED_VALUES_IN_ROUND];
        for (String[] questionAndAnswer : questionsAndAnswers) {
            int randomNumber = Random.getRandomNumber(MAX_VALUE_RANDOM_NUMBER);
            String rightAnswer;
            if (isPrime(randomNumber)) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }
            questionAndAnswer[0] = Integer.toString(randomNumber);
            questionAndAnswer[1] = rightAnswer;
        }
        prime.runGame("Answer 'yes' if given number is prime. Otherwise answer 'no'.", questionsAndAnswers);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        var divider = 2;
        while (divider <= number / 2) {
            if (number % divider == 0) {
                return false;
            }
            divider++;
        }
        return true;
    }
}
