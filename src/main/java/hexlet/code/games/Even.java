package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final int MAX_VALUE_RANDOM_NUMBER = 50;

    public static void runGame() {
        String[][] roundsData = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (String[] roundData : roundsData) {
            int randomNumber = Utils.getRandomNumber(MAX_VALUE_RANDOM_NUMBER);
            String rightAnswer = isEven(randomNumber) ? "yes" : "no";
            roundData[0] = Integer.toString(randomNumber);
            roundData[1] = rightAnswer;
        }
        Engine.runGame("Answer 'yes' if number even otherwise answer 'no'.", roundsData);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
