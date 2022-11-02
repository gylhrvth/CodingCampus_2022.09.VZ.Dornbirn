package michel.week07.Homework.TicTacToe.WithAI;

import java.util.Arrays;

public class Fields {
    private int position;
    private String[] matchField;

    public Fields(int position, String[] matchField) {
        this.position = position;
        this.matchField = matchField;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String[] getMatchField() {
        return matchField;
    }

    public String getStateIndex(int i){
        return matchField[i];
    }

    public void setMatchField(String[] matchField) {
        this.matchField = matchField;
    }

    public void changeState(int i, String player){
        matchField[i] = player;
    }

    @Override
    public String toString() {
        return "State{" +
                "position=" + position +
                ", state=" + Arrays.toString(matchField) +
                '}';
    }
}

