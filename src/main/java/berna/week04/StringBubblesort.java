package berna.week04;

import java.lang.String;
import java.util.Arrays;


public class StringBubblesort {
    public static void main(String[] args) {

        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};

        //exercise: bubblesort with Strings
        System.out.println(" sort by length, ascending:");
        String[] sorted = StringsBubblesortLengthAscending(names);
        System.out.println(Arrays.toString(sorted));
        System.out.println();

        System.out.println(" sort by length, descending:");
        String[] sorted1 = StringsBubblesortLengthDescending(names);
        System.out.println(Arrays.toString(sorted1));
        System.out.println();

        System.out.println(" sort by alphabet, ascending:");
        String[] sorted2 = StringsBubblesortAlphabeticAscending(names);
        System.out.println(Arrays.toString(sorted2));
        System.out.println();

        System.out.println(" sort by alphabet, descending:");
        String[] sorted3 = StringsBubblesortAlphabeticDescending(names);
        System.out.println(Arrays.toString(sorted3));
        System.out.println();

        //exercise: bubblesort with Strings Extended
        System.out.println(" sort by alphabet, ascending or descending via boolean parameter:");
        String[] sorted4 = StringsBubblesortAlphabeticWayOfSorting(false, names);
        System.out.println(Arrays.toString(sorted4));
        System.out.println();

        System.out.println(" sort by length, ascending or descending via boolean parameter:");
        String[] sorted5 = StringsBubblesortLengthWayOfSorting(false, names);
        System.out.println(Arrays.toString(sorted5));
        System.out.println();


    }

    public static String[] StringsBubblesortLengthAscending(String[] testString) {
        String copy = "";
        for (int i = 0; i < testString.length - 1; i++) {

            for (int j = 0; j < testString.length - i - 1; j++) {

                if (testString[j].length() > testString[j + 1].length()) {
                    // if i longer than i+1, switch place
                    copy = testString[j];
                    testString[j] = testString[j + 1];
                    testString[j + 1] = copy;
                }
            }
        }
        return testString;
    }

    public static String[] StringsBubblesortLengthDescending(String[] testString) {
        String copy = "";
        for (int i = 0; i < testString.length - 1; i++) {

            for (int j = 0; j < testString.length - i - 1; j++) {

                if (testString[j].length() < testString[j + 1].length()) {
                    // if i longer than i+1, switch place
                    copy = testString[j];
                    testString[j] = testString[j + 1];
                    testString[j + 1] = copy;
                }
            }
        }
        return testString;
    }

    public static String[] StringsBubblesortAlphabeticAscending(String[] testString) {
        String copy = "";
        for (int i = 0; i < testString.length - 1; i++) {

            for (int j = 0; j < testString.length - i - 1; j++) {

                if (testString[j].compareTo(testString[j + 1]) > 0) {

                    copy = testString[j];
                    testString[j] = testString[j + 1];
                    testString[j + 1] = copy;
                }
            }
        }
        return testString;
    }

    public static String[] StringsBubblesortAlphabeticDescending(String[] testString) {
        String copy = "";
        for (int i = 0; i < testString.length - 1; i++) {

            for (int j = 0; j < testString.length - i - 1; j++) {

                if (testString[j].compareTo(testString[j + 1]) < 0) {

                    copy = testString[j];
                    testString[j] = testString[j + 1];
                    testString[j + 1] = copy;
                }
            }
        }
        return testString;
    }

    public static String[] StringsBubblesortAlphabeticWayOfSorting(boolean ascending, String[] inputString) {

        String[] sort;

        if (ascending) {
            sort = StringsBubblesortAlphabeticAscending(inputString);
        } else {
            sort = StringsBubblesortAlphabeticDescending(inputString);
        }
        return sort;
    }

    public static String[] StringsBubblesortLengthWayOfSorting(boolean ascending, String[] inputString) {

        String[] sort;

        if (ascending) {
            sort = StringsBubblesortLengthAscending(inputString);
        } else {
            sort = StringsBubblesortLengthDescending(inputString);
        }
        return sort;
    }

}



