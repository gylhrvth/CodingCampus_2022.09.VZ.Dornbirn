package milan.week04;

import lukas.data.Texts;

import java.util.Arrays;

public class StringHesseHervorheben {

    public static void main(String[] args) {

        String text = Texts.HESSE;
        //text.replace("Hesse", "HESSE");
        String[] splitText = text.split("\\s");
        System.out.println(Arrays.toString(splitText));


        for (int i = 0; i < splitText.length; i++) {
            splitText[i] = splitText[i].replace("Hesse", "HESSE");  //splitText[i] = splitText[i]replace... <--- weil die Änderung ein neuen String erstellt

        }
        System.out.println(Arrays.toString(splitText));
    }
}
