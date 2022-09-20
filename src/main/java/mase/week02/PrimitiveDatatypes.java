package mase.week02;

public class PrimitiveDatatypes {
    public static void main(String[] args) {
        //counting(20);
        System.out.println("==================");
        countToHundred();
        System.out.println("==================");
        teilenundHerrschen();
        System.out.println("==================");
        piLeibnitzReihe();
        System.out.println("==================");
        piNilakanthaReihe();
        System.out.println("==================");
//        leibniz();
    }

    public static void counting(int factorial) {
        long result = 1;
        for (int i = 1; i <= factorial; i++) {             // count every Round
            result = result * i;

            System.out.printf("Counter: %14d%n", result);

        }

    }

    public static void countToHundred() {
        ;

        for (int i = 0; i <= 1000; i++) {      // 1000/10 = 100.0

            System.out.println(i / 10f);
            System.out.printf("Counter: %-6.2f%n", i / 10f);
        }

    }

    public static void teilenundHerrschen() {
        for (int i = 0; i <= 20; i++) {
            int result = i / 5;
            float result2 = i / 5.0f;
            System.out.printf("Count: %2d,  result 1 =%2d,   result2 = %5.1f", i, result, result2);
            System.out.println();
        }
    }

    public static void piLeibnitzReihe() {
        double nenner = 1;
        double pi = 0;

        for (int i = 0; i <= 200000; i++) {
            if (i % 2 == 0) {                   // wenn gerade Zahl
                pi = pi + (4 / nenner);         //  +
            } else {                            // sonst -
                pi = pi - (4 / nenner);
            }
            nenner = nenner + 2;                // nenner + 2
        }

        System.out.println("Pi:" + pi);                 // nach schleife ergebniss *4
    }

//    public static void leibniz() {
//        int neg = -4;
//        double piValue = 0;
//        for (int i = 0; i < 20000000; i++) {
//            neg = neg * -1;
//            piValue += neg / (2 * i + 1.0);
//        }
//        System.out.println("Pi ~ " + piValue);
//    }

    public static void piNilakanthaReihe() {
        double pi = 0;
        int nen = -4;
        double y = 0;
        for (int i =1 ; i < 2000; i++) {
            if (i % 2 == 0) {
                 y =i * (i + 1) * (i + 2);
                nen = nen * -1;
                pi += nen / y;

            }
        }
        System.out.println("Pi: "  + (3 + pi));
    }
}
