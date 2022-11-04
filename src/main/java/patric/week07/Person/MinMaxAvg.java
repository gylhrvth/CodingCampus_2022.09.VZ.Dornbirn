package patric.week07.Person;

public class MinMaxAvg {
    private double min;
    private double max;
    private double avg;

    public MinMaxAvg(double min, double max, double avg) {
        this.min = min;
        this.max = max;
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    @Override
    public String toString() {
        return "MinMaxAvg{" +
                "min=" + min +
                ", max=" + max +
                ", avg=" + avg +
                '}';
    }
}
