package lukas.week01.day4;

public class ExampleCount {
    public static void main(String[] args) {
        count1A();
        System.out.println();
        count1B();
        System.out.println();
        count2();
        System.out.println();
        count3A();
        System.out.println();
        count3B();
        System.out.println();
        count4();

        System.out.println("Change");
    }

    private static void count1A() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    private static void count1B() {
        int i = 0;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }

    private static void count2() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }

    private static void count3A() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void count3B() {
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
    }

    private static void count4() {
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }
}
