package stefan.MultiThreaded;

import java.util.Random;

public class Work implements Runnable {
    private String myWork;
    private int howManyTimes;

    public Work(String myWork, int howManyTimes) {
        this.myWork = myWork;
        this.howManyTimes = howManyTimes;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println("I am working on: " + myWork + " [" + i + "]");
            try {
                Thread.sleep(random.nextInt(1000) + 500);
            } catch (InterruptedException e) {
                //noop
            }
        }
    }

}
