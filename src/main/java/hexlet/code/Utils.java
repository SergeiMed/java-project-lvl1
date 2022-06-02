package hexlet.code;

public class Utils {

    public static final int DEFAULT_MAX_RANDOM_NUMBER = 30;

    public static int getRandomNumber(int maxValue) {
        return (int) ((Math.random() * maxValue) + 1);
    }
    public static int getRandomNumber(int minValue, int maxValue) {
        return  (int) (Math.random() * (maxValue + 1 - minValue) + minValue);
    }
    public static int getRandomNumber() {
        return (int) ((Math.random() * DEFAULT_MAX_RANDOM_NUMBER) + 1);
    }
}
