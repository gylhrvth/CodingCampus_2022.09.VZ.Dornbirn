package martin.week04;

import martin.week01.MethodenUndSchleifen;
import martin.week02.UserInput;

import java.util.Arrays;
import java.util.Random;

public class StringTasks {
    private static final Random rand = new Random();
    private static final String devilsVerse = "In girum imus nocte et consumimur igni"; //Lateinisches Palindrom. "We circle in the night and are consumed by fire."
    public static final String derSossenTeufel = "Der ammoniakgelbe Soßenteufel stiehlt Socken am Samstag!"; //Kurzer Probetext
    private static final String creepyTestText = "l̴͕͔̞̞͈̻̗̩͗̔̅̏ȍ̶̡̧̲̻̼̞̺̲̮͎̳̯̟̹̠̋̑̎̊̇͊l̵̨̳͔̟͕̜̠͕͕̫̈́̀T̶͔̳̃͋̎͆́͑͂͌̐̅̒͠͝e̷̡̨̢̨͎͉͚̗̞̗͈͚̓̆̈́̋͂͊s̸̨͇͕̐̅͌͌̏̿̚͝͝͝t̵̨̨̢̲̝̃̐̄̈́͂̀́͠"; //anderer Probetext; Analyse ausständig

    public static void main(String[] args) {

        MethodenUndSchleifen.head("#", "Bubblesort mit Strings");
        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Martin", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        System.out.println("Namensliste Standard:    " + Arrays.toString(names));
        String[] sortedNamesAuf = bubblesortStringAufsteigend(makeACopy(names));
        System.out.println("Namensliste Aufsteigend: " + Arrays.toString(sortedNamesAuf));
        String[] sortedNamesAb = bubblesortStringAbsteigend(makeACopy(names));
        System.out.println("Namensliste Absteigend:  " + Arrays.toString(sortedNamesAb) + "\n");

        MethodenUndSchleifen.head("#", "Bubblesort mit String Extended");
        String[] sortedNamesAufExt = bubblesortStringAufOdAb(names, true);
        System.out.println(Arrays.toString(sortedNamesAufExt));
        String[] sortedNamesAbExt = bubblesortStringAufOdAb(names, false);
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
        System.out.println(randomizeString(randomizeWord) + "\n\n");

        MethodenUndSchleifen.head("#", "Buchstaben zählen");
        String sampleText = lukas.data.Texts.getSimpleText();
        System.out.println(sampleText);
        printBuchstabenZaehlen(buchstabenZaehlen(sampleText), 8);

        MethodenUndSchleifen.head("#", "Daten tabellarisch darstellen");
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        //printAltPersonalDatenTabelle(firstName,lastName,age,place,distanceFromCapital);  //Alternative Formatierung
        printPersonenDatenTabelle("Vorname", firstName, "Nachname", lastName, age, "Wohnort", place, distanceFromCapital);

        MethodenUndSchleifen.head("#", "Suche nach \"Hesse\"");
        String hessenText = lukas.data.Texts.HESSE;
        String findHesse = "Hesse";
        int[] wortHaeufigkeit = findWordAndAmount(hessenText, findHesse);
        System.out.print(findHesse + " wurde " + wortHaeufigkeit[0] + "-mal im Text an den Stellen\n");
        boolean wortHaeufFirstLine = true;
        for (int i = 1; i < wortHaeufigkeit[0]; i++) {
            if (wortHaeufFirstLine) {
                wortHaeufFirstLine = false;
            } else {
                System.out.print(", ");
            }
            System.out.printf("%d", wortHaeufigkeit[i]);
        }
        System.out.println(" im Text gefunden.\n");

        MethodenUndSchleifen.head("#", "Text \"Hesse\" hervorheben");
        String textToRepl = UserInput.readUserInputString("Welches Wort soll hervorgehoben werden");
        char[] excerptHessenText = new char[460];
        System.arraycopy(hessenText.toCharArray(), 0, excerptHessenText, 0, excerptHessenText.length);
        String newHessenText = new String(excerptHessenText);
        newHessenText = newHessenText.replace(textToRepl, String.format("%s%s%s", "\u001b[7m", textToRepl.toUpperCase(), "\u001b[0m"));
        System.out.println(newHessenText);

        MethodenUndSchleifen.head("#", "Längster gemeinsamer Substring");
        System.out.println("Unterpunkt 1:");
        String compSubstring1 = UserInput.readUserInputString("Geben sie das erste Wort ein, welches Verglichen werden soll.");
        String compSubstring2 = UserInput.readUserInputString("Geben sie das zweite Wort ein, welches Verglichen werden soll.");
        System.out.println("Längster gemeinsamer Substring");
        System.out.println(longestCommonSubstring(compSubstring1, compSubstring2));
        System.out.println("Unterpunkt 2: Bonus");
        System.out.println(longestCommonSubstring(sampleText, hessenText) + "\n");

        MethodenUndSchleifen.head("#", "Split");
        String tollTag = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";
        System.out.println(tollTag);
        String splitWord1 = UserInput.readUserInputString("Gibt bitte ein ab welchem Wort der Satz aufgespalten werden soll.");
        String[] words = wordSplit(tollTag, splitWord1);
        for (String word : words) {
            System.out.println(word);
        }

        MethodenUndSchleifen.head("#", "Split & Sort");
        String splitWord2 = UserInput.readUserInputString("Gibt bitte ein ab welchem Wort der Satz aufgespalten werden soll.");
        /*
        MethodenUndSchleifen.head("@", "Testkapitel");
        System.out.println(creepyTestText);
        printBuchstabenZaehlen(buchstabenZaehlen(creepyTestText), 8);
        */
    }

    public static String[] makeACopy(String[] makeACopyOf) {
        String[] copy = new String[makeACopyOf.length];
        System.arraycopy(makeACopyOf, 0, copy, 0, makeACopyOf.length);
        return copy;
    }

    public static String[] bubblesortStringAufOdAb(String[] stringArray, boolean aufsteigendElseAbsteigend) {
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

    public static String randomizeString(String stringToRand) {
        char[] newStringCharArray = stringToRand.toCharArray();
        for (int i = 0; i < stringToRand.length(); i++) {
            int randInt = rand.nextInt(stringToRand.length());
            char symbol = newStringCharArray[i];
            newStringCharArray[i] = newStringCharArray[randInt];
            newStringCharArray[randInt] = symbol;
        }
        return new String(newStringCharArray);
    }


    public static int[] buchstabenZaehlen(String text) {
        int[] symbolCount = new int[65535];
        for (int i = 0; i < text.length(); i++) {
            symbolCount[text.charAt(i)] += 1;
        }
        return symbolCount;
    }

    public static void printBuchstabenZaehlen(int[] indexAnzahlBuchstaben, int symbolsPerLine) {
        int lineLength = 0;
        for (char c = 0; c < indexAnzahlBuchstaben.length; c++) {
            if (indexAnzahlBuchstaben[c] != 0) {
                if (c <= 32) {
                    System.out.printf("%4s : %4d   ", Character.getName(c), indexAnzahlBuchstaben[c]);
                } else {
                    System.out.printf("%4s : %4d   ", c, indexAnzahlBuchstaben[c]);
                }
                lineLength++;
                if (c == 32) {
                    System.out.println();
                    lineLength = 0;
                } else if (lineLength >= symbolsPerLine) {
                    System.out.println();
                    lineLength = 0;
                }
            }
        }
        System.out.println("\n");
    }

    public static void printAltPersonalDatenTabelle(String[] vorname, String[] nachnamen, int[] alter, String[] wohnort, float[] abstZuHauptst) {
        System.out.print("Vorname                |");
        for (String value : vorname) {
            System.out.printf("%15s | ", value);
        }
        System.out.println();
        System.out.print("Nachname               |");
        for (String nachnaman : nachnamen) {
            System.out.printf("%15s | ", nachnaman);
        }
        System.out.println();
        System.out.print("Alter                  |");
        for (int j : alter) {
            System.out.printf("%15s | ", j);
        }
        System.out.println();
        System.out.print("Wohnort                |");
        for (String s : wohnort) {
            System.out.printf("%15s | ", s);
        }
        System.out.println();
        System.out.print("Abstand zur Hauptstadt |");
        for (float v : abstZuHauptst) {
            System.out.printf("%12.1f km | ", v);
        }
        System.out.println("\n");
    }

    public static void printPersonenDatenTabelle(String title1, String[] strArr1, String title2, String[] strArr2, int[] intValues1, String title3, String[] strArr3, float[] floatValues1) {
        int longestArr1 = title1.length() + 1;
        int longestArr2 = title2.length() + 1;
        int longestArr3 = title3.length() + 1;
        for (int g = 0; g < strArr2.length - 1; g++) {
            if (longestArr1 < strArr1[g].length()) {
                longestArr1 = strArr1[g].length();
            }
            if (longestArr2 < strArr2[g].length()) {
                longestArr2 = strArr2[g].length();
            }
            if (longestArr3 < strArr3[g].length()) {
                longestArr3 = strArr3[g].length();
            }
        }
        String formatText = "%s" + String.format(" %%%ds | ", longestArr1) + String.format("%%%ds | ", longestArr2) + "%5s | " + String.format("%%%ds | ", longestArr3) + "%21s %s%n";
        System.out.printf((formatText), "\u001B[7m", title1, title2, "Alter", title3, "Distanz zu Hauptstadt", "\u001B[0m");
        for (int i = 0; i < strArr1.length; i++) {
            System.out.printf((formatText), "\u001B[4m", strArr1[i], strArr2[i], intValues1[i], strArr3[i], String.format("%.1f km ", floatValues1[i]), "\u001B[0m");
        }
        System.out.println();
    }


    public static int[] findWordAndAmount(String text, String word) {
        int foundAmount = 0;
        int[] amountAndPlaces;
        int[] placeholderAmAndPla = new int[text.length()];
        char[] searchWord = word.toCharArray();
        char[] searchableText = text.toCharArray();
        if (word.length() > 0) {
            for (int i = 0; i < text.length(); i++) {
                if (searchableText[i] == searchWord[0]) {
                    boolean foundWord = false;
                    int amountRight = 0;
                    for (int j = 0; j < searchWord.length; j++) {
                        if (searchableText[i + j] == searchWord[j]) {
                            amountRight += 1;
                        }
                        if (amountRight == searchWord.length) {
                            foundWord = true;
                        }
                    }
                    if (foundWord) {
                        placeholderAmAndPla[0] += 1;
                        foundAmount += 1;
                        placeholderAmAndPla[foundAmount] = i;
                    }
                }
            }
        }
        amountAndPlaces = new int[foundAmount + 1];
        System.arraycopy(placeholderAmAndPla, 0, amountAndPlaces, 0, amountAndPlaces.length);
        return amountAndPlaces;
    }

    public static String longestCommonSubstring(String string1, String string2) {
        String commonSub = "";
        for (int i = 0; i < string1.length(); i++) {
            for (int j = i; j < string1.length(); j++) {
                String sub = string1.substring(i, j + 1);
                if (string2.contains(sub)) {
                    if (sub.length() > commonSub.length()) {
                        commonSub = sub;
                    }
                }
            }
        }
        return commonSub;
    }

    public static String[] wordSplit(String text, String splitWord) {
        int[] oldText = findWordAndAmount(text, splitWord);
        String[] betterText;
        if (oldText.length > 1) {
            System.out.println(Arrays.toString(oldText));
            int newStringAt = 0;
            betterText = new String[oldText.length];
            for (int i = 0; i < betterText.length; i++) {
                if (i + 1 < oldText.length) {
                    betterText[i] = text.substring(newStringAt, oldText[i + 1]);
                    newStringAt = oldText[i + 1] + splitWord.length();
                } else {
                    betterText[i] = text.substring(newStringAt);
                }
            }
        } else {
            betterText = new String[]{text};
        }
        return betterText;
    }

    public static String[] wordSplitSort(String text) {
        String[] splitSortText = new String[4];

        return splitSortText;
    }
}