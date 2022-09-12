package patric.week01;

public class Zaehlen {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; ++i) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(i);
        }
        System.out.println();
        System.out.println("============================");

        int j = 0;
        while (j <= 10) {
            System.out.println(j);

            ++j;

        }
        System.out.println("============================");


    }
}