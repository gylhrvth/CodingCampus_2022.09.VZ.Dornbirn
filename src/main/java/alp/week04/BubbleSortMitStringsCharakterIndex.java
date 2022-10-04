package alp.week04;

import java.util.Arrays;

public class BubbleSortMitStringsCharakterIndex {

    public static void main(String[] args) {
        String[] names = {"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        int zahl = 2;
        bubblesortAlgorithmus(names, zahl);
        System.out.println(Arrays.toString(names));


    }

    public static void bubblesortAlgorithmus(String[] abc, int Index) {
        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc.length - i - 1; j++) {
                if (abc[j].charAt(Index) > abc[j + 1].charAt(Index)) {
                    String temp = abc[j];
                    abc[j] = abc[j + 1];
                    abc[j + 1] = temp;
                }
            }
        }
    }


}
