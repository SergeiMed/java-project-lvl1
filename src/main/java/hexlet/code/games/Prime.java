package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void prime() {

        Engine prime = new Engine();
        prime.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < prime.getNumberOfRounds(); i++) {
            int randomNumber = prime.getRandomNumber(100);
            if (isPrime(randomNumber)) {
                prime.setRightAnswer("yes");
            } else {
                prime.setRightAnswer("no");
            }
            System.out.println("Question: " + randomNumber);
            prime.userInteraction();
        }
        Engine.getCongratulations();
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
