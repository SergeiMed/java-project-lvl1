package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static String operation;
    private static final int COUNT_RANDOM_OPERATIONS = 3;
    private static final int MAX_VALUE = 20;
    private static final String MARK_ADDITION = "1";
    private static final String MARK_SUBTRACTION = "2";
    private static final String MARK_MULTIPLICATION = "3";
    public static void calc() {
        Engine calc = new Engine();
        calc.greeting();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < calc.getNumberOfRounds(); i++) {
            int randomNumber = calc.getRandomNumber(MAX_VALUE);
            int randomNumber1 = calc.getRandomNumber(MAX_VALUE);
            int randomOperation = (int) ((Math.random() * COUNT_RANDOM_OPERATIONS) + 1);
            String markOperation = Integer.toString(randomOperation);
            switch (markOperation) {
                case MARK_ADDITION -> {
                    calc.setRightAnswer(Integer.toString(randomNumber + randomNumber1));
                    operation = "+";
                }
                case MARK_SUBTRACTION -> {
                    calc.setRightAnswer(Integer.toString(randomNumber - randomNumber1));
                    operation = "-";
                }
                case MARK_MULTIPLICATION -> {
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
