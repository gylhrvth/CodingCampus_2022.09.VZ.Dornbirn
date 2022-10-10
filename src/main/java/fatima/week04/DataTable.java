package fatima.week04;

public class DataTable {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        //header
        System.out.println();
        System.out.printf("%-25s %-25s %-15s %-24s %20s\n", "FIRST NAME", "LAST NAME", "AGE", "PLACE", "DISTANCE FROM CAPITAL");
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        //body
        printbody(firstName, lastName, age, place, distanceFromCapital);
    }

    public static void printbody(String[] firstName, String[] lastName, int[] age, String[] place, float[] distanceFromCapital) {
        for (int i = 0; i < firstName.length; i++) {
            System.out.printf("%-25s %-25s %3d             %-25s %20.1f\n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
        }
    }
}
