package batuhan.week04;

import lukas.data.Texts;

import java.util.Arrays;


public class Hesse {
    public static void main(String[] args) {


        String text = Texts.HESSE;
//        String upcase = text.replace("Hesse", "HESSE");
        String[] upcase = text.split("\\s");//Wandelt jedes Wort im Text in ein Array um

//        printCharacters(text);

        for (int i = 0; i < upcase.length; i++) {
           upcase[i] = upcase[i].replace("Hesse", "HESSE");


        }


        System.out.println(Arrays.toString(upcase));

    }

//    public static void printCharacters(String str) {
//        int counter = 0;
//        String[] arr = str.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].contains("Hesse")) {
//                counter++;
//
//
//            }
//
//        }
//        System.out.println("Das Wort Hesse wurde: " + counter + " gefunden!");
//    }
}
