package bernadette.week01;

public class Counting {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("1.Aufgabe");
        System.out.println("===========================");


        for (int i = 0; i <= 10; ++i) {
            System.out.print(i + ",");
        }

        System.out.println();
        System.out.println("===== mit while statt for =======");

        int j = 0;
        while (j <= 10) {
            System.out.print(j + ",");
            ++j;
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("===========================");
        System.out.println("2.Aufgabe");
        System.out.println("===========================");

        for (int i = 0; i <= 9; ++i) {
            System.out.print("i = " +i + ",");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("===========================");
        System.out.println("3.Aufgabe");
        System.out.println("===========================");

        for (int i = 1; i <= 10; ++i) {

            if ( i % 2 == 0) {
                System.out.print(i + ",");
            }
        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("===========================");
        System.out.println("3.Aufgabe, (b)");
        System.out.println("===========================");

        int k = 1;
        while (k <= 10) {

            if ( k % 2 == 0) {
                System.out.println(k + " was the variable k");
                }
            ++k;
        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("===========================");
        System.out.println("3.Aufgabe, (b), easier way");
        System.out.println("===========================");

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.print(i + ",");
        }

        System.out.println();
        System.out.println();
        System.out.println("===========================");
        System.out.println("4.Aufgabe");
        System.out.println("===========================");

        for (int i = 10; i >= -10; i = i-1) {
            System.out.print(i + ",");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("===========================");
        System.out.println("DONE");
        System.out.println("===========================");
    }
}
