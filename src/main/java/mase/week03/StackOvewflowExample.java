package mase.week03;

public class StackOvewflowExample {
    public static int counter = 0;
    public static void main(String[] args) {
        hello();
    }

    public static void hello(){

        while (true) {
            ++counter;
            System.out.printf("%5d. Hello World!%n", counter);
        }
    }
}
