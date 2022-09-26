package alp.week03;

public class IncrementOperator {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        a++; // Increment, erhöht mit 1. wertet zuerst a aus und erhöht um 1
        ++b; // Increment, erhöht mit 1. erhöht zuerst b und wertet dann aus


        System.out.printf("a++ is %d%n", a);
        System.out.printf("++b is %d%n", b);

        System.out.printf("a is %d and b is %d.%n", a, b);
    }
}
