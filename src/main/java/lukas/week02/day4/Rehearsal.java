package lukas.week02.day4;

import java.util.Scanner;

public class Rehearsal {
    public static void main(String[] args) {
        //System.in -> Konsoleninput
        //Der Scanner ist ein Tokenizer
        //Er splittet den Input in Tokens (Teile)
        Scanner scanner = new Scanner(System.in);

//        //Ich will eine Zeile vom Benutzer einlesen:
//        String input = scanner.nextLine(); //Liest bis zum Zeilenumbruch
//        System.out.println("Line: " + input);
//
//        //Ich will ein Wort einlesen
//        String input2 = scanner.next(); //Liest bis zum nächsten Wort
//        System.out.println("Word: " + input2);
//
//        //Ich will eine Ganzzahl einlesen
//        int myNumber = scanner.nextInt(); //Liest die nächste Zahl
//        System.out.println("Number: " + myNumber);
//
//        //Ich will eine Fließkommazahl mit doppelter Genauigkeit
//        double myNumber2 = scanner.nextDouble();
//        System.out.println("Double: "+myNumber2);

        System.out.println("Read number: " + readNumber());
        System.out.println("Read number super: " + readNumber2("Please enter a number between 1 and 20", 1, 20));
    }

    public static int readNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
//        int value = sc.nextInt();
//        return value;
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                sc.next();
            }
        }
    }

    public static int readNumber2(String prompt, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(prompt);
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                //Frage ob Zahl gut ist?
                if(number >= minValue && number <= maxValue) {
                    return number;
                }
            } else {
                System.err.println("Falsche Zahl!!!111");
                sc.nextLine();
            }
        }
    }
}
