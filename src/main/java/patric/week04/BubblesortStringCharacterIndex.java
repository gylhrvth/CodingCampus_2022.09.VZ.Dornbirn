package patric.week04;

import java.util.Arrays;

public class BubblesortStringCharacterIndex {

    public static void main(String[] args) {

        String[] names =
                new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};

        System.out.println("Strings sorted:  ");
        int index = 0;
        boolean sortIsPossible = true;
        while (sortIsPossible) {
            sortIsPossible = sortByIndex(names, index);
            ++index;
            System.out.println(Arrays.toString(names));
        }
    }


    public static boolean sortByIndex(String[] names, int index) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() <= index){
                System.out.println("Sortierung ist nicht möglich");
                return false;
            }
        }

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].charAt(index) > names[j + 1].charAt(index)) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        return true;
    }


}
