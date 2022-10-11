package gyula.week05;

public class Rekursion1 {
    public static void main(String[] args) {
        System.out.printf("%2d. Fibonacci Number: %8d\n", 10, fibo(10));

        /*
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%2d. Fibonacci Number: %8d\n", i, fibo(i));
        }
         */
    }

    public static int fibo(int param){
        System.out.println("fibo(" + param + ")");

        if (param <= 2) return 1;
        else return fibo(param - 1) + fibo(param - 2);
    }
}
