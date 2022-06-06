package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int MIN_VALUE_RANDOM_LENGTH = 5;
    private static final int MAX_VALUE_RANDOM_LENGTH = 10;
    private static final int MAX_VALUE_RANDOM_FIRST_NUMBER = 5;
    private static final int MAX_VALUE_RANDOM_STEP = 6;

    public static void runGame() {
        String[][] roundsData = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.runGame("What number is missing in the progression?", roundsData);
    }

    public static String[] generateProgression(int begin, int step, int numberOfElements) {
        String[] progression = new String[numberOfElements];
        int currentNumber = begin;
        for (int i = 0; i <= numberOfElements - 1; i++) {
            progression[i] = Integer.toString(currentNumber);
            currentNumber += step;
        }
        return progression;
    }

    public static String[] generateRoundData() {
        int lengthProgression = Utils.getRandomNumber(MIN_VALUE_RANDOM_LENGTH, MAX_VALUE_RANDOM_LENGTH);
        int firstNumber = Utils.getRandomNumber(MAX_VALUE_RANDOM_FIRST_NUMBER);
        int stepProgression = Utils.getRandomNumber(MAX_VALUE_RANDOM_STEP);
        int numberMissing = Utils.getRandomNumber(lengthProgression - 1);
        String[] progression = generateProgression(firstNumber, stepProgression, lengthProgression);
        progression[numberMissing] = "..";
        String question = String.join(" ", progression);
        String answer = Integer.toString(firstNumber + (numberMissing) * stepProgression);
        return new String[]{question, answer};
    }
}
