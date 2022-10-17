package stefan.Test;


public class Test {

    public static void main(String[] arr) {
        test();
        test1();
        int number1 = 10;
        int number2 = 10;
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                System.out.print((i + j) % 2 == 1 ? "#" : '_');


            }
            System.out.println();
        }
    }

    public static void test() {
        for (int i = -30; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }


        }
    }

    public static void test1() {
        int number = 0;
        while (number <= 10) {
            if (number > 6) {
                System.out.println();
            }
            System.out.println(number);
            number++;

        }
    }
}