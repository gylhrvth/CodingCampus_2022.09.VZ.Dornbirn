package milan.week02;

public class PrimitiveDatentypen {
    public static void main(String[] args) {

        System.out.println("=====");
        faktorialLinksbuendig();
        System.out.println("=====");
        faktorialRechtsbuendig();
        System.out.println("=====");
        zaehlenRechtsbuendig();
        System.out.println("=====");
        zaehlenLinksbuendig();
        System.out.println("=====");
        teilenUndHerrschen();
        System.out.println("=====");
        berechnenPi();
        System.out.println("=====");
    }

    public static void faktorialLinksbuendig() {

        long result = 1;
        for (int i = 1; i <= 20; i++) {
            result = result * i;
            System.out.printf("%2d" + " %-20d%n", i, result);
        }
    }

    public static void faktorialRechtsbuendig() {

        long result = 1;
        for (int i = 1; i <= 20; i++) {
            result = result * i;
            System.out.printf("%2d" + "%20d%n", i, result);

        }
    }

    public static void zaehlenRechtsbuendig() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("Ergebnis: " + "%5.1f%n", i / 10f);
        }
    }

    public static void zaehlenLinksbuendig() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("Ergebnis: " + "%-3.2f%n", i / 10f);
        }
    }

    public static void teilenUndHerrschen() {
        for (int i = 0; i <= 20; i++) {
            //System.out.println(i + "x  " + i / 5 + "x  " + i / 5f + "x");
            System.out.printf("%2d" + "x  |" + "%2d" + "x   |" + " %2.2f" + "x%n", i, i / 5, i / 5f);


        }
    }

    public static void berechnenPi() {

        /*double pi = (4 / 1) - (4 / 3) + (4 / 5) - (4 / 7) + (4 / 9) - (4 / 11) + (4 / 13) - (4 / 15) + (4 / 16) - (4 / 17);
        System.out.println(pi * 1000000);*/

        double zahl = 4;
        for (int i = 1; i <= 97; i++) {
            //System.out.println(i + " : ");
            if (i % 2 == 1) {
                System.out.println(zahl / i);
            }
        }
    }
}
