package viktor.week04;

import java.util.Arrays;

public class StringBubbleShort {

    public static void sortAsc(String[] myArray) {

        String temp = "0";

        for(int j = 0; j < myArray.length-1; j++) {
            for (int i = 0; i < myArray.length-j-1; i++) {
                if (myArray[i].length() > myArray[i + 1].length()) {
                    temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;

                }

            }
        }



        System.out.println("Sortierung nach Länge der Namen (asc): " + Arrays.toString(myArray));



        for(int j = 0; j < myArray.length-1; j++) {
            for (int i = 0; i < myArray.length-j-1; i++) {


                if (myArray[i].compareTo(myArray[i+1]) > 0 ) {

                    temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;

                }

            }
        }
        System.out.println("Sortierung nach Alphabet (asc): " + Arrays.toString(myArray));



    }


    public static void sortDesc(String[] array) {

        String temp2 = "0";

        for (int h = 0; h < array.length - 1; h++) {
            for (int i = 0; i < array.length - 1 - h; i++) {
                if (array[i].length() < array[i + 1].length()) {
                    temp2 = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp2;
                }
            }
        }
        System.out.println("Sortierung nach Länge der Namen (desc): " + Arrays.toString(array));



        for (int h = 0; h < array.length - 1; h++) {
            for (int i = 0; i < array.length - 1 - h; i++) {

                if (array[i].compareTo(array[i + 1]) < 0) {

                    temp2 = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp2;
                }
            }
        }
        System.out.println("Sortierung nach Alphabet (desc): " + Arrays.toString(array));


    }


    public static void main(String[] args) {

        String a ="a";
        String b = "d";

        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike",
                "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};

        sortAsc(names);
        System.out.println();
        sortDesc(names);
        System.out.println();




    }
}
