package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int MIN_VALUE_RANDOM_LENGTH = 5;
    private static final int MAX_VALUE_RANDOM_LENGTH = 10;
    private static final int MAX_VALUE_RANDOM_FIRST_NUMBER = 1;
    private static final int MAX_VALUE_RANDOM_STEP = 6;

    public static void progression() {

        Engine progression = new Engine();
        progression.greeting();
        StringBuilder builder = new StringBuilder();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < progression.getNumberOfRounds(); i++) {
            int lengthString = progression.getRandomNumber(MIN_VALUE_RANDOM_LENGTH, MAX_VALUE_RANDOM_LENGTH);
            int firstNumber = progression.getRandomNumber(MAX_VALUE_RANDOM_FIRST_NUMBER);
            int stepProgression = progression.getRandomNumber(MAX_VALUE_RANDOM_STEP);
            int numberMissing = progression.getRandomNumber(lengthString);
            int currentValue = firstNumber;
            for (int j = 1; j <= lengthString; j++) {
                if (j == numberMissing) {
                    builder.append(".. ");
                } else {
                    builder.append(currentValue).append(" ");
                }
                currentValue += stepProgression;
            }
            int rightAnswer = firstNumber + (numberMissing - 1) * stepProgression;
            progression.setRightAnswer(String.valueOf(rightAnswer));
            String progress = builder.toString();
            System.out.println("Question: " + progress);
            progression.userInteraction();
            builder.delete(0, builder.length());
        }
        Engine.getCongratulations();
    }
}
