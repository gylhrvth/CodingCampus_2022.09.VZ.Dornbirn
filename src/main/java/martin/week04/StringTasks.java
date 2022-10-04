package martin.week04;

import martin.week01.MethodenUndSchleifen;
import martin.week02.UserInput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import lukas.data.Texts;

public class StringTasks {
    private static final Random rand = new Random();

    public static void main(String[] args) {
        MethodenUndSchleifen.head("#", "Bubblesort mit Strings");
        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Martin", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        System.out.println("Namensliste Standard:    " + Arrays.toString(names));
        String[] sortedNamesAuf = MakeACopy(names);
        sortedNamesAuf = bubblesortStringAufsteigend(names);
        System.out.println("Namensliste Aufsteigend: " + Arrays.toString(sortedNamesAuf));
        String[] sortedNamesAb = MakeACopy(names);
        sortedNamesAb = bubblesortStringAbsteigend(names);
        System.out.println("Namensliste Absteigend:  " + Arrays.toString(sortedNamesAb) + "\n" );

        MethodenUndSchleifen.head("#", "Bubblesort mit String Extended");
        String[] sortedNamesAufExt = BubblesortStringAufOdAb(names, true);
        System.out.println(Arrays.toString(sortedNamesAufExt));
        String[] sortedNamesAbExt = BubblesortStringAufOdAb(names, false);
        System.out.println(Arrays.toString(sortedNamesAbExt) + "\n" + "\n");

        MethodenUndSchleifen.head("#", "Bubblesort mit Strings an Character Index");
        int sortierIndex = 2;
        String[] sortedByCharIndex = bubblesortStringByCharIndex(names, sortierIndex);
        System.out.printf("Namensliste nach Index %d: %s: %n%n", sortierIndex, Arrays.toString(sortedByCharIndex));

        MethodenUndSchleifen.head("#", "Reverse");
        String reverseWord = UserInput.readUserInputString("Geben sie bitte ein Wort ein, welches umgedreht werden soll.");
        System.out.println(reverseString(reverseWord) + "\n" + "\n");

        MethodenUndSchleifen.head("#", "Randomize");
        String randomizeWord = UserInput.readUserInputString("Geben sie bitte ein Wort ein, welches zufällig rearrangiert werden soll.");
        System.out.println(randomizeString(randomizeWord) + "\n" + "\n");

        MethodenUndSchleifen.head("#", "Buchstaben zählen");
        String sampleText = lukas.data.Texts.getSimpleText();
        System.out.println(sampleText);
        printBuchstabenZaehlen(buchstabenZaehlen(sampleText));
    }

    public static String[] MakeACopy(String[] makeACopyOf) {
        String[] copy = new String[makeACopyOf.length];
        System.arraycopy(makeACopyOf, 0, copy, 0, makeACopyOf.length);
        return copy;
    }

    public static String[] BubblesortStringAufOdAb(String[] stringArray, boolean aufsteigendElseAbsteigend) {
        if (aufsteigendElseAbsteigend) {
            return bubblesortStringAufsteigend(stringArray);
        } else {
            return bubblesortStringAbsteigend(stringArray);
        }
    }

    public static String[] bubblesortStringAufsteigend(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j + 1 < stringArray.length; j++) {
                if ((stringArray[j].compareTo(stringArray[j + 1])) > 0) {
                    String name = stringArray[j];
                    stringArray[j] = stringArray[j + 1];
                    stringArray[j + 1] = name;
                }
            }
        }
        return stringArray;
    }

    public static String[] bubblesortStringAbsteigend(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j + 1 < stringArray.length; j++) {
                if ((stringArray[j].compareTo(stringArray[j + 1])) < 0) {
                    String name = stringArray[j];
                    stringArray[j] = stringArray[j + 1];
                    stringArray[j + 1] = name;
                }
            }
        }
        return stringArray;
    }

    public static String[] bubblesortStringByCharIndex(String[] stringArray, int indexStelle) {
        for (String s : stringArray) {
            if (s.length() <= indexStelle) {
                System.out.println("Liste kann nicht nach diesem Index sortiert werden.");
                return stringArray;
            }
        }
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j + 1 < stringArray.length; j++) {
                if (stringArray[j].charAt(indexStelle) > stringArray[j + 1].charAt(indexStelle)) {
                    String name = stringArray[j];
                    stringArray[j] = stringArray[j + 1];
                    stringArray[j + 1] = name;
                }
            }
        }
        return stringArray;
    }

    public static String reverseString(String reverseString) {
        String reversedString;
        char[] splitString = reverseString.toCharArray();
        char[] newStringCharArray = new char[reverseString.length()];
        for (int i = 0; i < reverseString.length(); i++) {
            newStringCharArray[i] = splitString[reverseString.length() - 1 - i];
        }
        reversedString = new String(newStringCharArray);

        return reversedString;
    }

    public static String randomizeString(String toRandomizeString) {
        String randomizedString;
        int stringLaeng = toRandomizeString.length();
        if (stringLaeng > 0) {
            char[] splitString = toRandomizeString.toCharArray();
            char[] newStringCharArray = new char[toRandomizeString.length()];
            for (int i = 0; i < splitString.length; i++) {
                newStringCharArray[i] = splitString[i];
            }
            for (int i = 0; i < toRandomizeString.length(); i++) {
                int randInt = rand.nextInt(toRandomizeString.length());
                char Zeichen = newStringCharArray[i];
                newStringCharArray[i] = newStringCharArray[randInt];
                newStringCharArray[randInt] = Zeichen;
            }
            randomizedString = new String(newStringCharArray);
            return randomizedString;
        }
        randomizedString = "";
        return randomizedString;
    }


    public static int[] buchstabenZaehlen(String text) {
        int[] asciiZaehler = new int[128];
        if (text.length() > 0) {
            char[] splitString = text.toCharArray();
            for (int i = 0; i < text.length(); i++) {
                for (int j = 0; j + 1 < text.length(); j++) {
                    if (splitString[j] > splitString[j + 1]) {
                        char name = splitString[j];
                        splitString[j] = splitString[j + 1];
                        splitString[j + 1] = name;
                    }
                }
            }
            for (char i = 0x00; i < 0x7F; i++) {
                for (int j = 0; j < splitString.length; j++) {
                    if (splitString[j] == i) {
                        asciiZaehler[i] += 1;
                    }
                }
            }
            // System.out.println(splitString);
            // System.out.println(Arrays.toString(asciiZaehler));
            return asciiZaehler;
        } else {
            return null;
        }
    }

    public static void printBuchstabenZaehlen(int[] indexAnzahlBuchstaben) {
        for (char i = 0x00; i < 0x7F; i++) {
                System.out.printf("%s : %d | ", i, indexAnzahlBuchstaben[i]);
            }
        }
    }
