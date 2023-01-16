package stefan.MultiThreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        List<Thread> threads = new ArrayList<>();

        threads.add(doSomeWork("Putzen"));
        threads.add(doSomeWork("Kochen"));
        threads.add(doSomeWork("Reparieren"));
        threads.add(doSomeWork("Decke schleifen"));

        System.out.println("Starting all Work!!!");
        for (Thread t: threads) {
           t.start();
        }

        for(Thread t: threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                //noop
            }
        }

        System.out.println("All work is done!!!");
    }

    private static Thread doSomeWork(String work) {
        Thread t = new Thread(() -> {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                System.out.println("I am working on: " + work+" ["+i+"]");
                try {
                    Thread.sleep(random.nextInt(1000) + 500);
                } catch (InterruptedException e) {
                    //noop
                }
            }
        });
        return t;
    }
}
