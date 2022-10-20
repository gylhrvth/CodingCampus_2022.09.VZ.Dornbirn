package franz.week01;

public class schleifen {

    public static void main(String[] args) {
        System.out.println("1.1 Aufgabe for");
        System.out.println("");
        for (int i = 0; i <= 10; ++i) {
            System.out.println(i);
        }
        System.out.println("");

        System.out.print("1.2 Aufgabe while");
        System.out.println("");
        int j = 0;
        while (j <= 10) {
            System.out.println(j);
            j += 1;
        }
        System.out.println("");

        System.out.print("2.1 Aufgabe 0-9 ");
        System.out.println("\n");
        int k = 0;
        while (k < 10) {
            System.out.println(k);
            k += 1;
        }
        System.out.println("");

        System.out.print("3.1 Aufgabe nur gerade");
        System.out.println("");
        for (int i = 0; i <= 10; ++i) {
            if (i % 2 != 0)
                System.out.println(i);
        }
        System.out.println("");

        System.out.println("");
        System.out.print("3.2 Aufgabe nur jede zweite gerade  ");
        System.out.println("");
        for (int m = 0; m <= 10; ++m) {
            if (m % 2 != 0)
                System.out.println(m);
        }

        System.out.println("");

        System.out.println("");
        System.out.print("4.1 -10");
        System.out.println("");
        int n = 10;
        int o = -10;
        int p = 1;
        while (o < n) {
            System.out.println(n);
            n -= p;
        }
        System.out.println("");


        System.out.println("");
        System.out.print("4.1+ -10");
        System.out.println("");
        n = 10;
        while (n >= -10) {
            System.out.println(n);
            --n;
            System.out.print("");
        }
    }
}