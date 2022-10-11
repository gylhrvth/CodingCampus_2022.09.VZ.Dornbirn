package stefan.week04;

import lukas.data.Texts;

public class SearchHesse {
    public static void main(String[] args) {

        String letter = Texts.HESSE;
        System.out.println(countletter(letter) + " Hesse has been found.");
        System.out.println(letter);

    }

    public static int countletter(String letter) {
        int counter = 0;

        int index = 0;
        while (true) {
            index = letter.indexOf("Hesse", index);
            if (index >= 0) {
                ++counter;
                ++index;
            } else {
                break;
            }
        }
        return counter;
    }
}
