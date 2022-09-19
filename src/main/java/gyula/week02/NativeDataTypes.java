package gyula.week02;

public class NativeDataTypes {
    public static void main(String[] args) {
        byte b = 22;
        short sh = 22;
        int myAge = 22;
        long loooong = 22L;

        System.out.println("Byte: " + Byte.MIN_VALUE + " bis " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " bis " + Short.MAX_VALUE);
        System.out.println("Int: " + Integer.MIN_VALUE + " bis " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " bis " + Long.MAX_VALUE);

        loooong = b;
        b = (byte)loooong;

        //   1.53 * 10^5 = 153000
        //   1.54 * 10^5 = 154000

        //   1.53 * 10^-5 = 0.0000153
        //   1.54 * 10^-5 = 0.0000154

        float f = 3.14f;
        double d = 3.14;

        System.out.println("f: " + f);
        System.out.println("d: " + d);


        System.out.println("myAge + 10 = " + (myAge + 10));
        System.out.println("myAge - 10 = " + (myAge - 10));
        System.out.println("myAge * 2 = " + (myAge * 2));
        System.out.println("myAge / 2 = " + (myAge / 2));

        System.out.println("13 / 5  = " + (13 / 5));
        System.out.println("13 % 5  = " + (13 % 5));
        System.out.println("13 / 5f  = " + (13 / 5f));


        System.out.printf("Hello World!\n");
        System.out.printf("Hello World!%n");

        System.out.printf("My age is %d years.%n", myAge);
        System.out.printf("My age is %d years and %d days.%n", myAge, 0);

        System.out.printf("My age is %10d years.%n", myAge);
        System.out.printf("My age is %-10d years.%n", myAge);

        for (int i = -15; i < 15; i++) {
            System.out.printf("Counter: %5d%n", i);
        }

        System.out.printf("My name is %10s.%n", "Gyula");
        System.out.printf("My name is %-10s.%n", "Gyula");


        System.out.println(Math.PI);
        System.out.printf("My number is %10.3f.%n", Math.PI);
        System.out.printf("My number is %10.3f.%n", 12f);

        System.out.printf("My number is %-10.3f.%n", Math.PI);


    }
}
