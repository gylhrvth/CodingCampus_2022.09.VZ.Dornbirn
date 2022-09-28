package milan.week03;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArrayCrazyRange {

    public static Random ran = new Random();


    public static void main(String[] args) {

        System.out.println("------------------------------");
        int[] template = new int[10];
        for (int i = 0; i < template.length; i++) {
            int rdm = ran.nextInt(101) - 50; // random bound geht immer von 0 aus, mit -50 wird der Bound um -50 verschoben
            //int rdm = ran.nextInt(-50,50); // funktioniert auch?!

            template[i] = rdm;
        }

        for (int j : template) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

    }
}
