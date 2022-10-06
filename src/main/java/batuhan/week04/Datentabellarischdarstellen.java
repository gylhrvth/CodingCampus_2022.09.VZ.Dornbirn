package batuhan.week04;

public class Datentabellarischdarstellen {


    public static void printHeader() {
        String[] header = new String[]{"Firstname", "Lastname", "Age", "Place", "Distance from Capital"};

        for (int i = 0; i < header.length; i++) {
            System.out.printf("|%25s|", header[i]);

        }


    }

    public static void printUnderLine(int spalt) {
        for (int i = 0; i < spalt; i++) {
            System.out.print("__");


        }
        System.out.println();


    }

    public static void Tabele(int length) {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        for (int i = 0; i < firstName.length ; i++) {
            System.out.printf("|%25s|",firstName[i]);
            System.out.printf("|%25s|",lastName[i]);
            System.out.printf("|%25s|",age[i]);
            System.out.printf("|%25s|",place[i]);
            System.out.printf("|%25s|",distanceFromCapital[i]);
            System.out.println();


        }

    }




    public static void main(String[] args) {
        printHeader();
        System.out.println();
        printUnderLine(80);
        Tabele(args.length);

    }

}
