package michel.week07.Homework.TicTacToe.WithAI;

import java.util.ArrayList;

public class AI {
    public int minMaxDecision(Fields fields){
        ArrayList<Fields> possibleMoves = successorsOf(fields);
        ArrayList<Integer> movesList = new ArrayList<>();


        for (Fields field: possibleMoves) {
            movesList.add(minValue(field));
        }

        int max = movesList.get(0);
        int bestIndex = 0;

        for (int i = 1; i < movesList.size(); i++) {

            if( movesList.get(i) > max){
                max = movesList.get(i);
                bestIndex = i;
            }
        }

//        System.out.println(possibleMoves);
//        System.out.println(movesList);

        int action = possibleMoves.get(bestIndex).getPosition();
//        System.out.println("Action: " + action);
        return action;
    }

    //Sucht die beste Option für die AI
    private int maxValue(Fields fields){
        if (isTerminal(fields)){
            return utilityOf(fields);
        }
        int v = (int) -Double.POSITIVE_INFINITY;

        for (Fields possibleMove: successorsOf(fields)) {
            v = Math.max(v, minValue(possibleMove));
        }
//        System.out.println(v);
        return v;
    }

    //Sucht die beste Option für den Spieler
    private int minValue(Fields fields){
        if (isTerminal(fields)){
            return utilityOf(fields);
        }
        int v = (int) Double.POSITIVE_INFINITY;
        for (Fields possibleMove: successorsOf(fields)) {

            v = Math.min(v, maxValue(possibleMove));
        }
        return v;
    }

    //Gibt true zurück, wenn Spiel vorbei ist.
    public boolean isTerminal(Fields fields) {
        int takenSpots = 0;
        for (int a = 0; a < 9; a++) {
            if(fields.getStateIndex(a).equals("X") || fields.getStateIndex(a).equals("O") ){
                takenSpots++;
            }

            String line = checkState(fields, a);

            //Gewinner wird geprüft.
            if (line.equals("XXX")) {
                return true;
            } else if (line.equals("OOO")) {
                return true;
            }

            if(takenSpots == 9){

                return true;
            }
        }
        return false;
    }

    //Returns +1 if X is winner
    //Return -1 if O is winner
    //Returns 0 if no one won
    private int utilityOf(Fields fields){
        for (int a = 0; a < 8; a++) {
            String line = checkState(fields, a);
            //Check for Winners
            if (line.equals("XXX")) {
                return 1;
            } else if (line.equals("OOO")) {
                return -1;
            }
        }
        return 0;

    }

    //Alle Gewinn Möglichkeiten
    private String checkState(Fields fields, int a) {
        return switch (a) {
            case 0 -> fields.getStateIndex(0) + fields.getStateIndex(1) + fields.getStateIndex(2);
            case 1 -> fields.getStateIndex(3) + fields.getStateIndex(4) + fields.getStateIndex(5);
            case 2 -> fields.getStateIndex(6) + fields.getStateIndex(7) + fields.getStateIndex(8);
            case 3 -> fields.getStateIndex(0) + fields.getStateIndex(3) + fields.getStateIndex(6);
            case 4 -> fields.getStateIndex(1) + fields.getStateIndex(4) + fields.getStateIndex(7);
            case 5 -> fields.getStateIndex(2) + fields.getStateIndex(5) + fields.getStateIndex(8);
            case 6 -> fields.getStateIndex(0) + fields.getStateIndex(4) + fields.getStateIndex(8);
            case 7 -> fields.getStateIndex(2) + fields.getStateIndex(4) + fields.getStateIndex(6);
            default -> "";
        };
    }

    //Gibt alle möglichen Felder vom Spielfeld zurück
    private ArrayList<Fields> successorsOf(Fields fields){
        ArrayList<Fields> possibleMoves = new ArrayList<>();
        int xMoves = 0;
        int yMoves = 0;
        String player;

        //Calculate player turn
        for (String s: fields.getMatchField()) {
            if (s.equals("X")) {
                xMoves++;
            }else if(s.equals("O")){
                yMoves++;
            }
        }

        if(xMoves <= yMoves){
            player = "X";
        } else {
            player = "O";
        }

        //Create all possible states
        for (int i = 0; i < 9; i++) {
            String[] newState = fields.getMatchField().clone();

            if(newState[i] != "X" && newState[i] != "O"){
                newState[i] = player;
                possibleMoves.add(new Fields(i, newState));
            }
        }
        return possibleMoves;
    }
}
