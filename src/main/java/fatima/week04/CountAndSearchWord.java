package fatima.week04;

import lukas.data.Texts;

public class CountAndSearchWord {
    public static void main(String[] args) {
        String text = Texts.HESSE;
        System.out.println(text);
        String word = "Hesse";
        System.out.println("--------------------------------------------");
        System.out.println("The word " + word + " occurs in the following places: ");
        System.out.println("The word " + word + " occurs " + counter(text, word) + " times in the text.");
    }

    public static int counter(String text, String word) {
        String[] a = text.split(" ");
        int count = 0;
        boolean firstHesse = true;
        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i])) {
                ++count;
                if (!firstHesse) {
                    System.out.print(", ");
                } else {
                    firstHesse = false;
                }
                System.out.print(i);
            }
        }
        System.out.println("\n");
        return count;
    }
}


