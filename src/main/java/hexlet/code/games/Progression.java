package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static void progression() {

        Engine progression = new Engine();
        progression.greeting();
        StringBuilder builder = new StringBuilder();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < progression.getNumberOfRounds(); i++) {
            int lengthString = progression.getRandomNumber(5, 10);
            int firstNumber = progression.getRandomNumber(10);
            int stepProgression = progression.getRandomNumber(6);
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
