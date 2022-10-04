package viktor.week04;

import java.util.Random;
import java.util.Scanner;

public class StringWithRandomize {

    public static String random() {


        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Gib mir bitte einen String an: ");
        String text = sc.nextLine();

        char[] newText = text.toCharArray();

        int size = text.length();

        int pos = 0;

        for (int i = 0; i < newText.length; i++) {

            pos = random.nextInt(size);
            char temp = newText[i];
            newText[i] = newText[pos];
            newText[pos] = temp;

        }

        String output = new String(newText);
        return output;


    }

    public static void main(String[] args) {


        System.out.println("Zufällig vertauscht: " + random());

    }
}
