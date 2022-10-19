package martin.week06.TaskDataclass;

import java.util.Arrays;
import java.util.Random;


public class IntArrayObjectAnalyzerExamples {
    private static final Random rand = new Random();
    public static void main(String[] args) {
        int randNum4= rand.nextInt(8,23);
        int randNum5 = rand.nextInt(10,25);
        int[] exArr0 = new int[0];
        int[] exArr1 = new int[]{-5, 3, 5, -1, -3, 1};
        int[] exArr2 = makeAndFillArray(10);
        int[] exArr3 = makeAndFillArray(22);
        int[] exArr4 = randArray(randNum4, -412, 575);
        int[] exArr5 = randArray(randNum5, -1621, 3785);

        IntArrayObjectAnalyser iAOA0 = new IntArrayObjectAnalyser(exArr0);
        System.out.println("exArr0 "+Arrays.toString(exArr0));
        System.out.println(iAOA0);
        IntArrayObjectAnalyser iAOA1 = new IntArrayObjectAnalyser(exArr1);
        System.out.println("exArr1 "+Arrays.toString(exArr1));
        System.out.println(iAOA1);

        IntArrayObjectAnalyser iAOA2 = new IntArrayObjectAnalyser(exArr2);
        System.out.println("exArr2 "+Arrays.toString(exArr2));
        System.out.println(iAOA2);

        IntArrayObjectAnalyser iAOA3 = new IntArrayObjectAnalyser(exArr3);
        System.out.println("exArr3 "+Arrays.toString(exArr3));
        System.out.println(iAOA3);

        IntArrayObjectAnalyser iAOA4 = new IntArrayObjectAnalyser(exArr4);
        System.out.println("exArr4 "+Arrays.toString(exArr4));
        System.out.println(iAOA4);

        IntArrayObjectAnalyser iAOA5 = new IntArrayObjectAnalyser(exArr5);
        System.out.println("exArr5 "+Arrays.toString(exArr5));
        System.out.println(iAOA5);
        System.out.printf("Averages of all Arrays: %n%.1f  %.1f  %.1f  %.1f  %.1f%n",
                iAOA1.getAvg(),iAOA2.getAvg(),iAOA3.getAvg(),iAOA4.getAvg(),iAOA5.getAvg());
    }

    private static int[] makeAndFillArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=i;
        }
        return arr;
    }

    private static int[] randArray(int size, int minRandom, int maxRandom) {
        int[] randArray = new int[size];
        for (int i = 0; i < size; i++) {
            int randNum = rand.nextInt(maxRandom - minRandom) + minRandom;
            randArray[i] = randNum;
        }
        return randArray;
    }


}
