package mase.week04;

import lukas.data.Texts;

public class HesseText {
    public static void main(String[] args) {
        String sampleText = Texts.HESSE;
        System.out.println(sampleText);

        int index = sampleText.indexOf("Hesse");
        int count = 0;

        while (index != -1){
            System.out.print(index + " ");
            index = sampleText.indexOf("Hesse", index+1 );
            count+=1;
        }
        System.out.println();
        System.out.println("Es kommt " + count + " mal der Name Hess3 vor ");
    }


}
