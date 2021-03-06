package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    private static final int MAX_VALUE_RANDOM_NUMBER = 50;

    public static void runGame() {
        String[][] roundsData = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.runGame("Find the greatest common divisor of given numbers.", roundsData);
    }

    public static int calculateGcd(int number1, int number2) {
        int maxPossibleCommonDivider = number1 >= number2 ? number1 / 2 : number2 / 2;
        int maxCommonDivider = 1;
        for (int j = 1; j <= maxPossibleCommonDivider; j++) {
            if (number1 % j == 0 && number2 % j == 0) {
                maxCommonDivider = j;
            }
        }
        return maxCommonDivider;
    }

    public static String[] generateRoundData() {
        int randomNumber1 = Utils.getRandomNumber(MAX_VALUE_RANDOM_NUMBER);
        int randomNumber2 = Utils.getRandomNumber(MAX_VALUE_RANDOM_NUMBER);
        int maxCommonDivider = calculateGcd(randomNumber1, randomNumber2);
        return new String[]{randomNumber1 + " " + randomNumber2, Integer.toString(maxCommonDivider)};
    }
}
