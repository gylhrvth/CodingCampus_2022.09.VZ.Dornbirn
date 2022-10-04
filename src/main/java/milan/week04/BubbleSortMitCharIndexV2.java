package milan.week04;

import java.util.Arrays;

public class BubbleSortMitCharIndexV2 {


    public static void main(String[] args) {

        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        System.out.println("--------------------------------------");

        int position = 0;   //choose position where to sort
        boolean bool = findMin(names, position);  //check if position exists

        if (bool) {
            String [] names_sorted = sortIndexInputAsc(names,position);
            System.out.println("sorted asc: " + Arrays.toString(names_sorted));
        } else {
            System.out.println("Position gibt es nicht!");
        }

    }

    public static String[] sortIndexInputAsc(String[] names, int position) {


        for (int i = 0; i < names.length; i++) {
            for (int pos = 0; pos < names.length - i - 1; pos++) {
                if ((names[pos].length() > position &&
                        names[pos + 1].length() > position &&
                        names[pos].charAt(position) > names[pos + 1].charAt(position))
                        || (
                        names[pos].length() <= position && names[pos].length() < names[pos + 1].length())
                ) {
                    String hold = names[pos];
                    names[pos] = names[pos + 1];
                    names[pos + 1] = hold;
                }
            }

        }
        return names;

    }

    public static boolean findMin(String[] names, int position) {

        boolean bool = false;
        for (String x : names) {
            if (x.length() < position) {
                bool = true;
            }

        }return bool;
    }
}





