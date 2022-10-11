package milan.week04;

import lukas.data.Texts;

public class StringHesse {

    public static void main(String[] args) {

        String text = Texts.HESSE;
        String[] splitText = text.split("\\s");
        int anzahl = countHesse(splitText);


        System.out.println();
        System.out.println("Hesse kommt " + anzahl + "mal vor!");


    }

    public static int countHesse(String[] text){
        int count = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i].contains("Hesse")) {
                count++;
                System.out.println("Hesse an folgender Position: " + i);
            }

        }
        return count;
    }

}