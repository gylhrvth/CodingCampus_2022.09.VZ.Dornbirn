package michel.week07.Homework.TicTacToe.WithAI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AI aI = new AI();

        String[] board = {"0","1","2","3","4","5","6","7","8"};

        Fields fields = new Fields(0,board);

        Scanner scanner = new Scanner(System.in);

        while (!aI.isTerminal(fields)){
            board[aI.minMaxDecision(fields)] = "X";
            if (!aI.isTerminal(fields)){
                drawBoard(fields);
                System.out.print(": ");
                int userInput = Integer.parseInt(scanner.nextLine());
                fields.changeState(userInput, "O");
            }
        }
        drawBoard(fields);
        System.out.println("Game is over");
    }

    public static void drawBoard(Fields fields){
        for (int i = 0; i < 7; i +=3) {
            System.out.println(fields.getStateIndex(i) + " | "
                    + fields.getStateIndex(i + 1) + " | " + fields.getStateIndex(i + 2));
        }
    }
}
