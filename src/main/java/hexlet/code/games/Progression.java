package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int MIN_VALUE_RANDOM_LENGTH = 5;
    private static final int MAX_VALUE_RANDOM_LENGTH = 10;
    private static final int MAX_VALUE_RANDOM_FIRST_NUMBER = 1;
    private static final int MAX_VALUE_RANDOM_STEP = 6;

    public static void runGame() {
        String[][] roundsData = new String[Engine.NUMBER_OF_ROUNDS][2];
        StringBuilder builder = new StringBuilder();
        for (String[] roundData : roundsData) {
            int lengthString = Utils.getRandomNumber(MIN_VALUE_RANDOM_LENGTH, MAX_VALUE_RANDOM_LENGTH);
            int firstNumber = Utils.getRandomNumber(MAX_VALUE_RANDOM_FIRST_NUMBER);
            int stepProgression = Utils.getRandomNumber(MAX_VALUE_RANDOM_STEP);
            int numberMissing = Utils.getRandomNumber(lengthString);
            int currentValue = firstNumber;
            for (int j = 1; j <= lengthString; j++) {
                if (j == numberMissing) {
                    builder.append(".. ");
                } else {
                    builder.append(currentValue).append(" ");
                }
                currentValue += stepProgression;
            }
            roundData[0] = builder.toString();
            roundData[1] = Integer.toString(firstNumber + (numberMissing - 1) * stepProgression);
            builder.delete(0, builder.length());
        }
        Engine.runGame("What number is missing in the progression?", roundsData);
    }
}
