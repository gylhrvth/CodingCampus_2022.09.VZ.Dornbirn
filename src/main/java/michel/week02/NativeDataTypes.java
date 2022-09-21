package michel.week02;

public class NativeDataTypes {
    public static void main(String[] args) {

//        System.out.printf("********* %nFaktorial %n*********");
//        System.out.println();
//        factorCalc(10);
//
//        smallSteps();
//
//        System.out.printf("******************** %n0 to 100 - 0.1 steps %n********************");
//        System.out.println();
//        shareAndRule(20);
//
//        System.out.printf("************* %nLeibniz Line1 %n*************");
//        System.out.println();
//        leibnizLine1();
//        System.out.printf("************* %nLeibniz Line2 %n*************");
//        System.out.println();
        leibnizLine2();

        System.out.printf("*************** %nNilakantha Line1 %n***************");
        System.out.println();
        nilakanthaLine1();

        System.out.printf("*************** %nNilakantha Line2 %n***************");
        System.out.println();
        nilakanthaLine2(10);

        System.out.printf("*************** %nGeheime Reihe %n***************");
        System.out.println();
        geheimeReihe();
    }

//    static void factorCalc(int f) {
//        int result = 1;
//        for (int i = 1; i <= f; i++) {
//
//            result = result * i;                         // result increases every round
//            System.out.printf("Result: %20d%n", result); //extension with alignment: printf("+ %20d%n")
//        }
//    }
//
//    static void smallSteps() {
//        for (float i = 1; i <= 1000; i++) {
//
//            System.out.printf("Steps: %2.1f%n", i / 10);
//            //System.out.printf("Steps: %6.2f%n",i / 10f);
//        }
//
//    }
//
//    static void shareAndRule(int x) {
//        for (int i = 0; i <= x; i++) {
//            int result = i / 5;
//            float result2 = (i / 5.0f);
//            System.out.printf("Count: %2d ", i);
//
//            System.out.printf("     Count / 5 = %2d", result);
//
//            System.out.printf("     Count / 5.0 = %5.2f%n", result2 );
//
//        }
//    }
//
//    static void leibnizLine1() {
//        int nenner = 1;
//        double pi = 0;
//        for (int i = 0; i <= 1000; i++) {
//
//            if (i % 2 == 0) {
//                pi = pi + (4.0 / nenner);
//            } else {
//                pi = pi - (4.0 / nenner);
//            }
//            nenner = nenner + 2;
//        }
//
//        System.out.println(pi);
//    }

    static void leibnizLine2() {
        int neg = -4;
        double pi = 0;
        for (int i = 0; i < 100000000; i++) {
            neg = neg * -1;

            pi += neg / (i * 2 + 1.0);

        }
        System.out.println(pi);
    }


    static void nilakanthaLine1() {
        double j = 0;
        double neg = -4;
        double pi = 0;
        for (int i = 1; i < 10000000; i++) {
            if (i % 2 == 0) {
                neg = neg * -1;
                j = i * (i + 1) * (i + 2.0);
                pi += neg / j;

            }
        }
        System.out.println(3 + pi);
    }

    static void nilakanthaLine2(int percission) {
        int nenner = 0;
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
                nenner = i * (i + 1) * (i + 2);
                System.out.println(nenner);
            }
        }
    }

    static void geheimeReihe() {
        double wertN = 1.0;
        for (double i = wertN; i < 100; i++) {
            wertN = (wertN / 2) + (1 / wertN);

        }
        System.out.println(wertN);
    }
}
