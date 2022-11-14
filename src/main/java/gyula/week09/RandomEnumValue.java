package gyula.week09;

import java.util.Random;

public class RandomEnumValue {
    private enum MyMagicDays {
        MONDAY(0),
        TUESDAY(10),
        WEDNESDAY(20),
        THURSDAY(100),
        FRIDAY(40),
        SATURDAY(-2),
        SUNDAY(-3);

        private final int value;

        MyMagicDays(final int newValue) {
            value = newValue;
        }

        public int getValue() { return value; }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        MyMagicDays[] valueSet = MyMagicDays.values();

        for (int i = 0; i < 20; ++i) {
            System.out.println(valueSet[rand.nextInt(valueSet.length)]);
        }
    }

}
