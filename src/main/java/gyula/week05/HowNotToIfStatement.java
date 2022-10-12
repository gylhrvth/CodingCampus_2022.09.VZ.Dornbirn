package gyula.week05;

public class HowNotToIfStatement {
    public static void main(String[] args) {
        System.out.println("1");
        if (true)
        System.out.println("2");
        System.out.println("3");
        if (false)
        System.out.println("4");
        System.out.println("5");
        if (false) {
        System.out.println("6");
        System.out.println("7");
        }
        System.out.println("8");
        boolean t = true;
        while (t); {
            System.out.println("9");
            t = false;
        }
        System.out.println("10");

    }
}
