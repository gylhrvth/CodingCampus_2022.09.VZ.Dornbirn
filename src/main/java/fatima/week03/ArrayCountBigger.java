package fatima.week03;

import java.util.Random;

public class ArrayCountBigger {

    private static Random rand = new Random();

    public static void main(String[] args) {
        int[] values = RandomNumberArray.generateRandomValues(10);
        RandomNumberArray.printWithForEach(values);

        int minValue = 30;
        System.out.println("Count bigger than " + minValue + ": " + countValuesBiggerThan(values, minValue));
    }

    public static int countValuesBiggerThan(int[] values, int minValue) {
        int counter = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > minValue) {
                ++counter;
            }
        }
        return counter;
    }
}
