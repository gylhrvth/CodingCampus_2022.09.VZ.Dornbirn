package stefan.MultiThreaded;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {





        List<Thread> threads = new ArrayList<>();
        threads.add(new Thread(new Work("Putzen", 10)));
        threads.add(new Thread(new Work("Kochen", 3)));
        threads.add(new Thread(new Work("Reparieren", 8)));
        threads.add(new Thread(new Work("Decke schleifen", 1)));





        System.out.println("Starting all Work!!!");
        for (Thread t : threads) {
            t.start();

        }

        for (Thread t : threads) {
            try {
                t.join();

            } catch (InterruptedException e) {
                //noop
            }
        }

        System.out.println("All work is done!!!");
    }


}
