package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final int MAX_VALUE_RANDOM_NUMBER = 100;

    public static void runGame() {
        String[][] roundsData = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (String[] roundData : roundsData) {
            int randomNumber = Utils.getRandomNumber(MAX_VALUE_RANDOM_NUMBER);
            String rightAnswer;
            rightAnswer = isPrime(randomNumber) ? "yes" : "no";
            roundData[0] = Integer.toString(randomNumber);
            roundData[1] = rightAnswer;
        }
        Engine.runGame("Answer 'yes' if given number is prime. Otherwise answer 'no'.", roundsData);
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
