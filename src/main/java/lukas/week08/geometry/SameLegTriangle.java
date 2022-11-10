package lukas.week08.geometry;

public class SameLegTriangle implements Geometry {
    private double lengthA;
    private double lengthB;

    public SameLegTriangle(double lengthA, double lengthB) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
    }

    @Override
    public double calculateCircumference() {
        return 2 * lengthA + lengthA;
    }

    @Override
    public double calculateArea() {
        double h = Math.sqrt((lengthA * lengthA) - (lengthB / 2 * lengthB / 2));
        return (lengthB * h) / 2;
    }
}
