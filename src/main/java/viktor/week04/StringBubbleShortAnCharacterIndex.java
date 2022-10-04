package viktor.week04;

import java.util.Arrays;

public class StringBubbleShortAnCharacterIndex {


    public static void sort(String[] myArray, int pos) {


        String temp2 = "0";



        for (int j = 0; j < myArray.length - 1; j++) {
            for (int i = 0; i < myArray.length - j - 1; i++) {



                if ( (myArray[i].length() > pos) && (myArray[i+1].length() > pos) &&
                        (myArray[i].charAt(pos) > myArray[i + 1].charAt(pos))  ||

                        (myArray[i].length() <= pos) &&
                                (myArray[i].length() < myArray[i+1].length()))
                {

                    temp2 = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp2;

                }
            }
        }

        System.out.println("Sortierung alphabetisch nach dem Index " + pos + " im String: ");
        System.out.println(Arrays.toString(myArray));


    }


    public static void main(String[] args) {


        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike",
                "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};

        System.out.println("Original String: " + Arrays.toString(names));
        System.out.println();



            sort(names, 5);




    }
}
