package fatima.week04;

public class BubblesortWithStrings {
    public static void main(String[] args) {
        String[] names = {"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        System.out.println("Unsorted: ");
        printString(names);
        System.out.println();
        sortAscending(names);
        System.out.println("Ascending: ");
        printString(names);
        System.out.println();
        sortDescending(names);
        System.out.println("Descending: ");
        printString(names);
    }

    public static void printString(String[] names) {
        System.out.print("[");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            if (i < names.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void sortAscending(String[] names) {
        for (int j = 0; j < names.length; j++) {
            for (int i = 0; i < names.length - 1; i++) {
                String first = names[i];
                String second = names[i + 1];
                if (names[i + 1].compareTo(names[i]) < 0) {
                    names[i] = second;
                    names[i + 1] = first;
                }
            }
        }
    }

    public static void sortDescending(String[] names) {
        for (int j = 0; j < names.length; j++) {
            for (int i = 0; i < names.length - 1; i++) {
                String first = names[i];
                String second = names[i + 1];
                if (names[i + 1].compareTo(names[i]) > 0) {
                    names[i] = second;
                    names[i + 1] = first;
                }
            }
        }
    }
}