package lukas.week08.geometry;

public class Square implements Geometry {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateCircumference() {
        return 4 * sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}
