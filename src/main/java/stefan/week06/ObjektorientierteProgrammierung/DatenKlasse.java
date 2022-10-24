package stefan.week06.ObjektorientierteProgrammierung;

import java.util.Arrays;
import java.util.Random;

public class DatenKlasse {


    private int[] array;


    public DatenKlasse(int[] array) {
        this.array = array;


    }

    public int getMax() {
        int max = Integer.MIN_VALUE;
        for (int x : array) {
            if (x > max) {
                max = x;
            }

        }
        return max;

    }


    public int getMin() {

        int min = Integer.MAX_VALUE;
        for (int x : array) {
            if (x < min) {
                min = x;
            }
        }


        return min;
    }

    public double getdurschnitt() {
        double dur = 0;
        for (double x : array) {
            dur += x;


        }
        return dur / array.length;
    }




    public String toString() {
        return "max value ist: " +
                getMax() +
                " min value ist: " +
                getMin() + "der Durschnitt ist: " +
                getdurschnitt();


    }
}


