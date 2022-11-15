package viktor.week08.HomePractice3;

public class Rectangle implements Geometry {

    private double length;
    private double height;

    public Rectangle(double length, double height) {

        this.length = length;
        this.height = height;
    }

    @Override
    public double calculateCircumference() {

        return 2 * (length + height);
    }

    @Override
    public double calculateArea(){

        return length * height;
    }

}
