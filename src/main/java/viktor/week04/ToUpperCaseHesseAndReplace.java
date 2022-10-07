package viktor.week04;

import lukas.data.Texts;

import java.util.Scanner;

public class ToUpperCaseHesseAndReplace {

    public static void printToUpperCase(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Gib mir bitte ein Wort an!");
        String text = sc.nextLine();

        System.out.println(text.toUpperCase());

    }

    public static void writeAllHesseToUppercase(){

        String text = Texts.HESSE;
        String pattern = "Hesse";
        String toUpperCase = pattern.toUpperCase();
        String replacedText = text.replace(pattern,toUpperCase);
        System.out.println(replacedText);
    }



    public static void main(String[] args) {

        printToUpperCase();
        System.out.println();
        //writeAllHesseToUppercase();





    }

}
