package alp.week03;


import alp.week02.UserInput2;
import alp.week03.Copy;
import alp.week03.randomarray;

import java.util.Arrays;

public class AufgabeNumberArray2 {
    public static void main() {



            //Für aufwärtszählen, also aufwärtszählen von 0 - MAX_VALUE:


        int array = UserInput2.readUserInputInteger(0, Integer.MAX_VALUE);
        int[] arrayforwards = new int[array];                            //eckige klammer steht für Array, also für Array immer eckige klammer!
        for (int i = 0; i < arrayforwards.length; i++) {
            arrayforwards[i] = i + 1;
        }
        System.out.println("Arrayforwards: " + Arrays.toString(arrayforwards));







        //Für runterzählen, also Runterzählen von (eingegebene Zahl durch User) - 0:

        int[] arraybackwards = new int[array];
        for (int i = 0; i < arraybackwards.length; i++) {
            arraybackwards[i] = array - i;
        }
        System.out.println("Arraybackwards: " + Arrays.toString(arraybackwards));

        int[] newCopy = Copy.main(arraybackwards);
        System.out.println(Arrays.toString(newCopy));



    }


}
