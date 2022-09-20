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
            System.out.println(i);
        }
        System.out.println();

        System.out.println("V2 Zählen 1-100 (1000)in 0,1");
        for (float i = 1; i <= 1000; i++) {
            System.out.printf("%-6.2f", i / 10f);

        }
        System.out.println();
        System.out.println();


        System.out.println("V1 Teilen und Herrschen");
        System.out.println("| Counter | int Div | double Div |");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("| %7d | %7d | %10.1f |\n", i, i/5, i/5.0);
        }
        System.out.println("V1 Leibniz Reihe");
        for (double i = 0; i <=100 ; i++) {
            System.out.print(i );

        }


    }
}

