package lukas.week06.day4;

public class ArrayStatistics {
    private int max;
    private int min;
    private double avg;

    public ArrayStatistics() {

    }

    public ArrayStatistics(int max) {
        //this.max = max;
        this(max, 0);
    }

    public ArrayStatistics(int max, int min) {
        //this.max = max;
        //this.min = min;
        this(max, min, 0);
    }

    public ArrayStatistics(int max, int min, double avg) {
        this.max = max;
        this.min = min;
        this.avg = avg;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        //Wert verarbeiten, oder Exception werfen
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Minimum: " + min + "\nMaximum: " + max + "\nAverage: " + avg + "\n" + super.toString();
    }
}
