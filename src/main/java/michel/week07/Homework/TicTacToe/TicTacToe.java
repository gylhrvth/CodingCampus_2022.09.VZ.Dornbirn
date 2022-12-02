package michel.week07.Homework.TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) {
        String player = "X";
        int round = 1;
        String[] fields = new String[9];
        for (int i = 0; i < fields.length; i++);
        boolean win = false;
        //Los gehts!
        System.out.println("\nWillkommen zum 3x3 TicTacToe!\n");
        while (!win) {
            int choice = userInput(player,fields); // geprüft, ob richtige Eingabe und ob frei
            setField(fields, choice, player);
            win = checkWinner(fields, round);
            round++;
            player = (player.equals("X")) ? "O" : "X";
        }
        showMatchField(fields);
        System.out.println("\nSpiel ist beendet!");
    }

    private static boolean checkWinner(String[] fields, int round) {
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
                return true;
            }
            if (line.equals("OOO")) {
                System.out.println("\nGratuliere! Spieler O hat nach " + round + " Runden gewonnen!\n");
                return true;
            }
        }
        if (round == 8) {
            System.out.println("\nSchade unentschieden, Danke fürs spielen.\n");
            return true;
        }
        return false;
    }

    private static void setField(String[] fields, int choice, String player) {
        String choiceString = String.valueOf(choice);
        if (fields[choice - 1].equals(choiceString) && player.equals("X")) {
            fields[choice - 1] = "X";
        }
        if (fields[choice - 1].equals(choiceString) && player.equals("O")) {
            fields[choice - 1] = "O";
        }
    }

    public static int userInput(String player, String [] fields) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean validInput = false;
        do {
            try {
                showMatchField(fields);
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

    public static void showMatchField(String[] fields) {
        System.out.println(fields[0] + " | " + fields[1] + " | " + fields[2]);
        System.out.println(fields[3] + " | " + fields[4] + " | " + fields[5]);
        System.out.println(fields[6] + " | " + fields[7] + " | " + fields[8]);
    }
}
