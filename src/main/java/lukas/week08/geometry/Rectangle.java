package lukas.week08.geometry;

public class Rectangle implements Geometry {
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculateCircumference() {
        return (length + height) * 2;
    }

    @Override
    public double calculateArea() {
        return length * height;
    }
}
