package viktor.week03;

import java.util.Random;

public class RandomNumberArrayCounter {

    public static void counter(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 30 ){
                count++;
            }
        }
        System.out.println("Anzahl der Werte, die größer als 30 sind: " + count);
    }




    public static void main(String[] args) {

        int size = ArrayExample1.readSize();
        int[] myArray = new int[size];

        System.out.println();
        for(int i = 0; i < size; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            myArray[i] = randomNumber;
        }
        for(int j: myArray){
            System.out.print(j+ " ");

        }
        System.out.println();
        counter(myArray);


    }
}
