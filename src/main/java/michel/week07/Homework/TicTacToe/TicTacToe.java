package michel.week07.Homework.TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    static Scanner sc = new Scanner(System.in);
    static String[] fields;
    static String player;
    static int round;
    static int choice;
    static boolean win;


    public static void main(String[] args) {
        //Variablen initialisieren:

        fields = new String[9];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = String.valueOf((i + 1));
        }
        player = "X";       //Erster Spieler
        round = 1;
        win = false;

        //Los gehts!
        System.out.println("\nWillkommen zum 3x3 TicTacToe!\n");

        //Startet das Spiel
        do {
            choice = userInput(); // geprüft, ob richtige Eingabe und ob frei
            setField();
            checkWinner();
            round++;
        } while (!win);
        showMatchField();
        System.out.println("\nSpiel ist beendet!");
    }

    private static boolean checkWinner() {
        for (int i = 0; i < 8; i++) {
            String line = switch (i) {
                case 0 -> fields[0] + fields[1] + fields[2];
                case 1 -> fields[3] + fields[4] + fields[5];
                case 2 -> fields[6] + fields[7] + fields[8];
                case 3 -> fields[0] + fields[3] + fields[6];
                case 4 -> fields[1] + fields[4] + fields[7];
                case 5 -> fields[2] + fields[5] + fields[8];
                case 6 -> fields[0] + fields[4] + fields[8];
                case 7 -> fields[2] + fields[4] + fields[6];
                default -> null;
            };
            if (line.equals("XXX")) {
                System.out.println("\nGratuliere! Spieler X hat nach " + round + " Runden gewonnen!\n");
                return win = true;
            }
            if (line.equals("OOO")) {
                System.out.println("\nSpieler O hat nach " + round + " Runden gewonnen!\n");
                return win = true;
            }
        }
        if (round == 8) {
            System.out.println("\nUnentschieden, Danke fürs spielen.\n");
            return win = true;
        }
        return win = false;
    }

    private static void setField() {
        String choiceString = String.valueOf(choice);
        if (fields[choice - 1].equals(choiceString) && player.equals("X")) {
            fields[choice - 1] = "X";
        }
        if (fields[choice - 1].equals(choiceString) && player.equals("O")) {
            fields[choice - 1] = "O";
        }
        player = (player.equals("X")) ? "O" : "X";
    }

    public static int userInput() {

        int choice = 0;
        boolean validInput = false;
        do {
            try {
                showMatchField();
                System.out.println("\nSpieler: " + player + " ist an der Reihe! ");
                System.out.print(">>>");
                choice = sc.nextInt();
                if (choice < 1 || choice > 9) {
                    System.out.println("\nUngültige Eingabe es sind nur Zahlen von 1-9 erlaubt.\nBitte versuchen Sie es erneut!\n");
                } else if (!fields[choice - 1].equals(String.valueOf(choice))) {
                    System.out.println("\nUngültige Eingabe dieses Feld ist bereits besetzt.\nBitte versuchen Sie es erneut!\n");
                } else {
                    validInput = true;
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nUngültige Eingabe es sind nur Zahlen von 1-9 erlaubt.\nBitte versuchen Sie es erneut!\n");
            }
            sc.nextLine();
        } while (!validInput);
        System.out.println();
        return choice;
    }

    public static void showMatchField() {
        System.out.println(fields[0] + " | " + fields[1] + " | " + fields[2]);
        System.out.println(fields[3] + " | " + fields[4] + " | " + fields[5]);
        System.out.println(fields[6] + " | " + fields[7] + " | " + fields[8]);
    }
}
