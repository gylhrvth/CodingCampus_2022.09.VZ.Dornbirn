package mase.week06;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class ObjectDaten {
    public static Random random = new Random();

    public static void main(String[] args) {

        int[] array3 = new int[random.nextInt(100)];
        for (int i = 0; i < array3.length; i++) {
            int randomNr = random.nextInt(100) - 50;
            array3[i] = randomNr;
        }

        DatenklasseUebung array = new DatenklasseUebung(new int[]{23, 24, 19, 30, 10, 11, 99, 88});

        DatenklasseUebung a2 = new DatenklasseUebung(new int[]{58, 60, 4, 6, 10, 23, 9});

        DatenklasseUebung a3 = new DatenklasseUebung(array3);

        DatenklasseUebung a4 = new DatenklasseUebung(new int[]{45,55,66});
        a4.setMax(67);
        a2.setAvg(3);
        System.out.println(a4);
        System.out.println(array);
        System.out.println(a2);
        System.out.println(a3);


    }

}
