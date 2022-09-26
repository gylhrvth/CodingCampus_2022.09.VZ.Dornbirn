package bernadette.week02;

import java.util.Random;

public class NativeDataTypes {
    public static void main(String[] args) {
        printCalculateFactorial(20);
        System.out.println("\n");
        printCalculateFactorialFormatted(20);
        System.out.println("\n");
        printCounting(100, 0.1f);
        System.out.println("\n");
        printDivideEtImpere(20);
        System.out.println("\n");
        printCalculatePi();
        System.out.println("\n");
        printCalculatePiNilakantha();
        System.out.println("\n");
        printSecretRow(10000);
        System.out.println("\n");
        //printSquareRoot();


    }


    // 1. exercise: calculate the factorial for all 1<x>20
    public static void printCalculateFactorial(int factorial_end) {
        System.out.println("\n");
        System.out.println("1.exercise: ");
        System.out.println("\n");

        long result = 1;
        for (int i = 1; i <= factorial_end; i++) {
            result *= i;
            System.out.println(i + "! = " + result);
        }
    }

    // 2. exercise: calculate the factorial for all 1<x>20, but nicely formatted
    public static void printCalculateFactorialFormatted(int factorial_end) {

        System.out.println("2.exercise: ");
        System.out.println("\n");

        long result = 1;
        for (int i = 1; i <= factorial_end; i++) {
            result *= i;
            System.out.printf("%2d! = %23d %n", i, result);
        }
    }

    public static void printCounting(int count_to, float step) {
        System.out.println("3.exercise: ");
        System.out.println("\n");

        for (float i = 0; i < count_to; i = i + step) {

            System.out.printf(" %5.1f %n", i);
        }
    }

    //4.exercise: function which counts 0<x>20, prints x, x/5 and x/5.0
    public static void printDivideEtImpere(int count_to) {
        System.out.println("4.exercise: ");
        System.out.println("\n");

        for (int i = 0; i < count_to; i++) {

            int result1 = i / 5;
            float result2 = i / 5.0f;

            //System.out.println( "counter was: " +i +" the result based on integers is: " +result1 +  "   and the result based on floats is:" + result2);
            System.out.printf("counter: %2d, result 1: %3d     and result 2: %6.1f %n", i, result1, result2);

        }

    }

    public static void printCalculatePi() {
        System.out.println("5.exercise: Leibniz ");

        double base = -1;  // the base for the power function
        double sum = 1;     // sums of the leibniz row

        for (double i = 1; i < 10000000; i = i + 1) {

            double x = (Math.pow(base, i)) / (2 * i + 1);

            sum = sum + x;
        }
        System.out.println("with Leibniz:  pi = " + sum * 4);

    }

    public static void printCalculatePiNilakantha() {
        System.out.println("6.exercise: Nilakantha ");
        double bracket = 0;
        double base = -1;
        double sum = 0;


        for (int i = 2; i < 10000000; i = i + 4) {
            base = base * (-1);
            bracket = i * (i + 1) * (i + 2);
            sum = 4 * base / bracket;

        }
        System.out.println("with Nilakantha:  pi = " + (3 + sum));

    }

    public static void printSecretRow(int iterations) {
        System.out.println("7.exercise: secret row ");
        double x = 1.0;
        for (int i = 1; i < iterations; i++) {
            x = x / 2.0 + 1.0 / x;

        }
        System.out.printf(" End value of row for %d iterations: %10.8f %n", iterations, x);
    }

//    public static void printSquareRoot() { 
//
//        double random = new Random().nextInt(10000) + 1;
//        long random2 = random;
//        double root = random2^(-2);
//        System.out.printf("For the random number %d the square root is approx.  %4.8f",random,root);
//
//    }
}




