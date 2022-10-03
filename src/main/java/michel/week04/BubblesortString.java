package michel.week04;


import java.util.Arrays;

public class BubblesortString {
    public static void main(String[] args) {
        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};

        sortWithoutBubblesort(names);
        System.out.println(Arrays.toString(names));

        sortWithBubblesortAscending(names);
        System.out.println(Arrays.toString(names));

        sortWithBubblesortDescending(names);
        System.out.println(Arrays.toString(names));
    }

    private static void sortWithBubblesortDescending(String[] names) {
        String temp;
        System.out.println();
        System.out.println("Bubblesort Descending: ");
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) < 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
    }

    private static void sortWithBubblesortAscending(String[] names) {

        String temp;
        System.out.println();
        System.out.println("Bubblesort Ascending: ");
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[i]) < 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
    }


    private static void sortWithoutBubblesort(String[] names) {
        System.out.println();
        System.out.println("Without Bubblesort: ");
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
        }
    }
}

