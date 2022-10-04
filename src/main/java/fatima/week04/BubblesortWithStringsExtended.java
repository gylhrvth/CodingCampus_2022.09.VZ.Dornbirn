package fatima.week04;

public class BubblesortWithStringsExtended {
    public static void main(String[] args) {
        String[] names = {"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        System.out.println();
        sort(names, false);
        BubblesortWithStrings.printString(names);

    }

    public static void sort(String[] names, boolean b) {
        if (b) {
            System.out.println("Ascending: ");
            BubblesortWithStrings.sortAscending(names);
        } else {
            System.out.println("Descending: ");
            BubblesortWithStrings.sortDescending(names);
        }
    }
}
