package mase.week04;

import java.util.Arrays;

public class IndexBubblesort {
    public static void main(String[] args) {
        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        bubbleSort(names, 2  );
        System.out.println(Arrays.toString(names));

    }

    public static String[] bubbleSort(String[] names, int index) {
        for (String s : names){
            if (s.length() <= index){
                System.out.println("Die Liste kann nicht gedruckt werden");
                System.out.println("Die Orginale wurde wieder gedruckt");

                return names;
            }
        }

        for (int i = 0; i < names.length; i++) {

            for (int j = 0; j + 1 < names.length; j++) {
                if (names[j].charAt(index) > names[j + 1].charAt(index)) {
                    String value = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = value;
                }
            }

        }
        return names;
    }
}


