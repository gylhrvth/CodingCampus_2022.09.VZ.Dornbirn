package milan.week04;

import lukas.data.Texts;

import java.util.Arrays;
import java.util.Scanner;

public class StringHesseHervorheben {

    public static void main(String[] args) {

        String text = Texts.HESSE;
        
        System.out.println("Bitte das zu verändernde Wort eingeben: ");
        String input = userInput();
        reDoInputToUppercase(text, input);


    }

    public static void reDoInputToUppercase(String text, String input) {
        String text2 = text.replaceAll(input, input.toUpperCase());
        if (text.equals(text2)){
            System.out.println("Wort ist nicht im Text vorhanden!!!");
        } else {
            System.out.println(text2);
        }
    }


    public static String userInput() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }
}
