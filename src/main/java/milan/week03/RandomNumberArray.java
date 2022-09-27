package milan.week03;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArray {

    public static Random ran = new Random();

    public static void main(String[] args) {

        int[] template = new int[20];
        for (int i = 0; i < template.length; i++) {
            int rdm = ran.nextInt(101);
            template[i] = rdm;
        }
        for (int j : template) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(template));
    }

//        int[] template2 = new int[20];
//        int rdm2 = ran.nextInt(101);
//        for (int j : template2) {
//            System.out.println();
//        }


}