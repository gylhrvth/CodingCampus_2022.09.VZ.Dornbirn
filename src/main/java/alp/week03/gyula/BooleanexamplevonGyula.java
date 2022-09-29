package alp.week03.gyula;

public class BooleanexamplevonGyula {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        int a = 6;
        boolean b3 = (5 < a);
        boolean b4 = (7 <= a);
        boolean b5 = (8 != a);
        boolean b6 = (9 == a);
        String text = "Apfel";
        boolean b7 = text.equals("Birne");

        boolean b8 = !b7; // Not b7
        boolean b9 = b7 || b8; // Oder
        boolean b10 = b7 && b8; // Und

        System.out.println("!false is " + !false);
        System.out.println("!true is " + !true);
        System.out.println();

        System.out.println("false oder false is " + (false || false));
        System.out.println("false oder true is " + (false || true));
        System.out.println("true oder false is " + (true || false));
        System.out.println("true oder true is " + (true || true));
        System.out.println();

        System.out.println("false und false is " + (false && false));
        System.out.println("false und true is " + (false && true));
        System.out.println("true und false is " + (true && false));
        System.out.println("true und true is " + (true && true));

    }
}

