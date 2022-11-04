package mase.week07;

import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class VectorExercise {

    public static void main(String[] args) {
        Random rand = new Random();
        Vector<Integer> randInt = new Vector<>();

        for (int i = 0; i < 20; i++) {
            int random = rand.nextInt(0,100);
            randInt.add(i,random);
        }
        System.out.println(randInt);
    }

}
