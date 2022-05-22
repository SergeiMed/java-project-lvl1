package hexlet.code.games;

import hexlet.code.Engine;

public class ThirdGame {
    private static int maxCommonDivider = 1;
    public static void gcd() {
        Engine gcd = new Engine();
        gcd.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < gcd.getNumberOfRounds(); i++) {
            int randomNumber = gcd.getRandomNumber();
            int randomNumber1 = gcd.getRandomNumber();
            int maxPossibleCommonDivider = randomNumber >= randomNumber1 ? randomNumber / 2 : randomNumber1 / 2;
            for (int j = 1; j <= maxPossibleCommonDivider; j++) {
                if (randomNumber % j == 0 && randomNumber1 % j == 0) {
                    maxCommonDivider = j;
                }
            }
            gcd.setRightAnswer(String.valueOf(maxCommonDivider));
            System.out.println("Question: " + randomNumber + " " + randomNumber1);
            gcd.userInteraction();
        }
        Engine.getCongratulations();
    }

}
