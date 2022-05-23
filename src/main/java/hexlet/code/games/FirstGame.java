package hexlet.code.games;

import hexlet.code.Engine;

public class FirstGame {
    public static void even() {
        Engine even = new Engine();
        even.greeting();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        for (int i = 0; i < even.getNumberOfRounds(); i++) {
            int randomNumber = even.getRandomNumber(100);
            if (randomNumber % 2 == 0) {
                even.setRightAnswer("yes");
            } else {
                even.setRightAnswer("no");
            }
            System.out.println("Question: " + randomNumber);
            even.userInteraction();
        }
        Engine.getCongratulations();
    }
}
