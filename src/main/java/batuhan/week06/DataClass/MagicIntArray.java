package batuhan.week06.DataClass;

public class MagicIntArray {

    private int[] values;

    public MagicIntArray(int[] array) {
        values = array;
    }

    public String toString() {
        return "\nMax Value liegt bei: " + getMaxvalue() + "\n Min Value liegt bei: " + getMinvalue() + "\n Der Durchschnitt liegt bei: " + getAvgvalue();
    }


    public int getMinvalue() {
        int minvalue = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (minvalue > values[i]) {
                minvalue = values[i];
            }
        }
        return minvalue;
    }

    public int getMaxvalue() {
        int maxvalue = Integer.MIN_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > maxvalue) {
                maxvalue = values[i];
            }

        }
        return maxvalue;
    }

    public double getAvgvalue() {
        int sum = 0;
        for (int i : values)sum += i;

        return (double)sum/values.length;
    }
}
