package franz.week03;

import java.util.Arrays;
import java.util.Random;


public class ArraysExample2 {
    private static Random rand = new Random();

    public static void main(String[] args) {

        int[] thirdArray = generateNumberArray2(20);

        System.out.println("newarr  : " + Arrays.toString(thirdArray));
        System.out.println("Print with Foreach:");
        System.out.print("foreach: ");
        for (int i : thirdArray) {
            System.out.print(i + ", ");
        }
        System.out.println("\n");
        System.out.println("Print with new For:");
        System.out.print("New for:");
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i] + ", ");
        }
        System.out.println("\n");
        System.out.print("jede 5 zahl im arr:");
        for (int i = 0; i < thirdArray.length; i++)
            if ((i + 1) % 5 == 0) {
                System.out.print(thirdArray[i] + ", ");
            }
        System.out.println("\n");
        System.out.print("jede 2 zahl im arr:");
        for (int i = 0; i < thirdArray.length; i++)
            if ((i + 1) % 2 == 0) {
                System.out.print(thirdArray[i] + ", ");
            }
    }

    public static int arrRandom() {
        int arrRandom = rand.nextInt(0, 101);
        return arrRandom;
    }

    public static int[] generateNumberArray2(int size) {
        System.out.println("Array laenge ist 20 und wird Automatisch ausgfuellt");
        int[] template = new int[size];
        for (int i = 0; i < template.length; i++) {
            template[i] = rand.nextInt(0, 101);
        }
        return template;
    }
}
