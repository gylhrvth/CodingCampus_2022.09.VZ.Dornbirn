package gyula.week01;

public class CountingWithFunction {
    public static void main(String[] args) {
        counting("Gyula", 5, 10);
        counting("Viktor", 0, 10);
        counting("Batuhan", 18, 20);
        System.out.println("Diff is " + difference(0, 10));
    }

    public static int difference(int from, int to){
        return to - from;
    }

    public static void counting(String titel, int from, int to){
        System.out.print(titel + ": ");
        for (int i = from; i < to; i++) {
            if (i > from){
                System.out.print(", ");
            }
            System.out.print(i);
        }
        System.out.println();
    }
}
