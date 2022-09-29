package viktor.week03;

import java.util.Arrays;
import java.util.Random;

public class GnomeSort {

    public static void gnomeSort(int[] array, int size) {

        int i = 0;
        int temp = 0;

        while (i < size) {
            if (i == 0) {
                i++;
            } else if (array[i] >= array[i - 1]) {   // wenn das Element größer oder gleich als das vorige Element ist,
                                                    // dann gehen wir in der Schleife weiter
                i++;
            } else {
                temp = array[i];                   // ansonsten werden die Elemente getauscht
                                                 // und treten wir in der Schleife einen Schritt zurück
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i--;
            }
        }
        System.out.println("Gnome sort: " + Arrays.toString(array));
    }


    public static void main(String[] args) {


        int s = ArrayExample1.readSize();
        int[] myArray = new int[s];

        for (int i = 0; i < s; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            myArray[i] = randomNumber;
        }
        System.out.println("Array:" + Arrays.toString(myArray));
        System.out.println();
        gnomeSort(myArray, s);

    }
}
