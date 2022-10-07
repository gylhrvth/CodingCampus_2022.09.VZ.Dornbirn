package alp.week04;

import javax.swing.*;
import java.util.Arrays;

public class BubbleSortMitStringsCharakterIndex {

    public static void main(String[] args) {
        String[] names = {"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};

        bubblesortAlgorithmus(names, 5);
        System.out.println(Arrays.toString(names));


    }

    public static void bubblesortAlgorithmus(String[] abc, int index) {
        boolean sortierbar = true;
        for (int k = 0; k < abc.length; k++) {
            //System.out.println(k);
            if (abc[k].length() <= index && sortierbar) {
                System.out.println("Index zu gross");
                sortierbar = false;
            }
        }
        if (sortierbar) {
            for (int i = 0; i < abc.length; i++) {
                for (int j = 0; j < abc.length - i - 1; j++) {
                    if (abc[j].charAt(index) > abc[j + 1].charAt(index)) {
                        String temp = abc[j];
                        abc[j] = abc[j + 1];
                        abc[j + 1] = temp;
                    }
                }
            }
        }
    }
}