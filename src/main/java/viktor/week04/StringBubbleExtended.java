package viktor.week04;

import java.util.Arrays;

public class StringBubbleExtended {


    public static void sort(String[] myArray, boolean b) {

        String temp = "0";


        if (b == true) {

            for (int j = 0; j < myArray.length - 1; j++) {

                for (int i = 0; i < myArray.length - j - 1; i++) {

                    if (myArray[i].length() > myArray[i + 1].length()) {

                        temp = myArray[i];
                        myArray[i] = myArray[i + 1];
                        myArray[i + 1] = temp;

                    }

                }
            }


            System.out.println("Sortierung nach Länge der Namen (asc): " + Arrays.toString(myArray));

            String temp2 = "0";


            for (int j = 0; j < myArray.length - 1; j++) {
                for (int i = 0; i < myArray.length - j - 1; i++) {


                    if (myArray[i].compareTo(myArray[i + 1]) > 0) {

                        temp2 = myArray[i];
                        myArray[i] = myArray[i + 1];
                        myArray[i + 1] = temp2;

                    }

                }
            }
            System.out.println("Sortierung nach Alphabet (asc): " + Arrays.toString(myArray));


        }
        else{

            String temp2 = "0";

            for (int h = 0; h < myArray.length - 1; h++) {
                for (int i = 0; i < myArray.length - 1 - h; i++) {
                    if (myArray[i].length() < myArray[i + 1].length()) {
                        temp2 = myArray[i];
                        myArray[i] = myArray[i + 1];
                        myArray[i + 1] = temp2;
                    }
                }
            }
            System.out.println("Sortierung nach Länge der Namen (desc): " + Arrays.toString(myArray));



            for (int h = 0; h < myArray.length - 1; h++) {
                for (int i = 0; i < myArray.length - 1 - h; i++) {

                    if (myArray[i].compareTo(myArray[i + 1]) < 0) {

                        temp2 = myArray[i];
                        myArray[i] = myArray[i + 1];
                        myArray[i + 1] = temp2;
                    }
                }
            }
            System.out.println("Sortierung nach Alphabet (desc): " + Arrays.toString(myArray));
        }

    }





    public static void main(String[] args) {



        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike",
                "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};

        sort(names, false);


    }
}
