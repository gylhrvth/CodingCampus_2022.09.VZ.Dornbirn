package michel.week04;

import lukas.data.Texts;

import java.util.Scanner;

public class HighlightTextUppercase {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String sampleText = Texts.HESSE;
        System.out.println(sampleText);
        replaceWithUserInput(sampleText);
//      replaceWithoutUserInput(sampleText);
    }

    private static void replaceWithUserInput(String sampleText) {
        System.out.println("Bitte geben Sie ein Wort an dass Sie in Großbuchstaben umwandeln möchten:");
        String userInput = sc.nextLine();
        String newText = sampleText.replace(userInput, userInput.toUpperCase());
        System.out.println(newText);
    }

//    private static void replaceWithoutUserInput(String sampleText) {
//        String newText = sampleText.replace("Hesse", "HESSE");
//        System.out.println(newText);
//    }
}
