package stefan.weeek02;

public class PrimitiveDatentypen {

    public static void main(String[] args) {
        faktorial();
        System.out.println();
        faktoialLinksBuendig();
        zählen();
        System.out.println();
        zählenErweitert();
        System.out.println("___________");
        teilenUndHerrschen();
        System.out.println();
        pi();
    }


    public static void faktorial() {

        long result = 1l;
        for (int i = 1; i <= 20; i++) {
            result *= i;
            System.out.printf("ergebnis: | %2d! | %20d |%n", i, result);


        }
    }

    public static void faktoialLinksBuendig() {


        long result = 1l;
        for (int i = 1; i <= 20; i++) {
            result *= i;
            System.out.printf("ergebnis: | %2d! | %-20d |%n", i, result);


        }

    }

    public static void zählen() {
        for (int i = 1; i <= 1000; i++) {

            System.out.printf("ergebnis: %5.1f%n", i / 10f);

        }
    }

    public static void zählenErweitert() {
        for (int i = 1; i <= 1000; i++) {

            System.out.printf("ergebnis:  %-5.2f%n", i / 10f);

        }
    }

    public static void teilenUndHerrschen() {

        for (int i = 1; i <= 20; i++) {


            // System.out.print(i+" "+i/5+" "+i/5f );
            System.out.printf("%1d." + "Ergebnis:" + "%6d|x" + " %6d|x" + " %5.2f|x%n", i, i, i, i / 10f);

        }

    }

    public static void pi() {
        //double c = 4d;
        for (int i = 0; i < 100; ++i) {
            if (i % 2 == 1) {

                System.out.println(i);

            }
        }

        //System.out.println((4d/1d)-(4d/3d)+(4d/7d)+(4d/9d)-(4d/11d)+(4d/13d)-(4d/15d));


    }
}




