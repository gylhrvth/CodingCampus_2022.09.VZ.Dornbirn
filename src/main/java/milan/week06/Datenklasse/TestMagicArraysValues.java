package milan.week06.Datenklasse;

import java.util.Random;

public class TestMagicArraysValues {

    public static Random ran = new Random();


    public static void main(String[] args) {


        int[] arr = {1, 2, 3};
        int[] arr2 = getArrWithRdm();

        MagicArrayValues giv = new MagicArrayValues(arr2);
        System.out.println(giv);
        System.out.println(giv.getMax());
    }

    public static int[] getArrWithRdm() {
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            int rdm = ran.nextInt(101);
            arr[i] = rdm;
        }

        return arr;
    }
}
