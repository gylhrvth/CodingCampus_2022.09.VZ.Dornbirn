package stefan.week02;

public class PrimitiveDatentypen {

    public static void main(String[] args) {
        System.out.println("faktorial");
        System.out.println();
        faktorial();
        System.out.println();
        System.out.println("faktoialLinksBuendig");
        faktoialLinksBuendig();
        System.out.println();
        System.out.println("Zählen 0.1 to 100");
        zählen();
        System.out.println();
        System.out.println("ZählenErweitert");
        zählenErweitert();
        System.out.println();
        System.out.println("TeilenUndHerrschen");
        teilenUndHerrschen();
        System.out.println();
        System.out.println("LeibnizReihe");
        pi();
        System.out.println();
        System.out.println("NilakanthaReihe");
        NilakanthaReihe();
        System.out.println();
    }


    public static void faktorial() {

        long result = 1l;
        for (int i = 1; i <= 20; i++) {
            result *= i;                                                                //result * result = i
            System.out.printf("ergebnis: | %2d! | %20d |%n", i, result);

            System.out.println();
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
        int c = -4;
        double pivalue= 0;
        for (int i = 0; i < 20000; ++i) {

            c = c *-1;
            pivalue += c /(2*i+1.0);                                  //pivalue = c + negativ :Kurze Schreibweisse

            }
        System.out.println(pivalue);

    }

    public static void NilakanthaReihe() {
int x = -4;
double pivalue =0;

        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j < 10; j++) {
                x=x * -1;
              // pivalue += x/ ();

            }


        }
        System.out.println(x);
    }
}




