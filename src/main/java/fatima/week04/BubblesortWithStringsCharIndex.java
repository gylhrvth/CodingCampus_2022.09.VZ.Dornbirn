package fatima.week04;

import java.util.Arrays;

public class BubblesortWithStringsCharIndex {
    public static void main(String[] args) {
        String[] names = {"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        sortWithIndex(names, 2);

    }

    public static void sortWithIndex(String[] names, int index) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() < min) {
                min = names[i].length();
            }
        }
        if (index <= 0) {
            System.out.println("Index must not be negative, choose a index >= 0");
        } else if (index >= min) {
            System.out.println("Index too large");
        } else {
            for (int i = 0; i < names.length; i++) {
                for (int j = 0; j < names.length - 1; j++) {
                    if (names[j].charAt(index) > names[j + 1].charAt(index)) {
                        String temp = names[j];
                        names[j] = names[j + 1];
                        names[j + 1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(names));
        }
    }
}

