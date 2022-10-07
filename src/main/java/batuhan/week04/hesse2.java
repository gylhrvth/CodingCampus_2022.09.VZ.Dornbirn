package batuhan.week04;

import lukas.data.Texts;

import java.util.Scanner;

public class hesse2 {


    public static void main(String[] args) {


        System.out.println("Herzlich Willkommen! ");
        System.out.println("Wie soll der Protoganist der Gesichte heißen? ");


//        System.out.println(text);
//        printCharacters(text);
//        String upcase = text.replace("Hesse", "HESSE");
//        System.out.println(upcase);
        Scanner sc = new Scanner(System.in);
        String text = readUserInputString();



    }

    public static void printCharacters(String str) {
        int counter = 0;
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(readUserInputString())) {
                counter++;


            }

        }
        System.out.println("Das Wort Hesse wurde: " + counter + " gefunden!");
    }
    public static String readUserInputString() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        return line;
    }
}



