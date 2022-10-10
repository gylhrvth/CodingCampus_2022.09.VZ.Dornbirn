package mase.week04;

import lukas.data.Texts;

import java.util.Scanner;

public class HesseUpperCase {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String sampleText = Texts.HESSE;
        System.out.println(sampleText);
        userInputUpper(sampleText);
//       String hesse = sampleText.replace("Hesse", "HESSE");
//        System.out.println(hesse);

    }
    public static void userInputUpper(String sampleText){
        System.out.println("Tippen Sie ein Wort ein: ");
        String userInput = sc.nextLine();
        String upperUserInput = sampleText.replace(userInput,userInput.toUpperCase());
        System.out.println(upperUserInput);
    }
}
