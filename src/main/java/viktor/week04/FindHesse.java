package viktor.week04;

import lukas.data.Texts;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindHesse {


    public static void main(String[] args) {


        String text = Texts.HESSE;
        String[] stringText = text.split("\\s");

        int count = 0;

        for (int i = 0; i < stringText.length; i++) {
            boolean b = true;

            if (stringText[i].contains("Hesse") == b) {
                count++;
                System.out.println(" Hesse's wordindex: " + i);

            }
        }
        System.out.println();
        System.out.println("Hesse comes " + count + " times for!");


        //Indexof


        Pattern pattern = Pattern.compile("Hesse ([a-zA-Zßüöä]+)");
        Matcher matcher = pattern.matcher(text);
        int count2 = 0;
        while(matcher.find()) {
            System.out.println(matcher.start());
            System.out.println(matcher.group(1));
            count2++;
        }
        System.out.println(count2);

    }
}
