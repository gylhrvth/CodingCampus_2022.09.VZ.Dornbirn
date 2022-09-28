package viktor.week03;

import java.util.Random;

public class RandomNumberArraySumme {

    public static int sum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }


    public static void main(String[] args) {

        int size = ArrayExample1.readSize();
        int[] myArray = new int[size];

        System.out.println();
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            myArray[i] = randomNumber;
        }
        System.out.println("Elemente: ");
        for (int j : myArray) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Summe der Zahlen: " + sum(myArray));


    }
}
