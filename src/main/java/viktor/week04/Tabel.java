package viktor.week04;

public class Tabel {

    public static void printHeader() {
        String[] header = new String[]{"Firstname", "Lastname", "Age", "Place", "Distance from Capital"};

        for (int j = 0; j < header.length; j++) {
            System.out.printf("|%25s|", header[j]);
        }
    }

    public static void printUnderLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("_");
        }
        System.out.println();
    }


    public static void printTable(){

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        for (int i = 0; i < firstName.length; i++) {
            System.out.printf("|%25s|", firstName[i]);
            System.out.printf("|%25s|", lastName[i]);
            System.out.printf("|%25d|", age[i]);
            System.out.printf("|%25s|", place[i]);
            System.out.printf("|%25.5f|", distanceFromCapital[i]);
            System.out.println();
        }
    }


    public static void main(String[] args) {


        printHeader();
        System.out.println();
        printUnderLine(135);
        printTable();



    }


}
