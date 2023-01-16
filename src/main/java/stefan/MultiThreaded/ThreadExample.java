package stefan.MultiThreaded;

import java.util.Random;

public class ThreadExample {
    public static Random random = new Random();
    public static int counter = 1;
    public static Object gateKeeper = new Object();

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            startWithoutTread("Alex", i);
            startWithoutTread("Bertorld", i);
            startWithoutTread("Cemil", i);
            startWithoutTread("Daniel", i);
        }
        System.out.println("============================");
        startMyTread("Alex");
        startMyTread("Bertorld");
        startMyTread("Cemil");
        startMyTread("Daniel");
    }

    public static void startMyTread(String name) {
        Thread t = new Thread(() -> {
            while (true) {
                synchronized (gateKeeper) {
                    System.out.print(name + " " + counter);
                    System.out.println((" ".repeat(3) + "< 0 >").repeat(5));
                    ++counter;
                }

                try {
                    Thread.sleep(50 + random.nextInt(50));
                } catch (InterruptedException ie) {
                }
            }
        });
        t.start();
    }


    public static void startWithoutTread(String name, int counter) {
        System.out.println(name + " " + counter);
        try {
            Thread.sleep(50 + random.nextInt(50));
        } catch (InterruptedException ie) {
        }

    }


}
