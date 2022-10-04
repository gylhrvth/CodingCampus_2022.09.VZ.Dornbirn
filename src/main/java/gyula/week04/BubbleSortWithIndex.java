package gyula.week04;

import java.util.Arrays;

public class BubbleSortWithIndex {
    public static void main(String[] args) {
        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Martin", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana" };
        System.out.println("Before: " + Arrays.toString(names));
        sortNamesAtIndex(names, 4);
        System.out.println("After : " + Arrays.toString(names));
    }

    public static void sortNamesAtIndex(String[] names, int index){
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (( names[j].length() > index &&
                     names[j + 1].length() > index &&
                     names[j].charAt(index) > names[j + 1].charAt(index))
                || (
                        names[j].length() <= index &&
                        names[j].length() < names[j + 1].length()
                    )){

                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }
}
