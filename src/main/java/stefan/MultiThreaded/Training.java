package stefan.MultiThreaded;

import java.util.Random;

public class Training implements Runnable {

    private String sportart;
    private String name;
    private int wiederholungen;


    public Training(String sportart, String name, int wiederholungen) {
        this.sportart = sportart;
        this.name = name;
        this.wiederholungen = wiederholungen;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < wiederholungen; i++) {

            System.out.println(name + " " + sportart +wiederholungen+ " " + i);

            try {
                Thread.sleep(5000 + random.nextInt(50));
            } catch (InterruptedException e) {

            }
        }
    }
}
