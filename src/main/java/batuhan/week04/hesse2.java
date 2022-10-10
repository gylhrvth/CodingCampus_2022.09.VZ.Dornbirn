package batuhan.week04;

import lukas.data.Texts;

import java.util.Arrays;
import java.util.Scanner;

public class hesse2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gib ein beliebiges Wort vom Text an!");
        String str = sc.nextLine();
//        text2(str);
        text3(str);

    }


    public static String UserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Herzlich Willkommen! ");
        System.out.println("Wie soll der Protoganist der Gesichte heißen? ");
        String str = sc.nextLine();
        return str;
    }



    public static void text3(String st1){
        String text = Texts.HESSE;
        String textwithupcase = text.replace(st1,st1.toUpperCase());
        System.out.println(textwithupcase);

    }

}
