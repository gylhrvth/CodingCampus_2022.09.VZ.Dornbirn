package martin.week02;

import martin.week01.MethodenUndSchleifen;


public class NativeDataTypes {
    public static void main(String[] args) {
        MethodenUndSchleifen.head("#", "Faktorial");
        printFactorial(20);
        MethodenUndSchleifen.head("#", "Von 0 bis 100 Zaehlen in 0.1er Schritten 1");
        //printDecCount1();
        MethodenUndSchleifen.head("#", "Von 0 bis 100 Zaehlen in 0.1er Schritten 1");
        printDecCount2();
        MethodenUndSchleifen.head("#", "Teilen und Herrschen");
        printDivAndConq();
        MethodenUndSchleifen.head("@", "Berehcnung von Pi (Leibniz Reihe)");
        printCalcPiLeibn(5);
        MethodenUndSchleifen.head("@", "Berechnung von Pi (Nilakantha Reihe)");
        printCalcPiNilakantha(20);
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

    public static void printCalcPiLeibn(double Kommastellen) {
        double Pi = 0;
        double div = 0.5;
        double i = 1;
        boolean subOrAdd = true;
        double Komm = 0;
        while (div >= 1/(10*(Kommastellen+1))) {
            if (subOrAdd) {
                div = 4f / i;
                Pi = Pi + 4f / i;
                subOrAdd = false;
            } else {
                div = 4f / i;
                Pi = Pi - 4f / i;
                subOrAdd = true;
            }
            i = i + 2;
            System.out.println(div);
        }
        System.out.printf("%1.10f %n", Pi);
        System.out.println("Auf " + (int)Kommastellen + " Kommastellen genau berechnet.");
        System.out.println();
    }

    public static void printCalcPiNilakantha(int Iterationen) {
        double calcPi = 3;
        boolean subOrAdd = true;
        for (int i = 3; i <= Iterationen + 3; i = i + 2) {
            if (subOrAdd) {
                calcPi = calcPi + 4f / ((i - 1) * i * (i + 1));
                subOrAdd = false;
            } else {
                calcPi = calcPi - 4f / ((i - 1) * i * (i + 1));
                subOrAdd = true;
            }
        }
        System.out.printf("%1.8f %n", calcPi);
        System.out.println();
    }
}
