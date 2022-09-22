package franz.week02;

public class PrimitiveDatentypen {
    public static void main(String[] args) {


        System.out.println("Faktorial 1-20");
        for (long i = 1; i <= 20; i++) {
            System.out.print(i);
            System.out.print(", ");

        }
        System.out.println();
        System.out.println("Faktorial 1*20");
        long result = 1;
        for (long i = 1; i <= 20; i++) {
            result = result * i;
            System.out.printf("%19d", result);
            System.out.println();
        }
        System.out.println();

        System.out.println("Zählen 1-100");
        for (long i = 1; i <= 100; i++) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();

        System.out.println("V1 Zählen 1-100in 0,1(falsch)");
        for (float i = 1; i <= 100; i += 0.1f) {
            System.out.print(i);
            System.out.println();
        }
        System.out.println();

        System.out.println("V2 Zählen 1-100 (1000)in 0,1");
        for (float i = 1; i <= 1000; i++) {
            System.out.printf("%6.2f", i / 10f);
            System.out.println();

        }
        System.out.println();
        System.out.println();


        System.out.println("V1 Teilen und Herrschen");
        System.out.println("| Counter | int Div | double Div |");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("| %7d | %7d | %10.1f |\n", i, i/5, i/5.0);
        }
        System.out.println("V1 Leibniz Reihe");
        leibnitz( 0.00000001);
        System.out.println("");
        System.out.println("V2 Nilakantha Reihe");
        nilakantha(0);


        }
    public static void leibnitz( double precision){
        double piMax = 9999;
        double piMin = 0;
        int i= 0;
        while (piMax - piMin >= precision) {
            piMax = piMin + 4.0 / (4 * i + 1);
            piMin = piMax - 4.0 / (4 * i + 3);
            ++i;
        }
        System.out.printf("pi %12.10f %12.10f (diff: %12.10f) \n", piMin, piMax, piMax-piMin );
    }
    public static void nilakantha( int x){
        for (int i = 1; i <=10; i++) {
            System.out.print(4/(i+1.0)*(i+2)*(i+3));
            System.out.println();
            System.out.print(4/(i+4.0)*(i+5)*(i+6));

        }
        }
}




