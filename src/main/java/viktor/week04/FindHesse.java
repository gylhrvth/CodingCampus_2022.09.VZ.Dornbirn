package viktor.week04;

import lukas.data.Texts;

public class FindHesse {


    public static void main(String[] args) {


        String text = Texts.HESSE;
        String[] stringText = text.split("\\s");

        int count = 0;

        for (int i = 0; i < stringText.length; i++) {
            boolean b = true;

            if (stringText[i].contains("Hesse") == b) {
                count++;
                System.out.println(" Hesse's index: " + i);

            }
        }
        System.out.println();
        System.out.println("Hesse comes " + count + " times for!");

    }
}
