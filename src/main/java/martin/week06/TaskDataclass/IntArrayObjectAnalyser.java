package martin.week06.TaskDataclass;

public class IntArrayObjectAnalyser {
    /**
     * Determines the minimum, maximum
     * and arithmetic average of an int[].
     * Returns '0' in case of an empty array.
     */
    private static int lastID = 1;
    private int min;
    private float avg;
    private int max;
    private final String cReset = "\u001B[0m";
    private final String cLime = "\u001B[92m";

    public IntArrayObjectAnalyser(int[] arrayTo) {
        int id = lastID;
        ++lastID;
        avg = 0;
        double allValues = 0;
        if (arrayTo.length > 0) {
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            for (int a : arrayTo) {
                if (a < min) {
                    min = a;
                }
            }
            for (int b : arrayTo) {
                if (b > max) {
                    max = b;
                }
            }
            for (int c : arrayTo) {
                allValues += c;
            }
            avg = (float) allValues / arrayTo.length;
        } else {
            min = 0;
            max = 0;
        }
    }

    public int getMin() {
        return min;
    }

    public float getAvg() {
        return avg;
    }

    public int getMax() {
        return max;
    }

    @Override
    public String toString() {
        return String.format("%sMinimum:%s %d ", cLime, cReset, min) +
                String.format("%sAverage:%s %.1f ", cLime, cReset, avg) +
                String.format("%sMaximum:%s %d%n", cLime, cReset, max);
    }
}
