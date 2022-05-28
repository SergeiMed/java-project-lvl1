package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Random;

public class Progression {
    private static final int MIN_VALUE_RANDOM_LENGTH = 5;
    private static final int MAX_VALUE_RANDOM_LENGTH = 10;
    private static final int MAX_VALUE_RANDOM_FIRST_NUMBER = 1;
    private static final int MAX_VALUE_RANDOM_STEP = 6;
    private static final int COUNT_OF_TRANSMITTED_VALUES_IN_ROUND = 2;

    public static void runGame() {
        Engine progression = new Engine();
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][COUNT_OF_TRANSMITTED_VALUES_IN_ROUND];
        StringBuilder builder = new StringBuilder();
        for (String[] questionAndAnswer : questionsAndAnswers) {
            int lengthString = Random.getRandomNumber(MIN_VALUE_RANDOM_LENGTH, MAX_VALUE_RANDOM_LENGTH);
            int firstNumber = Random.getRandomNumber(MAX_VALUE_RANDOM_FIRST_NUMBER);
            int stepProgression = Random.getRandomNumber(MAX_VALUE_RANDOM_STEP);
            int numberMissing = Random.getRandomNumber(lengthString);
            int currentValue = firstNumber;
            for (int j = 1; j <= lengthString; j++) {
                if (j == numberMissing) {
                    builder.append(".. ");
                } else {
                    builder.append(currentValue).append(" ");
                }
                currentValue += stepProgression;
            }
            questionAndAnswer[0] = builder.toString();
            questionAndAnswer[1] = Integer.toString(firstNumber + (numberMissing - 1) * stepProgression);
            builder.delete(0, builder.length());
        }
        progression.runGame("What number is missing in the progression?", questionsAndAnswers);
    }
}
