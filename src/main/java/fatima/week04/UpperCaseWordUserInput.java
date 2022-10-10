package fatima.week04;

import lukas.data.Texts;

import java.util.Scanner;

public class UpperCaseWordUserInput {
    public static void main(String[] args) {
        String text = Texts.HESSE;
        String word = text.replace("Hesse", "HESSE");
        System.out.println(word);
        userInput(text);
    }

    public static void userInput(String text) {
        System.out.println("Which word do you want to change on upperCase?");
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String upperCase = text.replace(line, line.toUpperCase());
        System.out.println(upperCase);
    }
}

