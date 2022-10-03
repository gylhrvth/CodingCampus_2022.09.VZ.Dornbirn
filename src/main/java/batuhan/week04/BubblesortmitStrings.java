package batuhan.week04;

import java.util.Arrays;

public class BubblesortmitStrings {


    public static void main(String[] args) {
        String[] names = new String[]{"Mahmut", "Josef", "Konstantin", "Magomed", "Maria", "Said", "Jackichan", "Torsten"};
        System.out.println("Vor dem Sort :" + Arrays.toString(names));
        sortNamesAlphabetically(names);
        System.out.println("Nach dem Sort <=(:" + Arrays.toString(names));
        sortNamesAlphabetically2(names);
        System.out.println("Nach dem Sort =>(:" + Arrays.toString(names));


    }

    public static void sortNamesAlphabetically(String[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                if (values[j].compareTo(values[j + 1]) > 0) {
                    String temp = values[j + 1];
                    values[j + 1] = values[j];
                    values[j] = temp;
                }
            }


        }
    }
    public static void sortNamesAlphabetically2(String[] values2){
        for (int i = 0; i < values2.length; i++) {
            for (int j = 0; j < values2.length - 1; j++) {
                if (values2[j].compareTo(values2[j + 1]) < 0) {
                    String temp = values2[j + 1];
                    values2[j + 1] = values2[j];
                    values2[j] = temp;

                }

            }

        }
    }


}
