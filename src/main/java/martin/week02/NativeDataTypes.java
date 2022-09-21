package martin.week02;

import martin.week01.MethodenUndSchleifen;


public class NativeDataTypes {
    public static void main(String[] args) {
        MethodenUndSchleifen.head("#", "Faktorial");
        printFactorial(20);
        //MethodenUndSchleifen.head("#", "Von 0 bis 100 Zaehlen in 0.1er Schritten 1");
        //printDecCount1();
        MethodenUndSchleifen.head("#", "Von 0 bis 100 Zaehlen in 0.1er Schritten 1");
        printDecCount2();
        MethodenUndSchleifen.head("#", "Teilen und Herrschen");
        printDivAndConq();
        MethodenUndSchleifen.head("@", "Berehcnung von Pi (Leibniz Reihe)");
        printCalcPiLeibn(7);
        MethodenUndSchleifen.head("@", "Berechnung von Pi (Nilakantha Reihe)");
        printCalcPiNilakantha(7);
        MethodenUndSchleifen.head("@", "Eulerberechnung");
        printEulerBerechnung(100);
        MethodenUndSchleifen.head("@","Wurzelanneherung");
    }

    public static void printFactorial(int factorial) {
        double factOut = 1;
        for (int i = 1; i <= factorial; i++) {
            factOut = i * factOut;
            System.out.printf("%3d! = %25.0f %n", i, factOut);
        }
        System.out.println();
    }

    //public static void printDecCount1() {
    //     for (float i = 0; i <= 100; i = i + .1f) {
    //         System.out.printf("%5.1f %n", i);
    //      }
    //  }

    public static void printDecCount2() {
        for (float i = 0; i <= 1000; i++) {
            if (i == 0) {
                System.out.printf("%149.1f %n", i);
            } else if (i % 25 == 0) {
                System.out.printf("%5.1f %n", i / 10);
            } else {
                System.out.printf("%5.1f ", i / 10);
            }
        }
        System.out.println();
    }

    public static void printDivAndConq() {
        for (int i = 0; i <= 20; i++) {
            System.out.printf("Zaehler %2d | ", i);
            System.out.printf("%2d durch 5 = %3d | ", i, i / 5);
            System.out.printf("%2d durch 5.0 = %1.1f%n", i, i / 5.0f);
        }
        System.out.println("Der Unterschied zwischen der 2.ten und 3.ten Spalte ergibt sich durch das Teilen des Rest.");
        System.out.println();
    }

    public static void printCalcPiLeibn(int Kommastellen) {
        double PiMax = 9999;
        double PiMin = 0;
        int i = 0;
        while (PiMax - PiMin >= 1 / (Math.pow(10, Kommastellen))) {
            PiMax = PiMin + 4.0 / (4 * i + 1);
            PiMin = PiMax - 4.0 / (4 * i + 3);
            i++;
        }
        System.out.printf("Pi liegt im Bereich von %1.10f bis %1.10f mit einer Genauigkeit von %d Kommastellen.%n", PiMax, PiMin, Kommastellen);
        System.out.println();
    }

    public static void printCalcPiNilakantha(int Kommastellen) {
        double PiMax = 9999;
        double PiMin = 3;
        int i = 4;
        while (PiMax - PiMin >= 1 / (Math.pow(10, Kommastellen))) {
            PiMax = PiMin + 4f / ((i - 2) * (i - 1) * i);
            PiMin = PiMax - 4f / ((i + 2) * (i + 1) * i);
            i = i + 4;
        }
        System.out.printf("Pi liegt im Bereich von %1.10f bis %1.10f mit einer Genauigkeit von %d Kommastellen.%n", PiMax, PiMin, Kommastellen);
        System.out.println();
    }

    public static void printEulerBerechnung(int Wiederholungen) {
        double e = 1;
        double factorial=1;
        for (int i = 0; i < Wiederholungen; i++) {
            e += Math.pow(1,i)/(factorial=factorial*(i+1));
        }
        System.out.printf("Die Rechnung führt zu %.11f.\n\n",e);
    }

    /*public static void printWurzelnaeherung(int Wiederholungen) {
        double random = new java.util.Random().nextInt(10000) + 1;

        double factorial=1;
        for (int i = 0; i < Wiederholungen; i++) {
            random += Math.pow(1,i)/(factorial=factorial*(i+1));
        }
        System.out.printf("Die Rechnung führt zu %.11f.\n\n",random);
    }

    /*public static void printWurzelnaeherungFalsch(){
        double random = new java.util.Random().nextInt(10000) + 1;
        double randomwurzel = Math.pow(random, 0.5f);
        System.out.printf("Die Wurzel von %.0f ist %.3f.\n\n",random,randomwurzel);
    }*/


}
