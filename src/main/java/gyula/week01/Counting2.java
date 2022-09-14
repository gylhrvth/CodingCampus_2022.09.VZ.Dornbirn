package gyula.week01;

public class Counting2 {
    public static void main(String[] args) {
        countInclusive(8, 12);
        countExclusive(5, 15);
        printEvenNumbers(0, 10);
        countRewind(10, -10);
    }

    public static void countInclusive(int from, int to){
        System.out.println("countInclusive(" + from + ", " + to + ")");
        for (int i = from; i <= to; i++) {
            System.out.print(i);
            if (i < to){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void countExclusive(int from, int to) {
        System.out.println("countExclusive(" + from + ", " + to + ")");

        for (int i = from; i < to; i++) {
            System.out.print(i);
            if (i < to - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printEvenNumbers(int from, int to){
        System.out.println("printEvenNumbers(" + from + ", " + to + ")");

        for (int i = from; i <= to ; ++i) {
            if (i % 2 == 0) {
                System.out.print(i);
                if (i < to - 1){
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }

    public static void countRewind(int from, int to) {
        System.out.println("countRewind(" + from + ", " + to + ")");

        for (int i = from; i >= to; i--) {
            System.out.print(i);
            if (i > to){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}

