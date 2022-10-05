package batuhan.week04;

import batuhan.week04.BubblesortmitStrings;

import java.util.Arrays;

public class BubblesortmitStringsExtended {

    public static void main(String[] args) {

        String[] beispiel = new String[]{"a", "b", "c", "d"};
        String[] names = new String[]{"Mahmut", "Josef", "Konstantin", "Magomed", "Maria", "Said", "Jackichan", "Torsten"};

        System.out.println("Beispiel: ");
        System.out.println(Arrays.toString(names));
        String[] result = Extended(names, false);
        System.out.println("Sortiert absteigend: ");
        System.out.println(Arrays.toString(result));

        String[] result2 = Extended(names, true);
        System.out.println("Sortiert aufsteigend: ");
        System.out.println(Arrays.toString(result2));




    }

    public static String[] Extended(String[] inputString, boolean ascending) {

        String[] result = new String[(inputString.length)];

        if (ascending) {
            result = BubblesortmitStrings.sortNamesAlphabetically(inputString);
        } else {
            result = BubblesortmitStrings.sortNamesAlphabetically2(inputString);
        }

        return result;
    }




}
