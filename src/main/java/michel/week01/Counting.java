package michel.week01;

public class Counting {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("Aufgabe: Zählen");
        System.out.println("----------------------------");

        for (int i = 1; i <= 10; ++i) {
            System.out.println(i);

        }

        System.out.println("----------------------------");
        System.out.println("Aufgabe Zählen 2");
        System.out.println("----------------------------");

        int j = 0;
            while (j <= 10) {
                System.out.println(j);
                ++j;
            }

        System.out.println("----------------------------");
        System.out.println("Aufgabe Zählen mit Trick");
        System.out.println("----------------------------");

        for(int k = 0; k <= 10; ++k){
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }
        System.out.println("----------------------------");
        System.out.println("Aufgabe Rewind");
        System.out.println("----------------------------");

        for(int l = 10; l >= -10; --l){
            System.out.println(l);
        }

    }
}

