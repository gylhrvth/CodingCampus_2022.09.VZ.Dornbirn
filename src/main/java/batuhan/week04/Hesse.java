package batuhan.week04;

import lukas.data.Texts;

public class Hesse {
    public static void main(String[] args) {


        String text = Texts.HESSE;
        System.out.println(text);
        printCharacters(text);


    }

    public static void printCharacters(String str){
        int counter =0;
        String[] arr = str.split(" ");
        for (int i = 0; i <arr.length; i++) {
            if (arr[i].contains("Hesse") ){
                counter++;


            }

        }
        System.out.println("Das Wort Hesse wurde: "+counter +" gefunden!");
    }
}
