package viktor.week03;

import java.util.Random;

public class CrazyRange {

    public static void main(String[] args) {

        int size = ArrayExample1.readSize();
        int[] myArray = new int[size];

        for(int i = 0; i < size; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(101)-50;
            myArray[i] = randomNumber;
        }
        for(int j: myArray){
            System.out.print(j + " ");
        }
    }
}
