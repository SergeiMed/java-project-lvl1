package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Random;

public class Even {

    private static final int MAX_VALUE_RANDOM_NUMBER = 50;
    private static final int COUNT_OF_TRANSMITTED_VALUES_IN_ROUND = 2;

    public static void runGame() {
        Engine even = new Engine();
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][COUNT_OF_TRANSMITTED_VALUES_IN_ROUND];
        for (String[] questionAndAnswer : questionsAndAnswers) {
            int randomNumber = Random.getRandomNumber(MAX_VALUE_RANDOM_NUMBER);
            String rightAnswer;
            if (randomNumber % 2 == 0) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }
            questionAndAnswer[0] = Integer.toString(randomNumber);
            questionAndAnswer[1] = rightAnswer;
        }
        even.runGame("Answer 'yes' if number even otherwise answer 'no'.", questionsAndAnswers);
    }
}
