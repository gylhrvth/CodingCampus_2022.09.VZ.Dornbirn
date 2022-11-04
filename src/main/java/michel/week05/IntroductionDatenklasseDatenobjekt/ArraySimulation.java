package michel.week05.IntroductionDatenklasseDatenobjekt;

import java.util.Random;

public class ArraySimulation {
    public static Random rand = new Random();
    public static void main(String[] args) {

        int[] arr = new int[rand.nextInt(101)];
        for (int i = 0; i < arr.length; i++) {
            int randomNumber = rand.nextInt(101)-50;
            arr[i]=randomNumber;
        }

        Array a1 = new Array(new int[]{4, 5, 6, 7, 8});
        Array a2 = new Array(new int[]{-100,-74,4, 5, 6, 7, 8,-99,33,65,-1001});
        Array a3 = new Array(new int[]{1,2,3,4,5,6,7,8,9,10});
        Array a4 = new Array(arr);
        a1.setMin(2);


        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

    }

}
