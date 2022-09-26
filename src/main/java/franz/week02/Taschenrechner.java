package franz.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
                menue();
        newCalculation();

    }
    public static void menue()
    {System.out.println("Wilkommen beim Taschenrechner!!");
        System.out.println("Geben Sie eine Ganzzahl ein");
    float n1 = readN();
        System.out.println("Geben Sie die zweite Ganzzahl ein");
    float n2 = readN();
        System.out.println("Wählen Sie einen Operator.");
        System.out.println("+\n-\n*\n/\n^\n");
    operator(n1, n2);}
    public static float readN() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Geben Sie eine Ganzzahl ein");
                sc.next();
            }
        }
    }
    public static void operator(float n1, float n2) {
        Scanner scanner = new Scanner(System.in);
        String op = "";

        while (op.equals("")) {
            op = scanner.nextLine();

            if (op.equals("+")) {
                System.out.println("Ergebnis: " + (n1 + n2));
            } else if (op.equals("-")) {
                System.out.println("Ergebnis: " + (n1 - n2));
            } else if (op.equals("*")) {
                System.out.println("Ergebnis: " + (n1 * n2));
            } else if (op.equals("/")) {
                System.out.println("Ergebnis: " + (n1 / n2));
            } else if (op.equals("^")) {
                System.out.println("Ergebnis: " + Math.pow(n1,n2));
            } else {
                op = "";
                System.out.println("Gebe einen Operator ein");
            }
        }
    }
    public static void newCalculation(){

    System.out.println("Wollen Sie noch eine Rechnung ausführen? (j/n)");
        Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
     if (s.equals("j")) {
         menue();
    }
     else {
         System.out.println("Tschau");
    }}
}



