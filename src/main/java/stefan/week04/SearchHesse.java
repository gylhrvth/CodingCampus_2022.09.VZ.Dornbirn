package stefan.week04;

import lukas.data.Texts;

public class SearchHesse {
    public static void main(String[] args) {

        String letter = Texts.HESSE;
        countletter(letter);


    }

    public static void countletter(String letter) {
        int index = letter.indexOf("Hesse");
        int count = 0;
        while (index != -1) {
            System.out.println(index + count+" ");
        }
        System.out.println();
    }
}