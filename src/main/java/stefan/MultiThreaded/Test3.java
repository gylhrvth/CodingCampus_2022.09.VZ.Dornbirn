package stefan.MultiThreaded;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Thread> threadList = new ArrayList<>();
        threadList.add(new Thread(new Training("Klettert", "Paul", 10)));
        threadList.add(new Thread(new Training("Surft", "Peter", 6)));
        threadList.add(new Thread(new Training("Badminton", "Anna", 8)));
        threadList.add(new Thread(new Work("Auto", 3)));
        threadList.add(new Thread(new Place("feldkirch",8471)));





        System.out.println("Start");
        for (Thread t : threadList) {
            t.start();
        }
        for (Thread t : threadList) {
            try {
                t.join();
            } catch (InterruptedException e) {

            }

        }
        System.out.println("Ende");
    }


}
