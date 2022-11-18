package franz.week01;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        String eingabe = userEingabeText();
        int value = userEingabeZahl();
        for (int i = 0; i < value; i++) {
            System.out.println(eingabe);
        }


    }

    public static String userEingabeText() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie einen Text ein");
        String line = sc.nextLine();

        return line;
    }

    public static int userEingabeZahl() {

        Scanner sci = new Scanner(System.in);
        System.out.println("Geben sie eine Ganzzahl ein");
        while (true) {
            if (sci.hasNextInt()) {
                int value = sci.nextInt();
                return value;
            } else {
                System.out.println("Geben Sie eine Ganzzahl ein!!!!!!!!!!!!!!");
                sci.next();
            }
        }

    }

}