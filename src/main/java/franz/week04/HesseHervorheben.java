package franz.week04;

import lukas.data.Texts;

import java.util.Scanner;

public class HesseHervorheben {
    public static void main(String[] args) {
        String text = Texts.HESSE;

      // userinput();
       countHesse(text);


    }

    public static String userinput() {
        Scanner us = new Scanner(System.in);
        System.out.println("Geben Sie Ihren suchbegriff ein!");
        return us.nextLine();
    }


    private static void countHesse(String text) {
        System.out.println( text.indexOf("Hesse"));
        System.out.print(text.substring(124,270));
    }

private static void indexsurch(String text){

}
}

