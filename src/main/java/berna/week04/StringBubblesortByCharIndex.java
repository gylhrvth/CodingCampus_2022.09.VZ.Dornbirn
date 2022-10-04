package berna.week04;

import java.util.Arrays;

public class StringBubblesortByCharIndex {
    // choose the position i within the string where you want to sort

    public static void main(String[] args) {

        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};

        boolean result = createStringBubblesortCharIndex(names, 2);
        if (result) {
            System.out.println(Arrays.toString(names));
        }

    }

    public static int calculateMaxLengthOfString(String[] stringInput) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < stringInput.length - 1; i++) {
            if (stringInput[i].length() < min) {
                min = stringInput[i].length(); // what´s the length of the shortest value in stringInput?
            }
        }
        return min;
    }

    public static boolean createStringBubblesortCharIndex(String[] stringInput, int index) {

        // prove if index exists

        if (index >= calculateMaxLengthOfString(stringInput)) {
            System.out.println("Index not found in your String! Choose a lower value!");
            return false;
        } else if (index < 0) {
            System.out.println("Index must not be negative! Choose a value >=0 !");
            return false;
        } else {
            String copy = "";
            for (int i = 0; i < stringInput.length - 1; i++) {

                for (int j = 0; j < stringInput.length - i - 1; j++) {

                    if ((stringInput[j].charAt(index)) > (stringInput[j + 1].charAt(index))) {
                        copy = stringInput[j];
                        stringInput[j] = stringInput[j + 1];
                        stringInput[j + 1] = copy;
                    }
                }
            }
        }
        return true;
    }
}



