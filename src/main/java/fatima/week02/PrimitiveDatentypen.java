package fatima.week02;

public class PrimitiveDatentypen {

    public static void main(String[] args) {
        printfactorial(20);
        System.out.println();
        printfactorialright(20);
        System.out.println();
        printFactorialLeft(20);
        System.out.println();
        counter1(100);
        System.out.println();
        counter2(100);
        System.out.println();
        divideEtImpera(20);
        System.out.println();
        calculatePiLeibniz(0.00000001);
        System.out.println();
        calculatePiNilakantha();
        System.out.println();
        calculatePiNilakantha2(0.00000001);
    }

    public static void printfactorial(int count) {
        System.out.println("printfactorial(" + count + ")");

        long result = 1;
        for (int i = 1; i <= 20; i++) {
            result = result * i;
            System.out.println(i + "! = " + result);
        }
    }

    public static void printfactorialright(int count) {
        System.out.println("printfactorialright(" + count + ")");
        long result = 1;
        for (int i = 1; i <= 20; i++) {
            result = result * i;
            System.out.printf("%2d! = %19d%n", i, result);
        }
    }

    public static void printFactorialLeft(int count) {
        System.out.println("printFactorialLeft(" + count + ")");
        long result = 1;
        for (int i = 1; i <= 20; i++) {
            result = result * i;
            System.out.printf("%2d! = %-14d%n", i, result);
        }
    }

    public static void counter1(int count) {
        System.out.println("0 - 100 : 0.1 steps");
        for (float i = 0; i <= count; i += 0.1f) {
            System.out.println(i);
        }
        /*
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i /10f);
        }*/
    }

    public static void counter2(int count) {
        System.out.println("0 - 100 : 0.1 steps (2)");
        for (float i = 0; i <= count; i += 0.1f) {
            System.out.printf("%5.1f", i);
            System.out.println();
        }
    }

    public static void divideEtImpera(int count) {
        for (int i = 0; i <= count; i++) {
            int result = i / 5;
            float result2 = i / 5.0f;
            System.out.printf("Count: %2d, result 1 =%2d, result2 = %5.1f", i, result, result2);
            System.out.println();
        }
    }

    public static void calculatePiLeibniz(double precision) {
        double piMax = 9999;
        double piMin = 0;
        int i = 0;
        int countIterations = 0;
        while(piMax - piMin >= precision) {
            piMax = piMin + 4.0 / (4 * i + 1);
            piMin = piMax - 4.0 / (4 * i + 3);
            ++i;
            ++countIterations;
        }
        System.out.printf("Pi ist in Intervall %12.10f %12.10f (diff: %12.10f) in %d iterations\n", piMin, piMax, piMax - piMin, countIterations);
    }

    public static void calculatePiNilakantha() {
        double sum = 3;
        long n = 2;
        int sign = 1;
        for (long i = 0; i < 99L; i++) {
            sum = sum +(sign*(4.0/(n*(n+1)*(n+2))));
            sign = sign * (-1);
            n += 2;
        }
        System.out.printf("     Value of pi is: %13.10f\n" , sum);
        System.out.printf("Real Value of pi is: %13.10f\n" , Math.PI);
        }

    public static void calculatePiNilakantha2(double precision) {
        double piMax = 9999;
        double piMin = 3.0;
        long n = 2;
        int countIteration = 0;
        while(piMax - piMin >= precision) {
            piMax = piMin + 4.0 / (n*(n+1)*(n+2));
            piMin = piMax - 4.0 / ((n+2)*(n+3)*(n+4));
            n += 4;
            ++countIteration;
        }
        System.out.printf("Pi ist in Intervall %12.10f %12.10f (diff: %12.10f) in %d iterations\n", piMin, piMax, piMax - piMin, countIteration);
    }
}








