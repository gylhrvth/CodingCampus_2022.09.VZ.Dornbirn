package michel.week04;

import lukas.data.Texts;

public class SearchHesse {
    public static void main(String[] args) {
        String sampleText = Texts.HESSE;
        System.out.println(sampleText);


        int index = sampleText.indexOf("Hesse");
        int count = 0;
        while (index != -1) {
            System.out.println( index + "");
            index = sampleText.indexOf("Hesse", index + 1);
            count += 1;
        }
        System.out.println("Das Wort Hesse kommt: " + count + " mal im Text vor!");
    }
}
