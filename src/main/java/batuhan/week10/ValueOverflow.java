package batuhan.week10;

public class ValueOverflow {
    public static void main(String[] args) {
        int value = Integer.MAX_VALUE - 10;

        for (int i = 0; i < 20; i++) {
            System.out.println(value);
            ++value;

        }
    }
}
