package stefan.Test;


public class SelbstKontrolle {

    public static void main(String[] arr) {
        System.out.println("Aufgabe1" + "\n");
        aufgabe1();
        System.out.println("\n" + "Aufgabe 2" + "\n");
        aufgabe2();
        System.out.println("\n" + "Aufgabe3" + "\n");
        aufgabe3();
        System.out.println("\n" + "Methoden Aufgabe4" + "\n");
        aufgabe4("x", 10);
        System.out.println("\n" + "Aufgabe5" + "\n");
        aufgabe5("x", 3);
        System.out.println("Aufgabe6");
        System.out.print(aufgabe4("x",3-1));
        System.out.println();
        System.out.print(aufgabe5("x",3-1));
    }

    public static void aufgabe1() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void aufgabe2() {
        for (int i = -30; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }


        }
    }

    public static void aufgabe3() {
        int number = 0;
        while (number <= 10) {
            if (number > 6) {
                System.out.println();
            }
            System.out.println(number);
            number++;

        }
    }


    public static String aufgabe4(String text, int zahl) {
        for (int i = 0; i < zahl; i++) {
            System.out.print(text);

        }
        return text;


    }

    public static String aufgabe5(String text, int zahl) {
        for (int i = 0; i < zahl; i++) {

            System.out.println(text);

        }
    return text;
    }



}