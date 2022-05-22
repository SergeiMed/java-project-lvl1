package hexlet.code.games;

import hexlet.code.Engine;

public class SecondGame {
    private static String operation;
    private static final int COUNT_RANDOM_OPERATIONS = 3;
    public static void calc() {
        Engine calc = new Engine(20);
        calc.greeting();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < calc.getNumberOfRounds(); i++) {
            int randomNumber = calc.getRandomNumber();
            int randomNumber1 = calc.getRandomNumber();

            int randomOperation = (int) ((Math.random() * COUNT_RANDOM_OPERATIONS) + 1);
            switch (randomOperation) {
                case 1 -> {
                    calc.setRightAnswer(Integer.toString(randomNumber + randomNumber1));
                    operation = "+";
                }
                case 2 -> {
                    calc.setRightAnswer(Integer.toString(randomNumber - randomNumber1));
                    operation = "-";
                }
                case 3 -> {
                    calc.setRightAnswer(Integer.toString(randomNumber * randomNumber1));
                    operation = "*";
                }
                default -> System.exit(0);
            }
            System.out.println("Question: " + randomNumber + " " + operation + " " + randomNumber1);
            calc.userInteraction();
        }
        Engine.getCongratulations();
    }
}
