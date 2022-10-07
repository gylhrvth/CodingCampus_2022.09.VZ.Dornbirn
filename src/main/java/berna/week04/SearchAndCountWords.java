package berna.week04;

import lukas.data.Texts;

public class SearchAndCountWords {
    // exercise: Where is the word "Hesse"? And how often can you find it?
    // exercise 2: Find "Hesse" and replace it with "HESSE"

    public static void main(String[] args) {
        //input text
        String text = Texts.HESSE;
        searchAndCountWords(text, "Hesse");

        //highlight the word in the text
        String highlighted = highlightWordInText(text, "Hesse", "HESSE");
        System.out.println(highlighted);

        //write a chosen word with Uppercase
        String uppercase = highlightWordInText2(text,"Hesse");
        System.out.println(uppercase);

    }




    public static void searchAndCountWords(String inputText, String searchfor) {


        int index = inputText.indexOf(searchfor);
        int count = 0;
        System.out.println();
        System.out.println("You looked for '" + searchfor + "' which can be found at index: ");
        System.out.println();

        while (index != -1) {
            System.out.print(" " + index);
            index = inputText.indexOf(searchfor, index + 1); //where is the word you look for?
            count = count + 1; //how often occurs it?
        }

        System.out.println("\n");
        System.out.println("The word '" + searchfor + "' exists " + count + " times.");

    }

    public static String highlightWordInText(String inputText, String searchfor, String replacewith) {

        String highlighted = inputText.replaceAll(searchfor, replacewith);
        return highlighted;

    }

    private static String highlightWordInText2(String inputText, String searchfor) {
        String highlighted = inputText.replaceAll(searchfor, searchfor.toUpperCase());
        return highlighted;
    }

}
