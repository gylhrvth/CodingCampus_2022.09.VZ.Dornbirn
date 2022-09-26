package martin.week02;

import martin.week01.MethodenUndSchleifen;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class UserInput {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
/*
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
*/

    public static void main(String[] args) {
        //System.out.println(readUserInputString("Geben sie bitte etwas ein"));
        //System.out.println(readUserInputInt(2000000,-2000000,"Geben sie bitte eine Zahl zwischen %d und %d ein.%n"));
        //System.out.println(readUserInputGuessingGame(100, 0));
        //System.out.println(readUserInputMenu());
        //readUserCalculatorWeiter();
        //Visitenkarte();
        mastermind();
    }

    public static String readUserInputString(String firstPrompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(firstPrompt);
        return sc.nextLine();
    }

    public static int readUserInputInt(int zahlMax, int zahlMin, String firstPrompt) {
        Scanner sc = new Scanner(System.in);
        int zahl = Integer.MIN_VALUE;
        System.out.printf(firstPrompt, zahlMax, zahlMin);
        do {
            try {
                zahl = sc.nextInt();
                if (zahl >= zahlMax) {
                    System.out.printf("Kleiner als %d.%n", zahlMax);
                    zahl = Integer.MIN_VALUE;
                } else if (zahl <= zahlMin) {
                    System.out.printf("Größer als %d.%n", zahlMin);
                    zahl = Integer.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Eingabe ist keine Ganzzahl.");
            }
            sc.nextLine();
        } while (zahl == Integer.MIN_VALUE);
        return zahl;
    }

    public static float readUserInputFloat(float zahlMin, float zahlMax, String firstPrompt) {
        Scanner sc = new Scanner(System.in);
        float zahl = Float.MIN_VALUE;
        System.out.printf(firstPrompt, zahlMax, zahlMin);
        do {
            try {
                zahl = sc.nextFloat();
                if (zahl >= zahlMax) {
                    System.out.printf("Kleiner als %.2f.%n", zahlMax);
                    zahl = Float.MIN_VALUE;
                } else if (zahl <= zahlMin) {
                    System.out.printf("Größer als %.2f.%n", zahlMin);
                    zahl = Float.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Eingabe ist keine Zahl.");
            }
            sc.nextLine();
        } while (zahl == Float.MIN_VALUE);
        return zahl;
    }

    public static int readUserInputUnevenInt(int zahlMax, int zahlMin, String firstPrompt) {
        int ungZahl;
        System.out.printf(firstPrompt);
        do {
            ungZahl = readUserInputInt(zahlMax, zahlMin, "");
            System.out.println("Eine ungerade Zahl, bitte.");
        } while (ungZahl % 2 == 0);
        return ungZahl;
    }

    public static String readUserInputGuessingGame(int maxRand, int minRand) {
        int randNum = new Random().nextInt(maxRand);
        int guessNum;
        System.out.println("Willkommen beim super coolen Zahlen Ratespiel!");
        System.out.println("Errate die Zahl zwischen " + maxRand + " und " + minRand + "!");
        System.out.println("Gib die Zahl nun ein.");
        String win = "Du hast gewonnen!!!";
        do {
            guessNum = readUserInputInt(maxRand, minRand, "");
            try {
                if (guessNum > randNum) {
                    System.out.println("Die Zahl ist zu hoch!");
                    guessNum = Integer.MIN_VALUE;
                } else if (guessNum < randNum) {
                    System.out.println("Die Zahl ist zu niedrig!");
                    guessNum = Integer.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Eingabe ist keine Ganzzahl.");
            }
        } while (guessNum == Integer.MIN_VALUE);
        return win;
    }

    public static boolean readUserInputBool(String frageBool) {
        System.out.println(frageBool + " (j/n)");
        Scanner sc = new Scanner(System.in);
        String jaNeinD;
        boolean jaNein = false;
        boolean jaNeinA = false;
        do {
            jaNeinD = sc.next();
            if (Objects.equals(jaNeinD, "j")) {
                jaNein = true;
                jaNeinA = true;
            } else if (Objects.equals(jaNeinD, "n")) {
                jaNeinA = true;
            } else {
                System.out.println("j für Ja oder n für Nein, bitte.");
            }
            sc.nextLine();
        } while (!jaNeinA);
        return jaNein;
    }

    public static String readUserInputMenu() {
        System.out.printf("Willkommen bei meinen Aufgaben!%n");
        String menuEnd = "Auf Wiedersehen!";
        String sA = "Welches Zeichen soll verwendet werden?";
        boolean weiter;
        do {
            int zeichnen = readUserInputInt(4, 0, "Was möchten Sie zeichnen?%n1) Christbaum%n2) Quader%n3) Rhombus%n");
            if (zeichnen == 1) {
                int ctL = readUserInputUnevenInt(100, 4, "Wie groß soll der Baum sein?%n");
                MethodenUndSchleifen.printChristmasTree(ctL);
            } else if (zeichnen == 2) {
                int esL = readUserInputInt(55, 0, "Wie groß soll der Quader sein?%n");
                String esS = readUserInputString(sA);
                MethodenUndSchleifen.printEmptySquare(esS, esL);
            } else if (zeichnen == 3) {
                int rL = readUserInputInt(45, 0, "Wie groß soll der Rhombus sein?%n");
                String rS = readUserInputString(sA);
                MethodenUndSchleifen.printRhombus2(rS, rL);
            }
            weiter = readUserInputBool("Möchten Sie noch etwas zeichnen?");
        } while (weiter);
        return menuEnd;
    }

    public static double readUserCalculator() {
        double ergebnis = readUserInputFloat(-20f, 20f, "Geben sie bitte eine Zahl ein%n");
        double memory = 0;
        float zahl2;
        int operator;
        boolean weiterRechnen;
        do {
            do {
                do {
                    operator = readUserInputInt(10, 0, "Welcher Operand soll verwendet werden?%n1)   +     2)    -    3)    *    4)    ^    5)   /%n6) MemoClear 7) MemoAdd 8) MemoSub 9) MemoRecall%n");
                    if (operator == 6) {
                        memory = 0;
                    } else if (operator == 7) {
                        memory = memory + ergebnis;
                    } else if (operator == 8) {
                        memory = memory - ergebnis;
                    } else if (operator == 9) {
                        ergebnis = memory;
                    }
                } while (operator >= 6);
                zahl2 = readUserInputFloat(-20f, 20f, "Geben sie bitte eine Zahl ein%n");
                if (operator == 1) {
                    ergebnis = ergebnis + zahl2;
                    System.out.printf("Ergebnis: " + String.format("%s%.5f%s%n", ANSI_YELLOW, ergebnis, ANSI_RESET));
                } else if (operator == 2) {
                    ergebnis = ergebnis - zahl2;
                    System.out.printf("Ergebnis: " + String.format("%s%.5f%s%n", ANSI_YELLOW, ergebnis, ANSI_RESET));
                } else if (operator == 3) {
                    ergebnis = ergebnis * zahl2;
                    System.out.printf("Ergebnis: " + String.format("%s%.5f%s%n", ANSI_YELLOW, ergebnis, ANSI_RESET));
                } else if (operator == 4) {
                    ergebnis = Math.pow(ergebnis, zahl2);
                    System.out.printf("Ergebnis: " + String.format("%s%.5f%s%n", ANSI_YELLOW, ergebnis, ANSI_RESET));
                } else if (operator == 5) {
                    ergebnis = ergebnis / zahl2;
                    System.out.printf("Ergebnis: " + String.format("%s%.5f%s%n", ANSI_YELLOW, ergebnis, ANSI_RESET));
                }
            } while (operator == 0);
            weiterRechnen = readUserInputBool("Wollen sie mit dem Ergebnis weiterrechnen?");
        } while (weiterRechnen);
        return ergebnis;
    }

    public static void readUserCalculatorWeiter() {
        boolean weiter;
        do {
            System.out.println(readUserCalculator());
            weiter = readUserInputBool("Wollen sie noch eine Rechnung durchführen?");
        } while (weiter);
    }

    public static void Visitenkarte() {
        String name = readUserInputString("Geben sie bitte ihren Namen an.");
        int a = 4;
        int b = 5;
        int c = 6;
        String topBot = ("*" + "-".repeat(45) + "*");
        System.out.println(topBot);
        System.out.println(topBot);
        System.out.println(topBot);
        System.out.println(topBot);
        System.out.println(topBot);
        System.out.println(topBot);
        System.out.println(topBot);
        System.out.println("|" + " ".repeat(a) + name + " ".repeat(a) + "|");
        System.out.println("|" + " ".repeat(b) + name + " ".repeat(b) + "|");
        System.out.println("|" + " ".repeat(c) + name + " ".repeat(c) + "|");
        System.out.println("|" + " ".repeat(45) + "|");
        System.out.println(topBot);
    }

    public static void mastermind() {
        System.out.printf("%sInitialisiere Mastermind%s%n",ANSI_RED,ANSI_RESET);
        Random rand = new Random();
        int firstNumber = randomDiffNumbers(rand, -1,-1,-1);
        int secondNumber = randomDiffNumbers(rand, firstNumber,-1,-1);
        int thirdNumber = randomDiffNumbers(rand, firstNumber,secondNumber,-1);
        int fourthNumber = randomDiffNumbers(rand, firstNumber,secondNumber,thirdNumber);
        //System.out.println(firstNumber + "" + secondNumber + "" + thirdNumber + "" + fourthNumber);
        int kor = 0;
        int vorh = 0;
        int versuche = 21;

        for (int v = 1; v <= versuche-1; v++) {
            if (kor == 4) {
                System.out.println("Gratuliere Superhirn!\nHat nur " + v + " Versuch(e) gebraucht.");
                break;
            } else if (v == versuche-1) {
                System.out.println("Schwache Leistung");
                break;
            } else {
                int guess = readUserInputInt(10000, -1, String.format("Input %d: ", v));
                int guessNum1 = guess / 1000;
                int guessNum2 = guess / 100 - guessNum1 * 10;
                int guessNum3 = guess / 10 - guessNum1 * 100 - guessNum2 * 10;
                int guessNum4 = guess - guessNum1 * 1000 - guessNum2 * 100 - guessNum3 * 10;
                if (guessNum1 == firstNumber) {
                    kor++;
                } else if (guessNum1 == secondNumber || guessNum1 == thirdNumber || guessNum1 == fourthNumber) {
                    vorh++;
                }
                if (guessNum2 == secondNumber) {
                    kor++;
                } else if (guessNum2 == firstNumber || guessNum2 == thirdNumber || guessNum2 == fourthNumber) {
                    vorh++;
                }
                if (guessNum3 == thirdNumber) {
                    kor++;
                } else if (guessNum3 == firstNumber || guessNum3 == secondNumber || guessNum3 == fourthNumber) {
                    vorh++;
                }
                if (guessNum4 == fourthNumber) {
                    kor++;
                } else if (guessNum4 == firstNumber || guessNum4 == secondNumber || guessNum4 == thirdNumber) {
                    vorh++;
                }
                System.out.println("Korrekte Ziffer(n) " + kor + ". " + vorh + " weitere Ziffern sind vorhanden.");
                if (kor<4) {
                    kor = 0;
                }
                vorh = 0;
            }
        }
    }

    private static int randomDiffNumbers(Random random, int notThatOneNumber, int notThatSecondNumber, int notThatThirdNumber) {
/*        int randomNumber = random.nextInt(10);
        if (randomNumber == notThatNumber) {
            return randomNumber(random, notThatNumber);
        }
        return randomNumber;*/
        int randomNumber;
        do {
            randomNumber = random.nextInt(10);
        } while (randomNumber == notThatOneNumber || randomNumber == notThatSecondNumber || randomNumber == notThatThirdNumber);
        return randomNumber;
    }
}
