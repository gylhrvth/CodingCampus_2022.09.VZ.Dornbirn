package stefan.week08;

public class VarArgsExample {
    public static void main(String[] args) {
        printNumbers(1);
        printNumbers(1, 2);
        printNumbers(1, 2, 3);
        printNumbers(1, 2, 3, 4);
    }

    private static void printNumbers(Integer... integers){
        boolean first = true;
        for (Integer i: integers){
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(i);
            first = false;
        }
        System.out.println();
    }
}
